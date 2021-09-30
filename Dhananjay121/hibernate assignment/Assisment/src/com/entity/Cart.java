package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cart_Id;
	private Double totalPrice;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<Customer> customers;
	
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<SalesOrder> salesOrders;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cart_id")
	@OrderColumn(name="type")
	private List<CartItem> cartItems;
	
	//Getters and setters
	public Integer getCart_Id() {
		return cart_Id;
	}
	public void setCart_Id(Integer cart_Id) {
		this.cart_Id = cart_Id;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}
	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
}