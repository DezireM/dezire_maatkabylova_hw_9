package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Children objectA = new Children(new Motherland("USA", "123 Main St"),
                new Date(1999 - 1900, 5, 10),
                Height.TALL, "John", 50000);
        Grandchildren objectB = new Grandchildren(new Motherland("Canada", "456 Avenue"),
                new Date(1994 - 1900, 8, 15),
                Height.MIDDLE, "Alice", 60000, "Painting");
        Grandchildren objectC = new Grandchildren(new Motherland("UK", "789 Edinburgh St"),
                new Date(2004 - 1900, 3, 20),
                Height.SHORT, "Bob", 40000, "Gardening");
        System.out.println("Object A: "  +  objectA.getInfo());
        System.out.println();
        System.out.println("Object B: "  +  objectB.getInfo());
        System.out.println();
        System.out.println("Object C: "  +  objectC.getInfo());
    }
}


