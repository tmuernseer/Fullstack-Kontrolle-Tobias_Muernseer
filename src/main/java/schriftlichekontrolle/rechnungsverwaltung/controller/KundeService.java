package schriftlichekontrolle.rechnungsverwaltung.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import schriftlichekontrolle.rechnungsverwaltung.Utils;
import schriftlichekontrolle.rechnungsverwaltung.model.Kunde;
import schriftlichekontrolle.rechnungsverwaltung.model.requests.KundeRequest;

import java.util.HashMap;
import java.util.Map;

@Service
public class KundeService {

    private static Utils utils;
    private static HashMap<String, Kunde> kunden;

    public KundeService(){}

    @Autowired
    public KundeService(Utils utils){
        this.utils = utils;
    }

    public Kunde createKunde(KundeRequest userDetails){

        Kunde returnValue = new Kunde();
        returnValue.setVorName(userDetails.getVorName());
        returnValue.setNachName(userDetails.getNachName());
        returnValue.setRechnungen(userDetails.getRechnung());

        String kundeid = utils.generateKundeId();
        returnValue.setID(kundeid);
        if(kunden == null) kunden = new HashMap<>();
        kunden.put(kundeid, returnValue);

        return returnValue;
    }

}