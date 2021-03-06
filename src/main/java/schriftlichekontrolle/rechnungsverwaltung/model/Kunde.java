package schriftlichekontrolle.rechnungsverwaltung.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "KUNDE")
public class Kunde {

    @Id
    private String id;
    @NotNull
    private String vorName;
    @NotNull
    private String nachName;
    @OneToMany
    @JoinColumn(name = "Rechnung")
    private List<Rechnung> rechnungen;

    public Kunde(){}

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Rechnung> getRechnungen() {
        return rechnungen;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }

    public void setID(String kundeid) {
        this.id = id;
    }
}
