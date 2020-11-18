package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schriftlichekontrolle.rechnungsverwaltung.model.Kunde;
import schriftlichekontrolle.rechnungsverwaltung.repository.KundeRepository;

import java.util.List;

@Service
public class KundeService {
    @Autowired
    private KundeRepository repo;

    public List<Kunde> listAll(){
        return repo.findAll();
    }

    public void save(Kunde kunde){
        repo.save(kunde);
    }

    public Kunde get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}