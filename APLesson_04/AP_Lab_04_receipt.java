public class AP_Lab_04_receipt
{
	public static void main(String[]args)
	{
		System.out.printf("%26s  %10.2f", "* Cheese Sandwich ......", 4.50);
		System.out.printf("\n%26s  %10.2f", "*    French Fries ......", 2.88);
		System.out.printf("\n%26s  %10.2f", "*            Soda ......", 1.63);
		
		System.out.printf("\n%26s  %10.2f", "*       Subtotal: ......", 9.01);
		System.out.printf("\n%26s  %10.2f", "*            Tax: ......", 0.63);
		System.out.printf("\n%26s  %10.2f", "*          Total: ......", 9.64);
		System.out.println("\n  ________________________________________");
		System.out.println("\n   * Thank you for your support *");
	}
}