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




}