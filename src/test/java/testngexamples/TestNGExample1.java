package testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample1 extends BaseTest {

    @Test
    public static void passTC() {
        String expectedURL = "https://www.google.com.mx/";

        driver.navigate().to("https://www.google.com.mx/");

        Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
    }
}
