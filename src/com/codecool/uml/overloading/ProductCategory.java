package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    private static int counter;
    private int id;
    private String name;
    private String department;
    private String description;

    ProductCategory() {
        id = counter++;
    }

    ProductCategory(String name, String department, String description){
        id = counter++;
        setName(name);
        setDepartment(department);
        setDescription(description);
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    List<Product> getProducts(Warehouse warehouse){

        return new ArrayList<>();
    }

    @Override
    public String toString() {
        return "";
    }
}
