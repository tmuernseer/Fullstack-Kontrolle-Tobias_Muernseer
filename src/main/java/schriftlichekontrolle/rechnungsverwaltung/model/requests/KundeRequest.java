package schriftlichekontrolle.rechnungsverwaltung.model.requests;

import schriftlichekontrolle.rechnungsverwaltung.model.Rechnung;

import java.util.List;

public class KundeRequest {
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
}
