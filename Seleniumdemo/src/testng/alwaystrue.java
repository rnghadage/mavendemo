package testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class alwaystrue {
  @Test(priority=2)
  public void login () {
	  System.out.println("login successfully");
	  
  }
  @Test(priority=2)
  public void logout() {
	  System.out.println("logout successfully");
  }
  @Test(dependsOnMethods= {"advanceSearch"},alwaysRun = true)
  public void search() {
	  System.out.println("Search succesfully");
	  
	  
  }
  
  
  @Test
  public void advanceSearch() {
  
  Assert.assertEquals("Rohit", "Rohit");
}
}
