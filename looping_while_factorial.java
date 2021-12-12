import java.util.*;
class looping_while_factorial
{
	public static void main(String args[])
	{
		int i=1,num,factorial=1;
		Scanner sc=new Scanner(System.in);
	    System.out.println( " enter number ");
		num=sc.nextInt();
		while (i<=num)
		{
			
	      factorial=factorial*i;
			i++;
			
		}
		System.out.println(" The Factorial of  number is ="+factorial);
	}

}