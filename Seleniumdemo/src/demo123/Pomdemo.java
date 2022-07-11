

package demo123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomdemo {

	
	@FindBy(xpath="//input[@name='q']") private WebElement SEARCH;
	public Pomdemo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
public void search() {
	SEARCH.sendKeys("selenium");
	
}
}

