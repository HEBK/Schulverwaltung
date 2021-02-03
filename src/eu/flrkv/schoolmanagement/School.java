package eu.flrkv.schoolmanagement;

import java.util.ArrayList;

public class School {

    private static int schoolQuantity = 0;
    private int schoolNumber;

    private String schoolName;
    private String address;
    private String city;

    private ArrayList<Room> rooms;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Subject> subjects;


    /**
     * Contructor of class Schule
     */
    public School(String pSchoolName, String pAddress, String pCity)
    {
        this.schoolNumber = School.increaseSchoolQuantity();
    }

    /**
     * Increases the school quantity by one
     * @return Returns the new school quantity as integer
     */
    public static int increaseSchoolQuantity()
    {
        School.schoolQuantity++;
        return School.schoolQuantity;
    }

    /**
     * Decreases the school quantity by one
     * @return Returns true if a school exist and could be deleted
     */
    public static boolean decreaseSchoolQuantity()
    {
        if (School.schoolQuantity > 0) {
            School.schoolQuantity--;
            return true;
        }
        return false;
    }

    /**
     * Gets the current school quantity
     * @return Returns the current school quantity as integer
     */
    public static int getSchoolQuantity()
    {
        return School.schoolQuantity;
    }


    /**
     * Gets the school number of the current school
     * @return Returns the number of the school as integer
     */
    public int getSchoolNumber()
    {
        return this.schoolNumber;
    }


}
