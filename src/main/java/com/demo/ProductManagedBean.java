package com.demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.entities.Product;
import com.models.ProductModel;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@SessionScoped

@ManagedBean(name="productbean")
public class ProductManagedBean implements Serializable  {

	private static final long serialVersionUID = 1L;
	private List<Product> products;


	public List<Product> getProducts() {
		System.out.println("getProducts called");
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public ProductManagedBean() {
		System.out.println("sbdfhoe managedbean");
		ProductModel productModel = new ProductModel();
		this.products = productModel.findAll();
	}

}