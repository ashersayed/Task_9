package com.crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Product;
import com.crud.service.ProductService;
//mark class as Controller
@RestController
public class ProductController 
{
//autowire the ProductService class
@Autowired
ProductService productService;
//creating a get mapping that retrieves all the product detail from the database 
@GetMapping("/api/products")
private List<Product> getAllProduct() 
{
return productService.getAllProduct();
}
//creating a get mapping that retrieves the detail of a specific product
@GetMapping("/api/products/{productid}")
private Product getProduct(@PathVariable("productid") int productid) 
{
return productService.getProductById(productid);
}
//creating a delete mapping that deletes a specified product
@DeleteMapping("/api/products/{productid}")
private void deleteProduct(@PathVariable("productid") int productid) 
{
productService.delete(productid);
}
//creating post mapping that post the product detail in the database
@PostMapping("/api/products")
private int saveProduct(@RequestBody Product product) 
{
productService.saveOrUpdate(product);
return product.getProductid();
}
//creating put mapping that updates the product detail 
@PutMapping("/api/products/{productid}")
private Product update(@RequestBody Product product) 
{
productService.saveOrUpdate(product);
return product;
}


}
