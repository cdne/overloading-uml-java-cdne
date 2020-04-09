package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private static int counter;
    private int id;
    private String name;
    private String description;

    Supplier() {
        id = counter++;
    }

    Supplier(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    List<Product> getProducts(Warehouse warehouse) {
        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "";
    }


}
