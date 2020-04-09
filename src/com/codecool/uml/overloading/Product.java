package com.codecool.uml.overloading;

import java.util.Currency;

public class Product {
    private static int counter;
    private int id;
    private String name;
    private float defaultPrice;
    private Currency defaultCurrency;
    private ProductCategory productCategory;
    private Supplier supplier;

    Product(){
        id = counter++;
    }

    Product(String name, float defaultPrice, Currency defaultCurrency){
        id++;
        setName(name);
        setDefaultPrice(defaultPrice);
        setDefaultCurrency(defaultCurrency);
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

    public float getDefaultPrice() {
        return defaultPrice;
    }

    public void setDefaultPrice(float defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public Currency getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Currency defaultCurrency) {
        this.defaultCurrency =defaultCurrency;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString(){
        return "Product:"+"id: " + getId() + ", name: " + getName() + ", price: " + getDefaultPrice() + " " +
                getDefaultCurrency() + ", supplier: "
                + supplier.getName() + ", productCategory: " + productCategory.getName();
    }
}

