package eu.flrkv.schoolmanagement;

public class Main {

    public static void main(String[] args) {


        Lehrer l = new Lehrer("Markus", "Lanz", new Schulfach[]{new Schulfach(), new Schulfach()}, new Klasse[]{new Klasse()});


        System.out.println(l.getPrename());
    }
}
