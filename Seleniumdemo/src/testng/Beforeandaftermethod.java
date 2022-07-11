package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforeandaftermethod {
  @BeforeMethod
  public void login() {
	  System.out.println("login successfully");
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("Logout Successsfully");
  }
  @Test(priority=1)
  public void addVendor()
  {
	  System.out.println("add vendor successfully");
	  
  }
  @Test(priority=2)
  public void addProduct()
  {
	  System.out.println("add product successfully");
	  
  }
  @Test(priority= 3)
  public void aadCurrency()
  {
	  System.out.println("Add currency successfully");
  }
}
