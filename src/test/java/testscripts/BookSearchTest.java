package testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookSearchTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		  WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	      driver.get("https://danube-webshop.herokuapp.com/");
		
	}
	
	
  @Test
  public void bookSearch() {
	  
	  
//      driver.get("https://danube-webshop.herokuapp.com/");
      driver.findElement(By.xpath("//a[contains(text(), 'Crime & Thrillers')]")).click();
      String strURL = driver.getCurrentUrl();
      Assert.assertTrue(strURL.contains("crime"));
	  
		}
  
  @Test
  public void novelSearch() {
	  
	  
//      driver.get("https://danube-webshop.herokuapp.com/");
      driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
      String strURL = driver.getCurrentUrl();
      Assert.assertTrue(strURL.contains("novel"));
  		}
  
  //@Test
  public void fantasySearch() {
	  
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://danube-webshop.herokuapp.com/");
      driver.findElement(By.xpath("//a[contains(text(), 'Fantasy')]")).click();
      String strURL = driver.getCurrentUrl();
      Assert.assertTrue(strURL.contains("fantasy"));
  		}
  
  
  //@Test
  public void HorrorSearch() {
	  
	  WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://danube-webshop.herokuapp.com/");
      driver.findElement(By.xpath("//a[contains(text(), 'Horror')]")).click();
      String strURL = driver.getCurrentUrl();
      Assert.assertTrue(strURL.contains("horror"));
  		}
  
  @AfterMethod
  public void teardown() {
	 driver.close();
  }
  
}
