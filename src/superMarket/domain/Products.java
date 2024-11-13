package superMarket.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Products {
    private String name;
    private double value;
    private int ID;
    private static int idCounter = 0;

    public Products(String name, double value) {
        this.name = name;
        this.value = value;
        this.ID = ID+idCounter++;
    }

    public Products() {
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Value: " + value + ", ID: " + ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
