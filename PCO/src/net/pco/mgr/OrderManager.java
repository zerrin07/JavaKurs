package net.pco.mgr;

import net.pco.entity.Order;
import net.pco.data.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderManager {
	public static int save(Order order) {
		String stmt = "INSERT INTO public.\"Order\" (\"OrderDate\", \"CartNumber\") VALUES(\'" + order.getOrderDate() + "\', " + order.getCartNumber() + ")";
		int Id = DBOperation.Save(stmt);
		order.setId(Id);
		return Id;
	}
	
	public static Order getById(int Id) {
		String stmt = "SELECT * FROM public.\"Order\" WHERE \"Id\" = " + Id;
		Order o = new Order();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			if(rs.next()) {
				o.setId(rs.getInt("Id"));
				o.setOrderDate(rs.getDate("OrderDate").toLocalDate());
				o.setCartNumber(rs.getInt("CartNumber"));
				o.setCartList(CartManager.getByCartNumber(o.getCartNumber()));
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return o; 
	}
	
	public static ArrayList<Order> getAll() {
		String stmt = "SELECT * FROM public.\"Order\"";
		ArrayList<Order> list = new ArrayList<Order>();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			while(rs.next()) {
				Order o = new Order();
				o.setId(rs.getInt("Id"));
				o.setOrderDate(rs.getDate("OrderDate").toLocalDate());
				o.setCartNumber(rs.getInt("CartNumber"));
				o.setCartList(CartManager.getByCartNumber(o.getCartNumber()));
				list.add(o);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list; 
	}
}