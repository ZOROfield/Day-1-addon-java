package core;

import java.util.Scanner;

public class Inputoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner abc = new Scanner(System.in); 
		System.out.println("Get integer:");
		int a =abc.nextInt();
		System.out.println("Get byte:");
		byte b= abc.nextByte();
		System.out.println("Get short:");
		short c = abc.nextShort();
		System.out.println("Get float:");
		float d = abc.nextFloat();
		System.out.println("Get double");
		double e = abc.nextDouble();
		System.out.println("Get long:");
		long f = abc.nextLong();
		System.out.println("Get boolean:");
		boolean g = abc.nextBoolean();
		System.out.println("Get char:");
		char h = abc.next().charAt(0);
		System.out.println("enter the name:");
		abc.nextLine();
		String name=abc.nextLine();
	
	
		System.out.println("display integer:"+a);
		System.out.println("display byte:"+b);
		System.out.println("display short:"+c);
		System.out.println("display float:"+d);
		System.out.println("display double:"+e);
		System.out.println("display long:"+f);
		System.out.println("display boolean:"+g);
		System.out.println("display character:"+h);
		System.out.println("display name:"+name);
	
	
	
	
	
	
	
	}

}
