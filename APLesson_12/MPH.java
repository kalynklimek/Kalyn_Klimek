import java.lang.Math.*;
public class MPH
{
	private int distance, hours, minutes;
	private double mph;
	
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MPH(int d, int hrs, int mins)
	{
		distance = d;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	public void setValues(int d, int hrs, int mins)
	{
		distance = d;
		hours = hrs;
		minutes = mins;
		mph = 0;
	}
	
	public double getMPH()
	{
		mph = Math.round((distance/(hours + (minutes/60.0))));
		return mph;
	}
	
	public int getDistance()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMinutes()
	{
		return minutes;
	}
}