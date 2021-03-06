package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.Cart;

public interface CartService {

	//Add cart
	Cart addCart(Cart cart);
	
	//Get list of cart
	ArrayList<Cart> listOfCart();
	
	//Update cart
	Cart updateCart(Cart cart);
	
	//Delete cart by id
	void deleteCartById(Integer id);
}