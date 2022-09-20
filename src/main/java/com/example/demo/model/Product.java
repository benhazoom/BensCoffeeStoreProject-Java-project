package com.example.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;

//This class is Java side Product object type
public class Product {

    private int id;
    private String name;
    private String description;
    private int price;
    private String color;
    private String catalog;
    private int warranty_amount;
    private String warranty_time_period;

    public Product(@JsonProperty("id")                      int id,
                   @JsonProperty("name")                    String name,
                   @JsonProperty("description")             String description,
                   @JsonProperty("price")                   int price,
                   @JsonProperty("color")                   String color,
                   @JsonProperty("catalog")                 String catalog,
                   @JsonProperty("warranty_amount")         int warranty_amount,
                   @JsonProperty("warranty_time_period")    String warranty_time_period)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.color = color;
        this.catalog = catalog;
        this.warranty_amount = warranty_amount;
        this.warranty_time_period = warranty_time_period;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public int getWarranty_amount() {
        return warranty_amount;
    }

    public void setWarranty_amount(int warranty_amount) {
        this.warranty_amount = warranty_amount;
    }

    public String getWarranty_time_period() {
        return warranty_time_period;
    }

    public void setWarranty_time_period(String warranty_time_period) {
        this.warranty_time_period = warranty_time_period;
    }
}
