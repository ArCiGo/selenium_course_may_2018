import com.qalabs.seleniumbasics.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class testd {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        // Wait some seconds
        Thread.sleep(2000);

        assert myDriver.getCurrentUrl().equals("https://es.wikipedia.org/wiki/Wikipedia:Portada") : "Pagina equivocada";

        WebElement busqueda = myDriver.findElement(By.id("searchInput"));
        busqueda.click();
        String topic = "rock";
        busqueda.sendKeys(topic);
        busqueda.submit();
        Thread.sleep(2000);

        for (int i = 0; i<5; i++) {
            buscarTopico(topic, myDriver);
            Thread.sleep(5000);
        }



        // Quit web driver
        myDriver.quit();
    }

    public static void buscarTopico(String topic, WebDriver myDriver) {
        List<WebElement> parrafos = myDriver.findElements(By.tagName("p"));
        int n = 0;
        for (WebElement parrafo : parrafos)
            if (parrafo.getText().contains(topic))
                n++;
        System.out.println(myDriver.getCurrentUrl() + " - " + topic + " - " + n);

        List<WebElement> hiperlinks = myDriver.findElements(By.tagName("a"));
        for (WebElement hiperlink : hiperlinks) {
            if (hiperlink.getText().contains(topic)) {
                hiperlink.click();
                break;
            }
        }


    }
}
