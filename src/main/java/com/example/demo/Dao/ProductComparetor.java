package com.example.demo.Dao;

import com.example.demo.model.Product;

import java.util.Comparator;

class ProductComparator implements Comparator<Product> {

    public int compare(Product a,Product b)
    {
        return a.getCatalog().compareTo(
                b.getCatalog());
    }
}
