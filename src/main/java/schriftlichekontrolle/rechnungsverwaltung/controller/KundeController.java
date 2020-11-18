package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
