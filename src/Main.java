import java.util.Scanner;
public class Main 
{
	public static void main()
	{
		Persoana a;
		String x;
		System.out.println("Se citeste o persoana:");
		Scanner user_input = new Scanner(System.in); //"Resource leak: 'user_input' is never closed"
		x=user_input.next();
		a.setName(x); //"Local variable may not have been initialized"
	}
}
