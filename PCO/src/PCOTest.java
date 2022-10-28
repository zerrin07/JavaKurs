import java.util.Scanner;
import java.util.ArrayList;
import net.pco.entity.*;
import net.pco.mgr.CartManager;
import net.pco.mgr.OrderManager;
import net.pco.mgr.ProductManager;
import java.time.*;

public class PCOTest {

	public static void main(String[] args) {
		Product p = new Product();
		Scanner in = new Scanner(System.in);
		System.out.print("Product name:");
		p.setName(in.next());
		p.setPrice(7.74);
		ProductManager.save(p);
		ArrayList<Product> lst = ProductManager.getAll();
		for(Product px : lst) {
			System.out.println(px.getName());
		}
		Cart c = new Cart();
		System.out.print("Cart number: ");
		int cn = in.nextInt();
		c.setCartNumber(cn);
		c.setProductId(15);
		c.setQuantity(4);
		CartManager.save(c);
		Cart c2 = new Cart();
		c2.setCartNumber(cn);
		c2.setProductId(16);
		c2.setQuantity(6);
		CartManager.save(c2);
		
		ArrayList<Cart> lstC = CartManager.getByCartNumber(cn);
		for(Cart cx : lstC) {
			System.out.println(cx.getId() + " - " + cx.getProduct().getName() + " - " + 
		cx.getProduct().getPrice() + " x " + cx.getQuantity() + " = " + 
					cx.getProduct().getPrice() * cx.getQuantity());
		}
		
		Order o = new Order();
		o.setCartNumber(cn);
		LocalDate d = LocalDate.now();
		o.setOrderDate(d);
		int orderId = OrderManager.save(o);
		
		Order ox = OrderManager.getById(orderId);
		System.out.println(ox.getOrderDate() + " - " + ox.getCartNumber());
		for(Cart cx : ox.getCartList()) {
			System.out.println("\t" + cx.getProduct().getName() + "\t" + 
		cx.getProduct().getPrice() + "\t" + cx.getQuantity());
		}
		System.out.println();
	}
}