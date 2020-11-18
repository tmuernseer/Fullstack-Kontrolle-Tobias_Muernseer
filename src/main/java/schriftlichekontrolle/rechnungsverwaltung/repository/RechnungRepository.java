package schriftlichekontrolle.rechnungsverwaltung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import schriftlichekontrolle.rechnungsverwaltung.model.Rechnung;

@Repository
public interface RechnungRepository extends JpaRepository<Rechnung, Long> {

}