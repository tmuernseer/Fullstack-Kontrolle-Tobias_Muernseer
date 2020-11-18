package schriftlichekontrolle.rechnungsverwaltung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schriftlichekontrolle.rechnungsverwaltung.controller.KundeService;
import schriftlichekontrolle.rechnungsverwaltung.model.Kunde;

@Repository
public interface KundeRepository extends JpaRepository<Kunde, Long> {

}