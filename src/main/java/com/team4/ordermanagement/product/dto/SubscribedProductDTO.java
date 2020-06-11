package com.team4.ordermanagement.product.dto;

import com.team4.ordermanagement.product.entity.Product;
import com.team4.ordermanagement.product.entity.SubscribedProduct;

public class SubscribedProductDTO {
	int subId;
	int buyerId;
	int prodId;
	int quantity;
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public SubscribedProduct createEntity() {
		// TODO Auto-generated method stub
		SubscribedProduct subproduct = new SubscribedProduct();
		subproduct.setBuyerId(this.getBuyerId());
		subproduct.setProdId(this.getProdId());
		subproduct.setQuantity(this.getQuantity());
		subproduct.setSubId(this.getSubId());
		
		return subproduct;
		
	}
	
	// Converts Entity into DTO
	public static SubscribedProductDTO valueOf(SubscribedProduct subproduct) {
		// TODO Auto-generated method stub
		SubscribedProductDTO subproductDTO=new SubscribedProductDTO();
		subproductDTO.setBuyerId(subproduct.getBuyerId());
		subproductDTO.setProdId(subproduct.getProdId());
		subproductDTO.setQuantity(subproduct.getQuantity());
		subproductDTO.setSubId(subproduct.getSubId());
	
		return subproductDTO;
	}
	
}