package eu.flrkv.schoolmanagement;

import java.util.ArrayList;

public class Teacher extends Person {

    // VARS
    private ArrayList<Subject> schulfaecher = new ArrayList<Subject>();
    private ArrayList<Class> klassen = new ArrayList<Class>();

    public Teacher(String pPrename, String pLastname, Subject[] pSchulfaecher, Class[] pKlassen) {
        super(pPrename, pLastname);
        for (Subject f: pSchulfaecher) {
            this.addSchulfach(f);
        }
        for (Class k: pKlassen) {
            this.addKlasse(k);
        }
    }

    public void addSchulfach(Subject pSubject) {
        this.schulfaecher.add(pSubject);
    }

    public void addKlasse(Class pClass) {
        this.klassen.add(pClass);
    }
}
