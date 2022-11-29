
public class GeoTest {

	public static void main(String[] args) {
		Point p1= new Point(-2,3);
		Point p2 = new Point(2,6);
        Line l1 = new Line(p1,p2);
        System.out.println(l1.getP1().getX());
        System.out.println(l1.getP1().getY());
        System.out.println(l1.getP2().getX());
        System.out.println(l1.getP2().getY());
        System.out.println(l1.getLength());
        int[] pa1 = {1,2,3,4,5};
        int[] pa2 = {2,3,4,5,6};
        PointN pn1 = new PointN(pa1);
        PointN pn2= new PointN(pa2);
        LineN ln1 =new LineN(pn1,pn2);
  

}
}