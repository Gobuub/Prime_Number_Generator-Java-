package primeNumbers;
import java.util.*;
public class main {
	
	
	public static void main(String[] args) 
	{
		System.out.println("Introduce un número: ");
		// Create a scanner object to catch our parameter on terminal
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.print("El número introducido es: " + n + "\n");
		System.out.println("Imprimiendo numeros primos");
		int x = 0;
		int suma = 0;
		
		Divisors div = new Divisors(n);
		if (n>=100000000)
		{
			/* The program calculate the sum of the numbers until a max of 100000000, if the number catch thought terminal is greater than this number repeat
			   the message until user introduces a valid number. 
			 */
			while(n>100000000) 
			{
				System.out.println("El número introducido es demasiado alto");
				System.out.println("Introduce un número menor o igual a 100000000: ");
				n = scanner.nextInt();
			}
		}
		else 
		{
			while(x < n+1) 
			{
				if (x <= 1) {suma += x; x++;}
				else 
				{
					int number = div.calDivisors(x);
					suma += number;
					x++;
				}			
			}
		}
		// Returns the total sum of all numbers that meet the condition described on Divisors class.
		System.out.println("La suma total de los números es: " + suma);
	}
}
