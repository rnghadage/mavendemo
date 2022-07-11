package demo123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C://Users//ats//Downloads//chromedriver_win32//chromedriver.exe/");

WebDriver driver =new  ChromeDriver();
driver.get("https://techcanvass.com/Examples/multi-select.html");
driver.manage().window().maximize();
Thread.sleep(2000);
File s= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File d = new File("/C://Users//ats//OneDrive//Desktop//New Bitmap Image.bmp/");
FileUtils.copyFile(s, d);




	}

}
