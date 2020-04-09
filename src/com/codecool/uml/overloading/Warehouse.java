package com.codecool.uml.overloading;

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
        List<Product> productCategoryList = new ArrayList<>();
        for (Product value : productList) {
            if (value.getProductCategory().getName().equals(product.getName())) {
                productCategoryList.add(value);
            }
        }
        return productCategoryList;
    }
    List<Product> getAllProductsBy(Supplier supplier){
        List<Product> productsBySupplier = new ArrayList<>();
        for (Product value : productList) {
            if (value.getSupplier().getName().equals(supplier.getName())) {
                productsBySupplier.add(value);
            }
        }
        return productsBySupplier;
    }

}
