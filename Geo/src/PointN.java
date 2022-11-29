
public class PointN {
	private int[] x;
	public int[] getX() {
		return x;
	}
	public void setX(int[] x)
	{
		this.x = x;
	}
	public PointN(int s)
	{
		this.x = new int[s];
	}
    public PointN(int[] x)
    {
    	this.x = new int[x.length];
    	for(int i=0;i<x.length;i++)
    	{
    		this.x[i] = x[i];
    	}
    }
}
