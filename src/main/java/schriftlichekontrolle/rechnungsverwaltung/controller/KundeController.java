package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import schriftlichekontrolle.rechnungsverwaltung.repository.KundeRepository;

@RestController
public class KundeController {

    @Autowired
    private KundeRepository kundeRepository;
}
