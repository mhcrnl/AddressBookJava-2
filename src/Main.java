import java.util.Scanner;
public class Main 
{
	public static void main()
	{
		Persoana a;
		a("Nume", "Prenume", "Email", "Phone");
		String x;
		System.out.println("Se citeste o persoana:");
		Scanner user_input = new Scanner(System.in);
		x=user_input.next();
		a.setName(x);
	}
}
