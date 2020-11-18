package schriftlichekontrolle.rechnungsverwaltung.model.requests;

import schriftlichekontrolle.rechnungsverwaltung.model.Rechnung;

import java.util.List;

public class KundeRequest {
    private String id;
    private String vorName;
    private String nachName;
    private List<Rechnung> rechnungen;

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

    public List<Rechnung> getRechnung() {
        return rechnungen;
    }

    public void setRechnungen(List<Rechnung> rechnungen) {
        this.rechnungen = rechnungen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Rechnung> getRechnungen() {
        return rechnungen;
    }
}
