package eu.flrkv.schoolmanagement;

public class Person {

    private String prename;
    private String lastname;

    public Person(String prename, String lastname) {
        this.setLastname(lastname);
        this.setPrename(prename);
    }


    public String getLastname() {
        return lastname;
    }

    public String getPrename() {
        return prename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }


}
