package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumCSS02 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver testDriver = WebDriverFactory.getDriver(browser);
        testDriver.manage().window().maximize();
        testDriver.get("https://www.espn.com.mx/");

        List<WebElement> partidoElement;

        testDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> myElements = testDriver.findElements(By.cssSelector("h2[class='scoreLabel_title']"));

        for(WebElement elemento: myElements) {
            System.out.println("Liga: " + elemento.getText());
        }

        List<WebElement> gamesElements = testDriver.findElements(By.xpath("//span[contains(@class,'cscore_name--long')]/preceding::div[@class='cscore_team  icon-font-after']"));

        System.out.println("Games Elem.: " + gamesElements.size());
        int otro = 0;
        String equipo1 = "";
        int goles1 = 0;
        String equipo2 = "";
        int goles2 = 0;
        for(WebElement elemento: gamesElements) {
            if(elemento.getText().length() > 1) {
                if(otro == 0) {
                    otro++;
                    equipo1 = elemento.getText().substring(0, elemento.getText().length() - 2);
                    goles1 = Integer.parseInt(elemento.getText().substring(elemento.getText().length() - 1, elemento.getText().length()));
                } else {
                    otro = 0;
                    equipo2 = elemento.getText().substring(0, elemento.getText().length() - 2);
                    goles2 = Integer.parseInt(elemento.getText().substring(elemento.getText().length() - 1, elemento.getText().length()));

                    if(goles1 > goles2) {
                        System.out.println("Gano " + equipo1 + " Anoto: " + goles1);
                    } else if(goles1 == goles2) {
                        System.out.println("EMPATE");
                    } else {
                        System.out.println("Gano " + equipo2 + " Anoto: " + goles2);
                    }
                }
            }
        }

        testDriver.close();

        testDriver.quit();

    }
}