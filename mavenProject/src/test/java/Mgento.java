

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Mgento {
	
	@Test
	public void positiveCredial()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://magento.com/");
		Welcome w=new Welcome(driver);
		w.clickOnMyAccount();
		
		
		Login l= new Login(driver);
		l.typeEmail("ihassan395");
		l.typePwd("Welcome@123");
		l.clickLogin();

		
      Home h =new Home(driver);
		h.clickOnLogOut();
		
	}
}
