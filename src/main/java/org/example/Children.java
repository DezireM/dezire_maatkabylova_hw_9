package org.example;

import java.util.Date;

public class Children extends Parents {
    private int income;

    public Children(Motherland home, Date dateOfBirth, Height height, String name, int income) {
        super(home, dateOfBirth,height,name);
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void speak(){
        System.out.println("I work ");
    }
    public final void speak(String profession){
        System.out.println("I work " + " as a " + profession);

    }
    public String getInfo() {
        return super.getInfo() +
                "\nIncome: " + income;
    }
}

