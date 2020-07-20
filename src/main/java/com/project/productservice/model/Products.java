package com.project.productservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
public class Products {
	
	@Id
	private int id;
	private String productName;
	private String productCode;
	private String productManufacturer;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductManufacturer() {
		return productManufacturer;
	}
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}
	
	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", productCode=" + productCode
				+ ", productManufacturer=" + productManufacturer + "]";
	}
}
