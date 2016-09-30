public class APLab_4_1
{
	public static void main(String[]args)
	{
		APLab_4_1 totalCost = new APLab_4_1();
		double r = 0.05;
		double P = 7500;
		double n = 12;
		double t = 24;
		double total = totalCost.CalcComInt(r, P, n, t);
		System.out.printf("Your total monthly payment is $%5.2f", total); 
	}
	
	public double CalcComInt(double r, double P, double n, double t)
	{
		return (P* (Math.pow(1 + r/n, n*t)))/(t*12);
	}
}