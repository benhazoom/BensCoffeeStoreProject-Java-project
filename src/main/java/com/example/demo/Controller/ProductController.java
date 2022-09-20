package com.example.demo.Controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//This is the controller class meaning that the connection between the view and the db is through here
//The controller Utilizes the service to work with the DB
@RequestMapping("api/v1/product")
@RestController
@CrossOrigin("http://localhost:3000/")

public class ProductController {

	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	// @RequestBody accepts ONE e type argument
	// @PostMapping used for post to DB
	@PostMapping
	public boolean addProduct(@RequestBody Product product) {

		return productService.addProduct(product.getId(), product.getName(), product.getDescription(),
				product.getPrice(), product.getColor(), product.getCatalog(), product.getWarranty_amount(),
				product.getWarranty_time_period());
	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productService.selectAllProduct();
	}

	@GetMapping(path = "/{id}")
	public Product getProductById(@PathVariable("id") int id) {
		return productService.getProductById(id).orElse(null);
	}

	@DeleteMapping(path = "/{id}")
	public boolean deleteProductById(@PathVariable("id") int id) {
		return productService.deleteProduct(id);
	}

	@PutMapping(path = "/{id}")
	public boolean updateProductById(@PathVariable("id") int id, @RequestBody Product productToUpdate) {
		return productService.updateProduct(productToUpdate);
	}

}
