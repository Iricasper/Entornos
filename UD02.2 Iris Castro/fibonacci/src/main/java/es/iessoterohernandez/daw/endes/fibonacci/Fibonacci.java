package es.iessoterohernandez.daw.endes.fibonacci;

public class Fibonacci {
	
	public static int n1, n2 = 1, n3;    
	public static void fibonacci(int count){    
	    if(count > 0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" " + n3);   
	         fibonacci(count - 1);
	         }   
	 } 
	public static int getN1() {
		return n1;
	}
	public static int getN2() {
		return n2;
	}
}
