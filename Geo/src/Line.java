
public class Line {
  public Point p1;
  public Point p2;
  
  public Line(Point p1,Point p2)
  {
	  this.p1 = p1;
	  this.p2 = p2;
  }
  public Point getP1()
  {
	  return p1;
  }
  public void setP1(Point p1)
  {
	  this.p1 =p1;
  }
  public Point getP2()
  {
	  return p2;
  }
  public void setP2(Point p2)
  {
	  this.p2 =p2;
  }
  public double getLength()
  {
	  int xFark = p2.getX() - p1.getX();
	  int yFark = p2.getY() - p1.getY();
	  double length = Math.sqrt(Math.pow(xFark, 2))-Math.pow(yFark, 2);
	  return length;
	  
  }
}
