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
        id = counter++;
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
        List<Product> products = new ArrayList<>();
        for(int i = 0; i < warehouse.productList.size();i++){
            if(warehouse.productList.get(i).getSupplier().getName().equals(getName())){
                products.add(warehouse.productList.get(i));
            }
        }
        return products;
    }

    @Override
    public String toString() {
        return "Supplier: id: " + getId() + ", name: " + getName() + ", description: " + getDescription();
    }


}
