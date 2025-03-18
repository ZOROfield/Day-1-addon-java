
package core;

import java.util.Scanner;

public class Controlstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("what is the marital status:(Married/ unMarried");
		String ms= in.nextLine().toLowerCase();
		
		if (ms.equals("married"))
		{
			System.out.println("you are eligible to the insurance");
			
		}
		else if (ms.equals("unmarried"))
		{
			System.out.println("Enter the below details");
			System.out.println("Enter the Gender:(Male/Female)");
			String gd= in.nextLine().toLowerCase();
		    System.out.println("enter the age");
			int age=in.nextInt();
		};	
			int age = 0;
			if (age>=30)
			{
				System.out.println("your age is invalid");
			}
	
	
		
		
		
		

		
		
		
		
		
		
		
	}

}
