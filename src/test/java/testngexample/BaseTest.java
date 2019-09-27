package testngexample;

import com.qalabs.seleniumbasics.WebDriverFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected WebDriver myDriver;
    @BeforeClass (alwaysRun= true)
    public void setUp(){
        //Define which browser to use
        String browser = "chrome";

        //Get correct driver for desire browser
        myDriver = WebDriverFactory.getDriver(browser);

    }
    @AfterClass(alwaysRun = true)
    public void tearDown(){
        myDriver.close();
        myDriver.quit();
    }
}
