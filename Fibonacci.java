import java.util.*;

public class Fibonacci {
	//fields
	public static int a=1;
	public static int b=1;
	
	//running method-recursive method
	public static int run (int order) {
		if (order==1|| order==2)//base-case
			return 1;
		return run(order-2)+run(order-1);
	}
	
	//main
	public static void main (String args[]) {
		Scanner kb= new Scanner (System.in);
		//ask for the order
	  System.out.println("Please enter the number of order of the Fabonacci serise you want :)");
		int input=kb.nextInt();
		//input the order
		
		//calculate the fibonacci number
		System.out.println("Hi, thanks for calculating the Fibonacci nuber:) The number in order "+input+" is "+run(input)+"! Hope you love math forever~");
		
		
	}

}
