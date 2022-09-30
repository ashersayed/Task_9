package com.crud.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Product;
import com.crud.repository.ProductRepository;
//defining the business logic
@Service
public class ProductService 
{
@Autowired
ProductRepository productRepository;
//getting all product record by using the method findaAll() of CrudRepository
public List<Product> getAllProduct() 
{
List<Product> product = new ArrayList<Product>();
productRepository.findAll().forEach(product1 -> product.add(product1));
return product;
}
//getting a specific record by using the method findById() of CrudRepository
public Product getProductById(int id) 
{
return productRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Product product) 
{
productRepository.save(product);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
productRepository.deleteById(id);
}
//updating a record
public void update(Product product, int bookid) 
{
productRepository.save(product);
}
}