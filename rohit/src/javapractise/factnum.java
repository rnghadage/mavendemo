package javapractise;

import java.util.Scanner;

public class factnum {

	public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the number");
   int no= sc.nextInt();
   int fact = 1;
   for (int i=1;i<= no;i++) {
	   fact = fact*i;
	   
   }
   System.out.println("factorial of the number is"+no +"is" +fact);
   
   
	}

}
