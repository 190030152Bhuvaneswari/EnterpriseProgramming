package Task1;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws Exception,SQLException {
		
		Bean stb=new Bean();
		stb.setItemid(20);
		stb.setItemname("Chocolate");
		stb.setCost(200);
	    Insertion si=new Insertion();
	    while(true) {
	    	System.out.println("Shopping Details");
	    	System.out.println("Do you want to add some more item");
	    	System.out.println("Total item details");
	    	System.out.println("Totalcost");
	    	int option=sc.nextInt();
	    	switch(option) 
			{
			     case 1:
			    	 System.out.println("Values for insertion\n");
			    	 System.out.println("Enter ItemId");
			    	 int id=sc.nextInt();
			    	 System.out.println("Enter Name");
			    	 String name=sc.next();
			    	 System.out.println("Enter Mailid");
			    	  int cost=sc.nextInt();
						stb.setItemid(id);
						stb.setItemname(name);
						stb.setCost(cost);
						
						
					int a=si.customerInsertion(stb);
						if(a>0) {
							System.out.println("Insertion sucessful !!!");
						}
						else {
							System.out.println("Insertion failed !!!");
						}
						break;
			     case 2:si.customerDisplay(stb);
		            
	     			break;
			    
	    }
	    	
}
	}
}
