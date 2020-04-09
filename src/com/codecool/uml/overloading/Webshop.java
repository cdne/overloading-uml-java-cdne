package com.codecool.uml.overloading;

import java.util.Currency;

public class Webshop {

    public static void main(String[] args) {
        //        Adding product categories
        ProductCategory productCategory1 = new ProductCategory("Computer & Accessories", "Electronics",
                "Computer accessories and components");
        ProductCategory dogsCategory = new ProductCategory("Dogs", "Pet Supplies",
                "Supplies for dogs");
        ProductCategory productCategory3 = new ProductCategory("Laptop Bags", "Luggage",
                "Bags for laptop");

        //        Adding suppliers
        Supplier amazon = new Supplier();
        amazon.setName("Amazon");
        amazon.setDescription("Products sold on Amazon");
        Supplier emag = new Supplier();
        emag.setName("Emag");
        emag.setDescription("Products sold on Emag");
        Supplier ikea = new Supplier();
        ikea.setName("Ikea");
        ikea.setDescription("Products sold by Ikea");

//        Adding product 1
        Product product1 = new Product();
        product1.setName("Nobby Classic Preno Royal 80640-15 Harness");
        product1.setDefaultPrice(13);
        product1.setDefaultCurrency(Currency.getInstance("USD"));
        product1.setSupplier(amazon);
        product1.setProductCategory(dogsCategory);


//        Adding product 2
        Product product2 = new Product();
        product2.setName("21");
        product2.setDefaultPrice(133);
        product2.setDefaultCurrency(Currency.getInstance("USD"));
        product2.setSupplier(amazon);
        product2.setProductCategory(dogsCategory);


        Warehouse warehouse = new Warehouse();
        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        System.out.println(warehouse.getProducts());
    }
}
