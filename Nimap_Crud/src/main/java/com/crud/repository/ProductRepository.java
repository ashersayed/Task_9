package com.crud.repository;
import org.springframework.data.repository.CrudRepository;

import com.crud.model.Product;
public interface ProductRepository extends CrudRepository<Product, Integer>
{
}
