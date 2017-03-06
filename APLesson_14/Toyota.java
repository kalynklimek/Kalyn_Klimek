public class Toyota implements Location
{
	private double [] location;
	
	public Toyota()
	{
		
	}	
	
	public double getID()
	{
		return Math.random()*1000000 +1;
	}
}