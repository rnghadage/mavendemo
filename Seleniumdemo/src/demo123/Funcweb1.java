package demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Funcweb1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C://Users//ats//Downloads//chromedriver_win32//chromedriver.exe/");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://www.google.co.in/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String abc = driver.findElement(By.linkText("Gmail")).getText();
	
			System.out.println(abc);
			
	
	}

}


