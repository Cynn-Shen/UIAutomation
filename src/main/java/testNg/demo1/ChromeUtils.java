
package testNg.demo1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeUtils {
	
    public  class ChromeAction implements WebDriver {
    	

		@Override
		public void close() {
			// TODO Auto-generated method stub

		}
		@Override
		public void get(String url) {
			// TODO Auto-generated method stub

		}

		@Override
		public String getCurrentUrl() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getTitle() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<WebElement> findElements(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public WebElement findElement(By by) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getPageSource() {
			// TODO Auto-generated method stub
			return null;
		}



		@Override
		public void quit() {
			// TODO Auto-generated method stub

		}

		@Override
		public Set<String> getWindowHandles() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getWindowHandle() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TargetLocator switchTo() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Navigation navigate() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Options manage() {
			// TODO Auto-generated method stub
			return null;
		}

	}
    
	static WebDriver driver = null;
    protected static DesiredCapabilities capabilities;
    
    public static WebDriver initChrome() {
        capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
//        System.setProperty("webdriver.chrome.driver", getClass().getResource("/src/test/resources/chromedriver.exe").getPath());
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\TestNgframework\\demo1\\src\\test\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}