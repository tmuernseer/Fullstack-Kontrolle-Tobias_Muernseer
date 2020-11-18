package schriftlichekontrolle.rechnungsverwaltung.model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import java.awt.*;
import java.util.ArrayList;

@Entity
@Table(name = "kunde")
public class Kunde {

    @Id
    private Long id;
    @NotNull
    private String vorName;
    @NotNull
    private String nachName;
    @NotNull
    private ArrayList<Rechnung> rechnungen;

    protected Kunde(){}

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
