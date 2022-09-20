package com.example.demo.service;

import com.example.demo.Dao.Products;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


//This is a service class who implements methods according to the Specific Interface
@Service
public class ProductService {

    private final Products productDao;

    @Autowired
    public ProductService(@Qualifier("Dao") Products productDao){
        this.productDao = productDao;
    }

    public boolean addProduct(int id,String name,String description,int price,String color,String catalog,int warranty_amount,String warranty_time_period){
        return productDao.addProduct(id,name,description,price,color,catalog,warranty_amount,warranty_time_period);

    }

    public List<Product> selectAllProduct(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("productsDB.txt"));
            while (scanner.hasNextLine()) {
                int id  = Integer.parseInt(scanner.nextLine());
                String name  = scanner.nextLine();
                String  description= scanner.nextLine();
                int  price= Integer.parseInt(scanner.nextLine());
                String  color= scanner.nextLine();
                String  catalog= scanner.nextLine();
                int  warranty_amount= Integer.parseInt(scanner.nextLine());
                String warranty_time_period = scanner.nextLine();
                scanner.nextLine();
                productDao.addProduct(id,name,description,price,color,catalog,warranty_amount,warranty_time_period);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return productDao.selectAllProducts();
    }

    public Optional<Product> getProductById(int id){
        return productDao.selectProductByid(id);
    }

    public boolean deleteProduct(int id){
        return productDao.deleteProductById(id);
    }

    public boolean updateProduct(Product productToUpdate){
        return productDao.UpdateProduct(productToUpdate);
    }
    }


