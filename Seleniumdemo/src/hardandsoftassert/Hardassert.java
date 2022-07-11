package hardandsoftassert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassert {
  @Test
  public void Verifypagetitle() {
	  String expected_Title="Prachi1";
	  String actual_Title = "Prachi";
	  System.out.println("Test casse exucution started");
  Assert.assertEquals("Prachi", "Prachi1");
  System.out.println("Test case exucution failed ");
  }
}
