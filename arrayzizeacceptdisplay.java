import java.util.*;
class arrayzizeacceptdisplay
{
	public static void main(String args[])
	{
	  int i,size;
	  Scanner sc=new Scanner(System.in);
	  System.out.println( " Enter size of array ");
	  size=sc.nextInt();
	  int[] num=new int[size];
	  System.out.println( " enter the numbers ");
	  for(i=0;i<size;i++)
	  {
	     num[i]=sc.nextInt();
	  }
	  
      System.out.println(" The numbers are :");
	  for(i=0;i<size;i++)
		{
		System.out.print(num[i]+ "\t");
		}
		
	}
		  
}
