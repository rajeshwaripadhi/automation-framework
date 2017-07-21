package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

	protected WebDriver driver;
	@Test
	public void guru99()
	{
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String eTittle="Meet Guru99";
	String aTittle="";
	driver.get("http://www.guru99.com/");
	driver.manage().window().maximize();
	aTittle=driver.getTitle();
	if(aTittle.contentEquals(eTittle))
	{
	System.out.println("Test passed");
	}
	else{
	System.out.println("Test failed");
	}
	
	driver.close();
	
	}
}
