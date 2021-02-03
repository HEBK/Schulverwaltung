package eu.flrkv.schoolmanagement;

import java.util.ArrayList;

public class Lehrer extends Person {

    // VARS
    private ArrayList<Schulfach> schulfaecher = new ArrayList<Schulfach>();
    private ArrayList<Klasse> klassen = new ArrayList<Klasse>();

    public Lehrer(String pPrename, String pLastname, Schulfach[] pSchulfaecher, Klasse[] pKlassen) {
        super(pPrename, pLastname);
        for (Schulfach f: pSchulfaecher) {
            this.addSchulfach(f);
        }
        for (Klasse k: pKlassen) {
            this.addKlasse(k);
        }
    }

    public void addSchulfach(Schulfach pSchulfach) {
        this.schulfaecher.add(pSchulfach);
    }

    public void addKlasse(Klasse pKlasse) {
        this.klassen.add(pKlasse);
    }
}
