package schriftlichekontrolle.rechnungsverwaltung.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Rechnung")
public class Rechnung {

    @Id
    private Long id;

    @NotNull
    private Long Rechnungsnummer;
    @NotNull
    private Date Rechnungsdatum;
    @NotNull
    private Long Rechnungsbetrag;
    @ManyToOne
    @JoinColumn(name = "Kunde")
    private Kunde kunde;

    public Rechnung(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRechnungsnummer() {
        return Rechnungsnummer;
    }

    public void setRechnungsnummer(Long rechnungsnummer) {
        Rechnungsnummer = rechnungsnummer;
    }

    public Date getRechnungsdatum() {
        return Rechnungsdatum;
    }

    public void setRechnungsdatum(Date rechnungsdatum) {
        Rechnungsdatum = rechnungsdatum;
    }

    public Long getRechnungsbetrag() {
        return Rechnungsbetrag;
    }

    public void setRechnungsbetrag(Long rechnungsbetrag) {
        Rechnungsbetrag = rechnungsbetrag;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
