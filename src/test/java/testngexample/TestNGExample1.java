package testngexample;

<<<<<<< HEAD
import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.WebDriver;
=======
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

<<<<<<< HEAD
public class TestNGExample1 {
    @Test
    public static void passTC() {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.manage().window().maximize();
        testDriver.get("https://www.google.com.mx/");

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertEquals(testDriver.getCurrentUrl(), "https://www.google.com.mx/", "Parece que no es Google");

        testDriver.close();

        testDriver.quit();
=======
public class TestNGExample1  extends BaseTest{
    @Test
    public static void openGoogle() {
           // String browser = "chrome";
            //WebDriver testDriver = WebDriverFactory.getDriver(browser);
           // testDriver.manage().window().maximize();
            //testDriver.get("https://www.google.com.mx/");
            BaseTest myClase = new BaseTest();
            myClase.setup();
            myClase.myDriver.get("https://www.google.com.mx/");
            //testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            myClase.myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //Assert.assertEquals(testDriver.getCurrentUrl(), "https://www.google.com.mx/", "Parece que no es Google");
            Assert.assertEquals(myClase.myDriver.getCurrentUrl(), "https://www.google.com.mx/", "Parece que no es Google");
            //testDriver.close();
            //testDriver.quit();
            myClase.tearDown();
>>>>>>> 403dc249fffcaa6f2a96617a1d8298ad672d653b
    }
}
