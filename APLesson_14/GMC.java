public class GMC implements Location
{
	private double [] coordinates;
	public GMC(double x, double y)
	{
		coordinates = new double [2];
		coordinates [0] = x;
		coordinates [1] = y;
	}
	
	public double getID()
	{
		return Math.random()*1000000 + 1;
	}
	
	public double move(double x, double y)
	{
		return x+x;
		return y+y;
	}
	
	public double getLoc(double x, double y)
	{
		coordinates = new double [2];
	}
}