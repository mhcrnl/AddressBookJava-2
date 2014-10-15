import java.util.Scanner;
import java.util.Arrays;

public class Main 
{
	public static void main(String[] arg)
	{
		Persoana a = new Persoana("Nume", "Prenume", "Email", "Telefon");
		String x;
		System.out.println("Se citeste o persoana:");
		Scanner user_input = new Scanner(System.in); //"Resource leak: 'user_input' is never closed"
		
		System.out.println("Nume: ");
		x = user_input.next();
		a.setName(x); //"Local variable may not have been initialized"
		
		System.out.println("Prenume: ");
		x = user_input.next();
		a.setSurname(x);
		
		System.out.println("E-mail: ");
		x = user_input.next();
		a.setEmail(x);
		
		System.out.println("Telefon: ");
		x = user_input.next();
		a.setPhone(x);
		
		System.out.println(a.getName());
		System.out.println(a.getSurname());
		System.out.println(a.getEmail());
		System.out.println(a.getPhone());
		
		
	}
}
