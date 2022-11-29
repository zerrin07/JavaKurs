
public class LineN {
private PointN p1;
private PointN p2;
public LineN(PointN p1,PointN p2)
{
	this.p1 =p1;
	this.p2=p2;
}
public LineN(int[] p1,int[] p2)
{
	this.p1 = new PointN(p1);
	this.p2 = new PointN(p2);
}
public double getLength() {
	if(p1.getX().length == p2.getX().length) 
	{
		int sumDiffsSq = 0;
	for(int i = 0;i<p1.getX().length;i++)
	{
		sumDiffsSq += Math.pow((p2.getX()[i] - p1.getX()[i]),2);
	}
	return Math.sqrt(sumDiffsSq);
}
	else {
		return Double.NaN;
	}
}
}