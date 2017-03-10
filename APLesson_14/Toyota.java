public class Toyota implements Location
{
	private double [] location;
	
	public Toyota(String c)
	{
		String [] coordinates = c.split(", ");
		location[0] = Double.parseDouble(location[0]);
		location[1] = Double.parseDouble(location[1]);
	}	
	
	public double getID()
	{
		return Math.random()*1000000 +1;
	}
	
	public void move(double x, double y)
	{
		location [0] += x;
		location [1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}