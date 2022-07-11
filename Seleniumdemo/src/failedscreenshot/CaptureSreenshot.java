package failedscreenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CaptureSreenshot extends MainTest {
@Test
public void captureSreenshot() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Users//ats//Downloads//chromedriver_win32//chromedriver.exe/");
	driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(2000);
String title= driver.getTitle();
Assert.assertEquals("Home", title);
Thread.sleep(6000);
driver.close();
}
}
