package net.pco.entity;

import java.time.*;
import java.util.ArrayList;

public class Order {
	private int Id;
	private LocalDate OrderDate;
	private int CartNumber;
	private ArrayList<Cart> CartList;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public LocalDate getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}
	public int getCartNumber() {
		return CartNumber;
	}
	public void setCartNumber(int cartNumber) {
		CartNumber = cartNumber;
	}
	public ArrayList<Cart> getCartList() {
		return CartList;
	}
	public void setCartList(ArrayList<Cart> cartList) {
		CartList = cartList;
	}
	
}
