
package testcase;

import java.util.Scanner;

public class Arithmetic1 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
String name = sc.next();
int leng = name.length();
System.out.println(leng);
String rev="";
for(int i = leng-1;i>=0;i--) {
	rev = rev+name.charAt(i);
	
}
System.out.println("Reverse of string is::"+rev);

	}

}