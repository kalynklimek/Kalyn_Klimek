public class APLab_04_IDcard
{
	public static void main(String[]args)
	{
		APLab_04_IDcard form = new APLab_04_IDcard();
		
		String word1 = "*  Torrey Pines";
		String line1 = "2016-17 *";
		
		form.format(word1, line1);
		
		String word2 = "*       Richard";
		String line2 = "Robinette *";
		
		form.format(word2, line2);
		
		String word3 = "*       Teacher";
		String line3 = "Computer Science *";
		
		form.format(word3, line3);
	}
	
	public void format(String word, String line)
	{
		System.out.printf("\n%15s  %18s", word, line);
	}
}