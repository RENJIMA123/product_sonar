package com.team4.ordermanagement.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@Column( name="prodid",nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer prodId;
	@Column(nullable=false)
	String brand;
	@Column(nullable=false)
	String category;
	@Column(nullable=false)
	String description;
	
	@Column(nullable =false)
	String image;
	@Column(nullable=false)
	Double price;
	
	
	@Column(name="produuctname",nullable= false)
	String productName;
	@Column(name="rating")
	Integer Rating;
	@Column(name="sellerid",nullable=false)
	Integer sellerId;
	@Column(nullable=false)
	Integer stock;
	
	
	
	
	
	@Column(name="subcategory",nullable = false)
	String subCategory;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Integer getSellerId() {
		return sellerId;
	}
	public void setSellerId(Integer sellerId) {
		this.sellerId = sellerId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public Integer getRating() {
		return Rating;
	}
	public void setRating(Integer Rating) {
		this.Rating = Rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}