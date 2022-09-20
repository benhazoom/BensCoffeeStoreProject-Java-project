package com.example.demo.Dao;


import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

//We are using Interface, so we could implement our product with various types of products. This concept is called looseType
public interface IProduct {

    boolean addProduct(int id,String name,String description,int price,String color,String catalog,int warranty_amount,String warranty_time_period);
    List<Product> selectAllProducts();
    public Optional<Product> selectProductByid(int id);
    boolean deleteProductById(int id);
    public boolean UpdateProduct(Product ProductToUpdate);

}
