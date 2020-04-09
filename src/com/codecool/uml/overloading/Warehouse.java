package com.codecool.uml.overloading;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Product> productList = new ArrayList<>();

    void addProduct(Product product){
        productList.add(product);
    }

    List<Product> getProducts(){
        return productList;
    }

    List<Product> getAllProductsBy(ProductCategory product){
        return productList;
    }
    List<Product> getAllProductsBy(Supplier supplier){
        return new ArrayList<>();

    }

}
