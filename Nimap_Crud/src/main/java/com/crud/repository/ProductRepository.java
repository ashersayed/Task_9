package com.crud.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crud.model.Product;
public interface ProductRepository extends CrudRepository<Product, Integer>,PagingAndSortingRepository<Product, Integer>
{
}
