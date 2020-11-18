package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schriftlichekontrolle.rechnungsverwaltung.model.Rechnung;
import schriftlichekontrolle.rechnungsverwaltung.repository.RechnungRepository;

import java.util.List;

@Service
public class RechnungService {
    @Autowired
    private RechnungRepository repo;

    public List<Rechnung> listAll(){
        return repo.findAll();
    }

    public void save(Rechnung rechnung){
        repo.save(rechnung);
    }

    public Rechnung get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }
}
