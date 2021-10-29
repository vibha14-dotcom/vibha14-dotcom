package conditionalStatements;

import java.util.Scanner;

public class UserInput {
	public static void main (String args[]){
		System.out.println("Enter Your details");
		Scanner W = new Scanner(System.in);
		System.out.println("enter your name");
		String Fullname= W.nextLine();
        System.out.println("your full name is"+Fullname);
        System.out.println("Enter your age");
        int Age =W.nextInt();
        System.out.println("Age"+Age);
        W.close();
		}

}
