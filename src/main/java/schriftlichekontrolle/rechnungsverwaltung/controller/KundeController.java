package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schriftlichekontrolle.rechnungsverwaltung.exception.ResourceNotFoundException;
import schriftlichekontrolle.rechnungsverwaltung.model.Kunde;
import schriftlichekontrolle.rechnungsverwaltung.repository.KundeRepository;

@RestController
public class KundeController {

    @Autowired
    private KundeRepository kundeRepository;

    @GetMapping("/kunden")
    public Page<Kunde> getAllBrands(Pageable pageable) {
        return kundeRepository.findAll(pageable);
    }

    @PostMapping("/kunden")
    public Kunde createBrand(@RequestBody Kunde kunde) {
        return kundeRepository.save(kunde);
    }

    @PutMapping("/kunden/{kundeid}")
    public Kunde updateBrand(@PathVariable Long kundeid, @RequestBody Kunde kundeRequest) {
        return kundeRepository.findById(kundeid).map(kunde -> {
            kunde.setVorName(kundeRequest.getVorName());
            kunde.setNachName(kundeRequest.getNachName());
            kunde.setRechnungen(kundeRequest.getRechnungen());
            return kundeRepository.save(kunde);
        }).orElseThrow(() -> new ResourceNotFoundException("Kunde ID " + kundeid + " not found"));
    }

    @DeleteMapping("/kunden/{kundeid}")
    public ResponseEntity<?> deleteBrand(@PathVariable Long kundeid) {
        return kundeRepository.findById(kundeid).map(kunde -> {
            kundeRepository.delete(kunde);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new ResourceNotFoundException("Kunde ID " + kundeid + " not found"));
    }

}
