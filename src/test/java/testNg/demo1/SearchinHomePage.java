
package testNg.demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchinHomePage {
	
    private WebDriver driver = ChromeUtils.initChrome();
    
    @Test
    public void search() {
    	TestPage myPage = PageFactory.initElements(driver, TestPage.class);
        driver.get("https://www.baidu.com");
        myPage.kw_sendkes("helenMemery");
        myPage.su_click();
    }
    
    @Test
    public void f2() {
        Assert.assertEquals("b", "b");
    }
    
    
    @AfterTest
    public void close(){
        driver.close();
    }

}