package testscripts;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GooglePageTest {
	
  @Test
  public void seleniumsearch() {
	  
	  
//	  ChromeOptions Options = new ChromeOptions();
//	  Options.setBrowserVersion("120");
//	  WebDriver driver = new ChromeDriver(Options);
	  WebDriver driver = new ChromeDriver();
//	  WebDriver driver = new EdgeDriver();
	  
	  driver.manage().window().maximize();
//	  driver.manage().deleteAllCookies();
//	  
	  driver.get("https://the-internet.herokuapp.com/login");
//	  driver.navigate().to("https://the-internet.herokuapp.com/login");
	  WebElement name = driver.findElement(By.id("username"));
//	  WebElement name = driver.findElement(By.xpath("//input[@type='text' and id='username']"));
	  name.sendKeys("tomsmith");
//	  name.clear();
//	  name.sendKeys("welcometomsmith");
	  WebElement pwd = driver.findElement(By.name("password"));
	  pwd.sendKeys("SuperSecretPassword!");
	  pwd.sendKeys(Keys.ENTER);
//	  WebElement loginbutn = driver.findElement(By.className("radius"));
//	  WebElement loginbutn = driver.findElement(By.tagName("button"));
//	  WebElement loginbutn = driver.findElement(By.xpath("//i[@class='fa fa-2x fa-sign-in']"));
//	  WebElement loginbutn = driver.findElement(By.cssSelector("fa fa-2x fa-sign-in"));
//	  WebElement loginbutn = driver.findElement(By.tagName("button"));
	  
//	  loginbutn.click();
//	  loginbutn.submit();
	  
//	  WebElement logoutbutton = driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']"));
//	  logoutbutton.click();
//	  
//	  driver.navigate().back();
//	  System.out.println(driver.getTitle());
//	  System.out.println(driver.getCurrentUrl());
//	  driver.navigate().forward();
//	  System.out.println(driver.getCurrentUrl());

//	  driver.findElement(By.linkText("Elemental Selenium")).click();
//	  driver.findElement(By.partialLinkText("Elemental")).click();
	  
	  
	  
	  
//	  driver.get("https://www.google.com/");
//	  WebElement searchBox = driver.findElement(By.id("APjFqb"));
//	  searchBox.sendKeys("Selenium Tutorials");
//	  searchBox.sendKeys(Keys.ENTER);
	  
//	  driver.get("https://accounts.lambdatest.com/register");
//	  WebElement name = driver.findElement(By.xpath("//form[@class='form reg-custom']/p[@id='email']"));
//	  
	  
//	  driver.navigate().to("https://www.lambdatest.com/blog/");
////	  WebElement name = driver.findElement(By.xpath("//div[@class='header__menu__items']/a"));
////	  WebElement name = driver.findElement(By.xpath("(//div[@class='dropdown rs-dropdown dropdown_blog item_link'])[4]"));
//	  WebElement name = driver.findElement(By.xpath("(//div[@class='dropdown rs-dropdown dropdown_blog item_link'])[4]"));
//	  name.click();

	  

	  

	  
	  
	 
//	  
  }
}
