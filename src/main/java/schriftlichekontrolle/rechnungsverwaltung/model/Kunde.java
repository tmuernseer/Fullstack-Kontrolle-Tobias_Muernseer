package schriftlichekontrolle.rechnungsverwaltung.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Kunde")
public class Kunde {

    @Id
    private Long id;
    @NotNull
    private String vorName;
    @NotNull
    private String nachName;
    @OneToMany
    @JoinColumn(name = "Rechnung")
    private List<Rechnung> rechnungen;

    public Kunde(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public ArrayList<Rechnung> getRechnungen() {
        return rechnungen;
    }

    public void setRechnungen(ArrayList<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }
}
