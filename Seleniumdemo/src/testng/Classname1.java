package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Classname1 {
  @Test
  public void login() {
	  System.out.println("login succsessfully");
	  
  }
  @Test 
  public void logout()
  {System.out.println("logout successfullu");
	  
  }
  @Test(dependsOnMethods= {"advanceSearch"})
  public void search() {
	  System.out.println("Search successfully");
	  
  }
  @Test
  public void advanceSearch()
  {
	  Assert.assertEquals("gmail","gmail1");
  }
}
