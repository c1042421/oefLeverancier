package hbo5.it.www;

import hbo5.it.www.Woonplaats;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c1042421
 */
public class Leverancier {
    private String naam;
    private String contactpersoon;
    private Woonplaats locatie;

    public Leverancier() {
        naam = "";
        contactpersoon = "";
        locatie = null;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getContactpersoon() {
        return contactpersoon;
    }

    public void setContactpersoon(String contactpersoon) {
        this.contactpersoon = contactpersoon;
    }

    public Woonplaats getLocatie() {
        return locatie;
    }

    public void setLocatie(Woonplaats locatie) {
        this.locatie = locatie;
    }

    @Override
    public String toString() {
        return naam + " " + contactpersoon + " " + locatie.toString() ;
    }
}
