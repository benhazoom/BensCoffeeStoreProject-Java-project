package com.example.demo.Dao;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//This class is a repository for saving the object in DB locally!
//pulles data from DB and manipulates it locally?
@Repository("Dao")
public class Products implements IProduct {

    private static List<Product> products = new ArrayList<>();


    @Override
    public boolean addProduct(int id, String name, String description, int price, String color, String catalog,
                              int warranty_amount, String warranty_time_period) {
        if (selectProductByid(id).isPresent())
            return false;// is such product exists do not add again
        else {
            products.add(new Product(id, name, description, price, color, catalog, warranty_amount, warranty_time_period));
            ProductsToDB(products);
            return true;
        }}

    @Override
    public List<Product> selectAllProducts() {
        return products;
    }

    @Override
    public Optional<Product> selectProductByid(int id) {
        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    // this method deletes a product when given its id
    // returns false if there is no such product with given id or true if deletion
    // is succeeded
    @Override
    public boolean deleteProductById(int id) {
        Optional<Product> ProductToDelete = selectProductByid(id);
        if (ProductToDelete.isEmpty())
            return false;
        else {
            products.remove(ProductToDelete.get());
            ProductsToDB(products);
            return true;
        }
    }

    @Override
    public boolean UpdateProduct(Product ProductToUpdate) {

        return selectProductByid(ProductToUpdate.getId())
                .map(product -> {
                    int indexOfProductToUpdate = products.indexOf(product);
                    if (indexOfProductToUpdate >= 0) { // the product exists in DB
                        products.set(indexOfProductToUpdate, new Product(
                                ProductToUpdate.getId(),
                                ProductToUpdate.getName(),
                                ProductToUpdate.getDescription(),
                                ProductToUpdate.getPrice(),
                                ProductToUpdate.getColor(),
                                ProductToUpdate.getCatalog(),
                                ProductToUpdate.getWarranty_amount(),
                                ProductToUpdate.getWarranty_time_period()));
                        ProductsToDB(products);
                        return true; // successful update
                    }
                    return false;// unsuccessful for some reason
                })
                .orElse(false);// if there is not such product
    }

    public void ProductsToDB(List<Product> products) {
        try (FileWriter locFile = new FileWriter("productsDB.txt")) {
            for (Product p : products) {
                locFile.write(p.getId()+ "\n");
                locFile.write(p.getName()+ "\n");
                locFile.write(p.getDescription()+ "\n");
                locFile.write(p.getPrice()+ "\n");
                locFile.write(p.getColor()+ "\n");
                locFile.write(p.getCatalog()+ "\n");
                locFile.write(p.getWarranty_amount()+ "\n");
                locFile.write(p.getWarranty_time_period()+ "\n,\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
