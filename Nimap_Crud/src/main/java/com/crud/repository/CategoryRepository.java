package com.crud.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.crud.model.Category;
public interface CategoryRepository extends CrudRepository<Category, Integer>,PagingAndSortingRepository<Category, Integer>
{
	
}
