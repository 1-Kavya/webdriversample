package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void dynamicWebTable() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  List<webelements> items = driver.findelements();
	  
  }
}
