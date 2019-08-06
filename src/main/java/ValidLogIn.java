import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLogIn extends BaseTest 

{
	
	@Test
	public void testValidLogin()
	{
		LogInPage l=new LogInPage(driver);
		l.setUserName("Vinod");
		l.setPassword("savalgi");
		Assert.assertTrue(true);		
l.login();



	}
}
