package testNg.demo1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginBaidu {
	  private WebDriver driver = ChromeUtils.initChrome();
	    
	    @Test
	    public void loginBaidu() {
	    	TestPage myPage = PageFactory.initElements(driver, TestPage.class);
	        driver.get("https://www.baidu.com");
	        myPage.login("宫商角徵羽", "sl62648789");
	    } 
}