package edu.edication.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.CreationTimestamp;

@Table(name = "prodinfo")
@Entity
public class Product {
	
	@Column(name = "pid")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // to automatically generate the PK
	private int id;
	
	@Column(name = "pname", length = 50, nullable = false, unique = true)
	private String name;
	private double price;
	private int quantity;
	
	@Transient  // this will not create column inside the table
	private double totalPrice;
	
	@CreationTimestamp
	private LocalDate productDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public LocalDate getProductDate() {
		return productDate;
	}
	public void setProductDate(LocalDate productDate) {
		this.productDate = productDate;
	}
}
