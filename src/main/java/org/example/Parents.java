package org.example;

import java.util.Date;

public class Parents {
    private Date DateOfBirth;
    private Height height;
    private String name;
    private Motherland home;

    public Parents(Motherland home, Date dateOfBirth, Height height,String name) {
        this.home = home;
        this.DateOfBirth = dateOfBirth;
        this.height = height;
        this.name = name;
    }

    public Motherland getHome() {
        return home;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public Height getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
    public String getInfo() {
        return "Name: " + name +
                "\nDate of Birth: " + DateOfBirth +
                "\nHeight: " + height +
                "\nHome: " + home.getCountry() + ", " + home.getAddress();
    }

}
