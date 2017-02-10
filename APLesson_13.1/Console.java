public class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public abstract String getController();
	
	public String toString()
	{
		return "Platform: " + platform + "g\n" +
				"Serial #: " + serialNo + "g\n" +
				"Controller: " + controller;
	}
}