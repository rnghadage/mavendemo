package rohit;

import java.util.Scanner;

public class Scannersc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");


		int iSwitch = sc.nextInt();
		switch (iSwitch) {
		case 0:
			System.out.println("Zero");
		break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
		System.out.println("three");
		break;
		case 4:
			System.out.println("four");
			break;
			default:
				System.out.println("not in the list");
				break;

			 
		
		}
	}

}
