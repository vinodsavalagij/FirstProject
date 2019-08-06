import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconst 

{
	public WebDriver driver;
	
	@BeforeMethod
	public void openapplication()
	{
		System.out.println("Vinod");
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new FirefoxDriver();
		
		driver.get("http://www.google.com");
	}
	

}
*/

public class BaseTest implements Autoconst
{
	
	public WebDriver driver;
	@BeforeTest
public void test()
{
System.out.println("viod");	



	System.out.println("Vinod");
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	driver=new FirefoxDriver();
	
	driver.get(URL);

}
	
	@AfterMethod
	public void closeBrowser()
	{
		
		driver.close();
	}
}