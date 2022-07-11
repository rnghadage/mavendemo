package demo123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pommain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//ats//Downloads//chromedriver_win32//chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
Thread.sleep(2000);
Pomdemo pom = new Pomdemo (driver);
pom.search();
Thread.sleep(2000);
Pomdemo1 pom1 = new Pomdemo1 (driver);

		pom1.gmail();
		
		
		
		
		
		
	}

}
