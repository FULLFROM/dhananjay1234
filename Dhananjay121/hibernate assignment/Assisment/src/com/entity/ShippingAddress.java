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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="ShippingAddress")
public class ShippingAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer shippingAddress_id;
	private String address;
	private String state;
	private Integer zipcode;
	private String country;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="shippingAddress_id")
	@OrderColumn(name="type")
	private List<Customer> customer1;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="shippingAddress_id")
	@OrderColumn(name="type")
	private List<SalesOrder> salesOrders;
	
	//Getters and setters
	public Integer getShippingAddress_id() {
		return shippingAddress_id;
	}
	public void setShippingAddress_id(Integer shippingAddress_id) {
		this.shippingAddress_id = shippingAddress_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipcode() {
		return zipcode;
	}
	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public List<Customer> getCustomer1() {
		return customer1;
	}
	public void setCustomer1(List<Customer> customer1) {
		this.customer1 = customer1;
	}
	public List<SalesOrder> getSalesOrders() {
		return salesOrders;
	}
	public void setSalesOrders(List<SalesOrder> salesOrders) {
		this.salesOrders = salesOrders;
	}
}