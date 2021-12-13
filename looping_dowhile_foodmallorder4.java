import java.util.*;
class looping_dowhile_foodmallorder4
{
	public static void main(String args[])
	{
		char ans,ans1,ans2,ans3;
		int ch,ch1,ch2,ch3,amount=0;
		String item=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println( " Welcome to Food Mall" );
		System.out.println( " Deliciousness jumping into the mouth" );
		System.out.println( "Address:pune, contact : +919999667788" );
		do
		{
			System.out.println(" Menu ");
			System.out.println("1:Starters\n2:Maincourse\n3:Desserts");
			ch=sc.nextInt();
			switch(ch)
	 
	    { case 1:
		  do
		  { 
		    System.out.println("Starters");
			System.out.println("1:Crispy corn="+140);
		    System.out.println("2:Harabhara kebab="+150);
			System.out.println("3:Veg manchurian="+120);
			System.out.println("4:Spring roll="+180);
			ch1=sc.nextInt();
			switch(ch1)
			{
		     case 1:
			 amount+=140;
			 item+="\nCrispy corn:140";
			 break;
			  case 2:
			 amount+=150;
			 item+="\nHarabhara kebab:150";
			 break;
			  case 3:
			 amount+=120;
			  item+="\nVeg manchurian:120";
			 break;
			  case 4:
			 amount+=180;
			  item+="\nSpring roll:180";
			 break;
			}
			System.out.println( " Do you want more starters Y/N ");
			ans1=sc.next().charAt(0);
		  }
		  while(ans1=='y'||ans1=='Y');
		  
		
		    break;
		
	   
		 case 2:
		 do
		 {
			System.out.println("Main course");
			System.out.println("1:paneermasala="+250);
			System.out.println("2:Dal fry="+150);
			System.out.println("3:Aloo mutter="+120);
			System.out.println("4:Dum Aloo Punjabi="+200);
		    ch2=sc.nextInt();
			switch(ch2)
			{
		     case 1:
			 amount+=250;
			 item+="\npaneermasala:250";
			 break;
			  case 2:
			 amount+=150;
			 item+="\nDal fry:150";
			 break;
			  case 3:
			 amount+=120;
			 item+="\nAloo mutter:120";
			 break;
			  case 4:
			 amount+=200;
			  item+="\nDum Aloo Punjabi:200";
			 break;
			}
			System.out.println("Do you want more main course Y/N");
			ans2=sc.next().charAt(0);
		 }
		 while(ans2=='y'||ans2=='Y');
		
		    break;
	
	    
		  case 3:
		  
		  do
		  {
		  
		  System.out.println("1:Moongdal halwa="+80);
		  System.out.println("2:Rasmalai="+50);
		  System.out.println("3:kaju katli="+120);
		  System.out.println("4:gulab jamun="+70);
		  ch3=sc.nextInt();
		  switch(ch3)
			{
		     case 1:
			 amount+=80;
			  item+="\nMoongdal halwa:80";
			 break;
			  case 2:
			 amount+=50;
			   item+="\nRasmalai:50";
			 break;
			  case 3:
			 amount+=120;
			 item+="\nkaju katli:120";
			 break;
			  case 4:
			 amount+=70;
			 item+="\ngulab jamun:70";
			 break;
			}
		  System.out.println("Do you want more Dessert items Y/N");
		  ans3=sc.next().charAt(0);
		  }
		  while(ans3=='y'||ans3=='Y');
		
		    break;
		
	    }
			System.out.println(" Do you want to order more items Y/N ");
			ans=sc.next().charAt(0);
		}
		while(ans=='y'||ans=='Y');
		System.out.println(" Thanks for visiting us ");
		System.out.println("Ordered Items:\n"+item);
		System.out.println (" Your Final bill amount is="+amount);
   }
}
