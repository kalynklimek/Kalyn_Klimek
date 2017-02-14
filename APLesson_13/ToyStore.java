import java.util.ArrayList;
public class ToyStore
{
	private ArrayList toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<toyList>();
	}
	
	public ToyStore(String ts)
	{
		loadToys(ts);
	}
	
	public void loadToys(ts)
	{
		ArrayList<Toy> toys = new ArrayList< >(ts.split(" "));
		
		for(int i = 0; i < toys.size(); i++)
		{
			String name = toyList.get(i);
			String type = toyList.get(i+1);
			
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if else(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
	
	public getThatToy(String nm)
	{
		for(Toy t : toyList)
		{
			if(t.getName().equals(nm))
			{
				return t;
			}
		}
		return null;
	}
	
	public getMostFrequentToy()
	{
		String name = n;
		int max = Integer.MIN_VALUE
		for(Toy t : toyList)
		{
			if(max <= count)
			{
				return name;
			}
			
			else if (max == count)
			{
				return name;
			}
			
			else if(name.equals(n))
		}
	}
	
	public getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy t : toyList)
		{
			if(type.equals("Car")
			{
				cars = t.setCount(t.getCount()+1);
			}
			
			else if(type.equals("AF")
			{
				figures = t.setCount(t.getCount()+1);
			}
		}
		
		if(cars >= figures)
		{
			return "Cars";
		}
		else if(figures >= cars)
		{
			return "Action Figures";
		}
		return "Equal amounts of action figures and cars!";
	)
	
	public String toString()
	{
		return toyList;
	}
}