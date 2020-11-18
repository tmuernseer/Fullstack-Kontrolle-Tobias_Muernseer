package schriftlichekontrolle.rechnungsverwaltung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import schriftlichekontrolle.rechnungsverwaltung.model.Kunde;
import schriftlichekontrolle.rechnungsverwaltung.model.requests.KundeRequest;
import schriftlichekontrolle.rechnungsverwaltung.repository.KundeRepository;

import java.util.Map;


@RestController
@RequestMapping("/users") // http://localhost:8080/users
public class KundeController {

    Map<String, Kunde> kunden;

    @Autowired
    KundeService kundeService;

    @GetMapping(path="/{kundeid}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            })
    public ResponseEntity<Kunde> getUser(@PathVariable String kundeid)
    {
        String vorName = null;
        //
        //
        int vorNemaLenght = vorName.length();


        if(kunden.containsKey(kundeid))
        {
            return new ResponseEntity<Kunde>(kunden.get(kundeid), HttpStatus.OK);
        } else {
            return new ResponseEntity<Kunde>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping(path = "/{kundeid}")
    public String getUsers(@RequestBody KundeRequest kundeDetails)

    {
        return "get Mapping";
    }

    @PostMapping (consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    }, produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    })
    public ResponseEntity<Kunde> createUser(@RequestBody KundeRequest kundeDetails)
    {
        Kunde returnValue = kundeService.createKunde(kundeDetails);
        return new ResponseEntity<Kunde>(returnValue, HttpStatus.OK);
    }

    @PutMapping (path="/{kundeid}",consumes = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    }, produces = {
            MediaType.APPLICATION_XML_VALUE,
            MediaType.APPLICATION_JSON_VALUE
    })
    public Kunde updateUser(@PathVariable String kundeid, @RequestBody KundeRequest userDetails)
    {
        Kunde storedUserDetails = kunden.get(kundeid);
        storedUserDetails.setVorName(userDetails.getVorName());
        storedUserDetails.setNachName(userDetails.getNachName());

        kunden.put(kundeid, storedUserDetails);

        return storedUserDetails;
    }

    @DeleteMapping(path="/{kundeid}")
    public ResponseEntity<Void> deleteUser(@PathVariable String id)
    {
        kunden.remove(id);
        return ResponseEntity.noContent().build();
    }

}
