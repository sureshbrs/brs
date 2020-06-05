

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;

	public Home(WebDriver driver) {
		
		this.driver = driver;
	}
	By LogOut= By.linkText("LogOut");
	
	
	public void clickOnLogOut()
	{
		driver.findElement(LogOut).click();	
			
	}

}
