package net.pco.mgr;

import net.pco.entity.Cart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import net.pco.data.*;

public class CartManager {
	public static int save(Cart cart) {
		String stmt = "INSERT INTO public.\"Cart\" (\"CartNumber\", \"ProductId\", \"Quantity\") VALUES(" + cart.getCartNumber() + ", " + cart.getProductId() + ", " + cart.getQuantity() + ")";
		int Id = DBOperation.Save(stmt);
		cart.setId(Id);
		return Id;
	}
	
	public static Cart getById(int Id) {
		String stmt = "SELECT * FROM public.\"Cart\" WHERE \"Id\" = " + Id;
		Cart c = new Cart();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			if(rs.next()) {
				c.setId(rs.getInt("Id"));
				c.setQuantity(rs.getInt("Quantity"));
				c.setProductId(rs.getInt("ProductId"));
				c.setProduct(ProductManager.getById(c.getProductId()));
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return c; 
	}
	
	public static ArrayList<Cart> getAll() {
		String stmt = "SELECT * FROM public.\"Cart\"";
		ArrayList<Cart> list = new ArrayList<Cart>();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			while(rs.next()) {
				Cart c = new Cart();
				c.setId(rs.getInt("Id"));
				c.setQuantity(rs.getInt("Quantity"));
				c.setProductId(rs.getInt("ProductId"));
				c.setProduct(ProductManager.getById(c.getProductId()));
				list.add(c);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list; 
	}
	
	public static ArrayList<Cart> getByCartNumber(int CartNumber) {
		String stmt = "SELECT * FROM public.\"Cart\" WHERE \"CartNumber\" = " + CartNumber;
		ArrayList<Cart> list = new ArrayList<Cart>();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			while(rs.next()) {
				Cart c = new Cart();
				c.setId(rs.getInt("Id"));
				c.setQuantity(rs.getInt("Quantity"));
				c.setCartNumber(rs.getInt("CartNumber"));
				c.setProductId(rs.getInt("ProductId"));
				c.setProduct(ProductManager.getById(c.getProductId()));
				list.add(c);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list; 
	}
}