package primeNumbers;
import java.util.*;

public class Divisors 
{
	/*
	 This class have one attribute and two methods.
	 
	 Attribute - An integer
	 
	 Method one - isPrime check if one number (integer) is a prime number or not.
	 
	 Method two - calDivsisors looks for all the real divisors of a number (integer) and check if all of this divisors meet with the condition:
	 				
	 				· divisor + number/divisor = a prime number
	 */
	public int numb;
	
	public Divisors (int number) 
	{
		this.numb = number;
	}
	
	public int getNumb() 
	{
		return numb;
	}

	public void setNumb(int numb) 
	{
		this.numb = numb;
	}
	
	public int isPrime(int num) 
	{
		int x = 2;
		if (num <=1) 
		{
			return 1;
		}
		else {
			while (x*x <= num) {
				if (num%x==0) {
					return 0;
				}
				x++;
			}		
		return 1;
		}
	}

	public int calDivisors(int n) 
	{
		int d = 1;
		while (d < n+1) 
		{
			List<Integer> divisores = new ArrayList<Integer>();
			if(n%d==0) 
			{
				divisores.add(d);
			}
			d++;
			
			for (int i=0; i <= divisores.size()-1; i++) 
			{
				int algoritm = divisores.get(i) + n/ divisores.get(i);
				int prime = isPrime(algoritm);
				if (prime == 0) 
				{
					n = 0;
					break;
				}
				else 
				{
					if (i== divisores.size()-1 && prime == 1)
					{
						break;
					}
					System.out.println(n);
				}
			}
		}
		return n;
	}	
}
