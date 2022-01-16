import java.util.*;
class multdimension_arraymatrixrowandcolumn
{
	public static void main(String args[])
	{
	  int i,j,col,row;
	  Scanner sc=new Scanner(System.in);
	  System.out.println( " Enter size of row ");
	  row=sc.nextInt();
	  System.out.println( " Enter size of column ");
	  col=sc.nextInt();
	  int[][] num=new int[row][col];
	  System.out.println( " enter"+ row*col +"no:");
	  for(i=0;i<row;i++)
	  {
		 for(j=0;j<col;j++)
		 {
	     num[i][j]=sc.nextInt();
		 }
	  }
	  System.out.println(" The row and column numbers are :");
	  for(i=0;i<row;i++)
	  {
		 for(j=0;j<col;j++)
		 {
	      System.out.print(num[i][j]+"\t");
		 }
		  System.out.print("\n");
	  }
	  
	   
	}
		  
}
