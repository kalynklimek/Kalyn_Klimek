public class PC extends GameSystem
{
	private String keyboard;
	private String mouse;
	
	public PC()
	{
		super();
		this.keyboard = "";
		this.mouse = "";
	}
	
	public PC(String p)
	{
		super(p);
		this.keyboard = kb;
		this.mouse = m;
	}
	
	public String systemInput()
	{
		return keyboard + mouse;
	}
	
	public String toString()
	{
		return super.toString() + "g\n" +
				"System Input: " + systemInput();
	}
}