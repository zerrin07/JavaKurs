package net.pco.entity;

public class Cart {
	private int Id;
	private int CartNumber;
	private int Quantity;
	private int ProductId;
	private Product Product;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public int getCartNumber() {
		return CartNumber;
	}
	public void setCartNumber(int cartNumber) {
		CartNumber = cartNumber;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
}
