package schriftlichekontrolle.rechnungsverwaltung;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Utils {
    public String generateKundeId(){
        return UUID.randomUUID().toString();
    }
}