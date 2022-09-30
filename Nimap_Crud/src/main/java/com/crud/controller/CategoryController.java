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

import com.crud.model.Category;
import com.crud.service.CategoryService;
//mark class asController
@RestController
public class CategoryController 
{
//autowire the CategoryService class
@Autowired
CategoryService categoryService;
//creating a get mapping that retrieves all the category detail from the database 
@GetMapping("/api/categories")
private List<Category> getAllCategory() 
{
return categoryService.getAllCategory();
}
//creating a get mapping that retrieves the detail of a specific category
@GetMapping("/api/categories/{categoryid}")
private Category getCategory(@PathVariable("categoryid") int categoryid) 
{
return categoryService.getCategoryById(categoryid);
}
//creating a delete mapping that deletes a specified category
@DeleteMapping("/api/categories/{categoryid}")
private void deleteCategory(@PathVariable("categoryid") int categoryid) 
{
categoryService.delete(categoryid);
}
//creating post mapping that post the category detail in the database
@PostMapping("/api/categories")
private int saveCategory(@RequestBody Category category) 
{
categoryService.saveOrUpdate(category);
return category.getCategoryid();
}
//creating put mapping that updates the category detail 
@PutMapping("/api/categories/{categoryid}")
private Category update(@RequestBody Category category) 
{
categoryService.saveOrUpdate(category);
return category;
}


}
