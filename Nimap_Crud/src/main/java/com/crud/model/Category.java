package com.crud.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Category
{
//Defining category id as primary key
@Id
@Column
//@GeneratedValue(strategy=GenerationType.AUTO)
private int categoryId;
@Column
private String categoryName;

public int getCategoryid() 
{
return categoryId;
}
public void setCategoryid(int categoryId) 
{
this.categoryId = categoryId;
}
public String getCategoryname()
{
return categoryName;
}
public void setCategoryname(String categoryName) 
{
this.categoryName = categoryName;
}

}