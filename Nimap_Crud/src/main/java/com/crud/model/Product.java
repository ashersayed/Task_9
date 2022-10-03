package com.crud.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Product
{
	//Defining product id as primary key
	@Id
	@Column
	private int productId;
	@Column
	private String productName;

/*
	@Column
	private Integer catId;
	
	@Column 
	public Integer num;
	
	*/
	@ManyToOne
	@JoinColumn(name = "categ_id")
	private Category productCategory;
	
	
	public int getProductid() 
	{
		return productId;
	}

	public void setProductid(int productId) 
	{
		this.productId = productId;
	}
	public String getProductname()
	{
		return productName;
	}
	public void setProductname(String productName) 
	{
		this.productName = productName;
	}
	
	public Category getProductCategory()
	{
		return productCategory;
	}
	public void setProductCategory(Category newCategory) 
	{
		this.productCategory = newCategory;
	}

	/*
	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}
	
	*/
	




}