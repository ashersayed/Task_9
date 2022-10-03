package com.crud.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crud.model.Category;
import com.crud.repository.CategoryRepository;
//defining the business logic

@Service
public class CategoryService 
{
	
	
	
@Autowired
CategoryRepository categoryRepository;
//getting all category record by using the method findaAll() of CrudRepository


public List<Category> findPaginated(int pageNo) {

    Pageable paging = PageRequest.of(pageNo,2);
    Page<Category> pagedResult = categoryRepository.findAll(paging);

    return pagedResult.toList();
}

public List<Category> getAllCategory() 
{
List<Category> category = new ArrayList<Category>();
categoryRepository.findAll().forEach(category1 -> category.add(category1));
return category;
}
//getting a specific record by using the method findById() of CrudRepository
public Category getCategoryById(int id) 
{
return categoryRepository.findById(id).get();
}
//saving a specific record by using the method save() of CrudRepository
public void saveOrUpdate(Category category) 
{
categoryRepository.save(category);
}
//deleting a specific record by using the method deleteById() of CrudRepository
public void delete(int id) 
{
categoryRepository.deleteById(id);
}
//updating a record
public void update(Category category, int bookid) 
{
categoryRepository.save(category);
}
}