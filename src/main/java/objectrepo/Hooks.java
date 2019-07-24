package objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
		public static WebDriver driver;
		@Before
		public static void before() throws Throwable {
			   System.setProperty("webdriver.chrome.driver", "F:\\Selenium-cucumber\\Telecom\\driver\\chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.get("http://demo.guru99.com/telecom/");
			
		}
		@After
		public static void after() {
			driver.close();

			driver.quit();
		}
}
