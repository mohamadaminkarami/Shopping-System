package main.java.models;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Saleable implements Comparable<Saleable> {
    private static final ArrayList<Saleable> allItems = new ArrayList<>();
    private static int idCounter = 0;

    // static {
    // System.out.println("hi");
    // allItems = new ArrayList<>();
    // }

    private final int uniqueId;
    private String name;
    private int price;

    public Saleable(String name, int price) {
        this.uniqueId = ++idCounter;
        this.name = name;
        this.price = price;
        Saleable.allItems.add(this);
    }

    public static ArrayList<Saleable> getAllItems() {
        Collections.sort(Saleable.allItems);
        return Saleable.allItems;
    }

    public int getUniqueId() {
        return this.uniqueId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Saleable obj) {
        if (!this.getName().equals(obj.getName())) {
            return this.getName().compareTo(obj.getName());
        }
        if (this.getPrice() > obj.getPrice())
            return 1;

        if (this.getPrice() < obj.getPrice())
            return -1;

        return 0;
    }

    @Override
    public String toString() {
        return "id: " + this.getUniqueId() + "| name: " + this.getName() + "| price: " + this.getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Saleable)) {
            return false;
        }

        Saleable saleable = (Saleable) obj;

        return this.getName().equals(saleable.getName()) && this.getPrice() == saleable.getPrice();
    }

}
