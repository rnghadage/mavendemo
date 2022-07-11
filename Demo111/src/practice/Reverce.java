package practice;

public class Reverce {
	

		
		public static void main (String[]args) {
			int num =1612, reverse =0;
			while (num!=0) {
				int i =num%10;
				reverse = reverse * 10 +i;
				num/=10;
			}
			System.out.println("The reverse number is:" + reverse);
			
			
			
			 
		}
	}



