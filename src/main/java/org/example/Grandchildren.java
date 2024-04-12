package org.example;

import java.util.Date;

public final class Grandchildren extends Children{
    private String hobby;

    public Grandchildren(Motherland home, Date dateOfBirth, Height height, String name, int income, String hobby) {
        super(home, dateOfBirth, height, name,income);
        this.hobby = hobby;

    }
    public String getHobby() {
        return hobby;
    }
    public void speak(){
        System.out.println("My profession is ");
    }
    public String getInfo() {
        return super.getInfo() +
                "\nHobby: " + hobby;
    }

}
