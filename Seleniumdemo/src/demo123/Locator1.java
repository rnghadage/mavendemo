package demo123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C://Users//ats//Downloads//chromedriver_win32//chromedriver.exe/");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class=\"gb_d\"]")).click();
	}

}
