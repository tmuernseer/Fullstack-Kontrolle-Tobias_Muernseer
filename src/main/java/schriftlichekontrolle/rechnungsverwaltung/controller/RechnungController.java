package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import schriftlichekontrolle.rechnungsverwaltung.repository.RechnungRepository;

@RestController
public class RechnungController {

    @Autowired
    private RechnungRepository rechnungRepository;
}
