package com.supermarket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "productname")
	private String productname;
	
	@Column(name = "price")
	private long price;
	
	@Column(name = "description")
	private String description;

	@Column(name = "quantity")
	private double quantity;
	
	@Column(name = "active")
	private boolean active;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String productname, long price, String description, double quantity) {
		super();
		this.productname = productname;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", productname=" + productname + ", price=" + price + ", description=" + description
				+ ", quantity=" + quantity + ", active=" + active + "]";
	}
}
