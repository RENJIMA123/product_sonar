package com.team4.ordermanagement.product.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.team4.ordermanagement.order.entity.OrderDetails;
//import com.management.UserMS.dto.WishlistDTO;
//import com.management.UserMS.entity.Wishlist;
//import com.infosys.infytel.customer.entity.Customer;
import com.team4.ordermanagement.product.dto.ProductDTO;
import com.team4.ordermanagement.product.entity.Product;
import com.team4.ordermanagement.product.repository.ProductRepository;
//import com.team4.ordermanagement.product.repository.SubscribedProductRepository;

@Service
public class ProductService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProductRepository productRepo;
	
	
	// displays all products
		public List<ProductDTO> getProducts() {
			List<Product> products = productRepo.findAll();
			List<ProductDTO> productDTOs = new ArrayList<>();
			
			for (Product i : products) {
				ProductDTO productDTO=ProductDTO.valueOf(i);
				productDTOs.add(productDTO);
			}
			return productDTOs;

		}

	// display products based on product name
	public ProductDTO getProdByName(String productName) {
		ProductDTO productDTO=null;
		List<Product> products= productRepo.findAll();
		
		
		for(Product product : products) {
			if(product.getProductName().equals(productName)) {
			productDTO=productDTO.valueOf(product);
			}
			
		}
		
			
		
		return productDTO;
	}
			

	// displays products based on category
	public ProductDTO getProductByCategory(String category) {
		ProductDTO productDTO=null;
		List<Product> products = productRepo.findAll();
		
		
		for(Product product : products) {
			if(product.getCategory().equals(category)) {
			productDTO=productDTO.valueOf(product);
			}
			
		}
			
			
		
		return productDTO;
	}

	public void updateProductsinStock(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		logger.info("Updating products in stock {}", productDTO);
		ProductDTO productDTO1=productDTO;
		Product product=productDTO1.createEntity();
		productRepo.save(product);
		
		
	}

//	public void addProducttoRepo(ProductDTO productDTO) {
//		// TODO Auto-generated method stub
//		
//		Product product =productDTO.createEntity();
//		productRepo.save(product);
//		
//		
//	}

	public void addProductinRepo(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		
		Product product = productDTO.createEntity();
		productRepo.save(product);
		
		
	}

	public ProductDTO getProductById(Integer prodId) {
		// TODO Auto-generated method stub
		
			ProductDTO productDTO=null;
			List<Product> products= productRepo.findAll();
			
			
			for(Product product : products) {
				if(product.getProdId().equals(prodId)) {
				productDTO=productDTO.valueOf(product);
				}
				
			}
			
				
			
			return productDTO;
		
	}




}