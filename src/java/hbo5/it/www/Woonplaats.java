package hbo5.it.www;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c1042421
 */
public class Woonplaats {
    private String straat_nr;
    private int postcode;
    private String gemeente;

    public Woonplaats() {
        straat_nr = "";
        postcode = 0;
        gemeente = "";
    }

    public Woonplaats(String straat_nr, int postcode, String gemeente) {
        this.straat_nr = straat_nr;
        this.postcode = postcode;
        this.gemeente = gemeente;
    }

    public String getStraat_nr() {
        return straat_nr;
    }

    public void setStraat_nr(String straat_nr) {
        this.straat_nr = straat_nr;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    @Override
    public String toString() {
        return straat_nr + " - " + postcode + " " + gemeente;
    }
}
