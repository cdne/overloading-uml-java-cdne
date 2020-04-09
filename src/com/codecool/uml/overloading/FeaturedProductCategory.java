package com.codecool.uml.overloading;


import java.text.SimpleDateFormat;
import java.util.Date;

public class FeaturedProductCategory extends ProductCategory{
    Date startDate = new Date();
    Date endDate = new Date();

    void schedule(String startDate, String endDate){
        SimpleDateFormat objSDF = new SimpleDateFormat("dd-mm-yyyy");

    }

    @Override
    public String toString(){
        return "FeaturedProductCategory:"+"id: " + getId() + ", name: " + getName() + ", department: " + getDepartment() +
                ", description: " + getDescription() + ", startDate: " + startDate + ", endDate: " + endDate;
    }
}
