package net.pco.mgr;

import net.pco.entity.Product;
import net.pco.data.*;
import java.sql.*;
import java.util.ArrayList;

public class ProductManager {
	public static int save(Product product) {
		String stmt = "INSERT INTO public.\"Product\" (\"Name\", \"Price\") VALUES(\'" + product.getName() + "\', \'" + product.getPrice() + "\')";
		int Id = DBOperation.Save(stmt);
		product.setId(Id);
		return Id;
	}
	
	public static Product getById(int Id) {
		String stmt = "SELECT * FROM public.\"Product\" WHERE \"Id\" = " + Id;
		Product p = new Product();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			if(rs.next()) {
				p.setId(rs.getInt("Id"));
				p.setName(rs.getString("Name"));
				p.setPrice(rs.getDouble("Price"));
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return p; 
	}
	
	public static ArrayList<Product> getAll() {
		String stmt = "SELECT * FROM public.\"Product\"";
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			ResultSet rs = DBOperation.returnRS(stmt);
			while(rs.next()) {
				Product p = new Product();
				p.setId(rs.getInt("Id"));
				p.setName(rs.getString("Name"));
				p.setPrice(rs.getDouble("Price"));
				list.add(p);
			}
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list; 
	}
}
