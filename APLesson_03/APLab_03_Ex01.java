import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in)
		
		//prompt for user input
		System.out.println("Hi, my name is RudeAI. ");
		System.out.println("I'd like to ask you a few questions. ");
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println("How old are you, " + name + "? ");
		
		//search for the next integer that the user enters
		int num = keyboard.nextInt();
		
		//print the results...
		System.out.println("Oooooo!!! " + num + "is getting up there. " );
		System.out.println("What do you do for fun, " + name + "? ");
		
	}
}