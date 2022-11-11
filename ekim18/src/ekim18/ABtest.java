package ekim18;
import java.util.*;
public class ABtest {
  public static void main(String[] args)
  {
	  B b = new B();
		b.setB1(4);
		BManager.save(b);

		A x = new A();
		x.setA1(4);
		b.setA(x);
		AManager.save(x);

		A x2 = b.getA();
		System.out.println(x.getA1());
		System.out.println(b.getB1());
		

		A ax = AManager.getById(1);
		ArrayList<A> al = AManager.getAllA();

		B bx = BManager.getById(1);
		ArrayList<B> bl = BManager.getAllB();
  }
}
