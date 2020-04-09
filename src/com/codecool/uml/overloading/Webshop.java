package com.codecool.uml.overloading;

import java.util.Currency;

public class Webshop {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        //        Adding product categories
        ProductCategory computerAndAccessoriesCategory = new ProductCategory("Computer & Accessories",
                "Electronics",
                "Computer accessories and components");
        ProductCategory dogs = new ProductCategory("Dogs", "Pet Supplies",
                "Supplies for dogs");

        ProductCategory laptopBagsCategory = new ProductCategory();
        laptopBagsCategory.setName("Laptop Bags");
        laptopBagsCategory.setDepartment("Luggage");
        laptopBagsCategory.setDescription("Bags for laptop");


        //        Adding suppliers
        Supplier amazon = new Supplier();
        amazon.setName("Amazon");
        amazon.setDescription("Products sold by Amazon");
        Supplier costco = new Supplier();
        costco.setName("Costco");
        costco.setDescription("Products sold by Costco");
        Supplier ikea = new Supplier("Ikea", "Products sold by Ikea");


//        Adding product 1
        Product product1 = new Product();
        product1.setName("Nobby Classic Preno Royal 80640-15 Harness");
        product1.setDefaultPrice(13.1f);
        product1.setDefaultCurrency(Currency.getInstance("USD"));
        product1.setSupplier(amazon);
        product1.setProductCategory(dogs);

//        Adding product 2
        Product product2 = new Product();
        product2.setName("Corsair RGB LED Fan");
        product2.setDefaultPrice(9.3f);
        product2.setDefaultCurrency(Currency.getInstance("USD"));
        product2.setSupplier(costco);
        product2.setProductCategory(computerAndAccessoriesCategory);

//        Adding product 3
        Product product3 = new Product();
        product3.setName("Logitech G PRO Wireless Gaming Mouse");
        product3.setDefaultPrice(95.21f);
        product3.setDefaultCurrency(Currency.getInstance("USD"));
        product3.setSupplier(costco);
        product3.setProductCategory(computerAndAccessoriesCategory);

//        Adding product 4
        Product product4 = new Product("Philips SmartClean Cleaning Cartridge Pack", 31.14f,
                Currency.getInstance("USD"));
        product4.setSupplier(amazon);
        product4.setProductCategory(computerAndAccessoriesCategory);

//        Adding product 5
        Product product5  = new Product("Best laptop bag in 2020", 250.21f,
                Currency.getInstance("USD"));
        product5.setSupplier(ikea);
        product5.setProductCategory(laptopBagsCategory);

//        Adding products to warehouse
        warehouse.addProduct(product1);
        warehouse.addProduct(product2);
        warehouse.addProduct(product3);
        warehouse.addProduct(product4);
        warehouse.addProduct(product5);

//        All products in warehouse
        System.out.println("Show all products in warehouse");
        System.out.println(warehouse.getProducts() + "\n");

//        Show all products by specific category
        System.out.println("Products from category computers and accessories");
        System.out.println(warehouse.getAllProductsBy(computerAndAccessoriesCategory) + "\n");

//        Show all products by specific category
        System.out.println("Products from supplier ikea");
        System.out.println(warehouse.getAllProductsBy(ikea) + "\n");

//        Products from costco supplier
        System.out.println("Display all products by supplier costco");
        System.out.println(costco.getProducts(warehouse) + "\n");

//        Products from dogs category
        System.out.println("Display all products for dog category");
        System.out.println(dogs.getProducts(warehouse) + "\n");

        FeaturedProductCategory featuredProductCategory = new FeaturedProductCategory();

        featuredProductCategory.setName("Feature Category");
        featuredProductCategory.setDepartment("Category");
        featuredProductCategory.setDescription("featured category");



        }
}
