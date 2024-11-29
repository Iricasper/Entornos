package es.iessoterohernandez.daw.endes.fibonacciMain;

import java.util.Scanner;
import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;

public class FibonacciMain
{
    public static void main( String[] args )
    {
    	
        Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduzca la longitud deseada de la sucesion:");
			int count=sc.nextInt();
			System.out.print(Fibonacci.getN1()+" "+Fibonacci.getN2());
			Fibonacci.fibonacci(count - 2);
		}
}
