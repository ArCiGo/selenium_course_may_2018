package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Tarea18 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.espn.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<WebElement> divLeaguesListElements = driver.findElements(By.xpath("//div[@id='global-viewport']/descendant::section[@id='global-scoreboard']/descendant::div[@class='scores-carousel']/ul/li/div/div[@data-league]"));
        for (WebElement item : divLeaguesListElements) {
            System.out.println(item.getAttribute("data-league"));
        }

        List<WebElement> divScoresListElements = driver.findElements(By.xpath("//div[@id='global-viewport']/descendant::section[@id='global-scoreboard']/descendant::div[@class='scores-carousel']/ul/li/div/div[@data-league]/following-sibling::div"));
        for (WebElement item : divScoresListElements) {
            if(item.getAttribute("class").contains("cscore--away-winner")) {
                WebElement awayWinnerElement = item.findElement(By.xpath("./*[contains(@class, 'cscore_link')]/descendant::ul/li[1]/div[contains(@class, 'cscore_team')]/div[contains(@class, 'cscore_score')]/span"));

                System.out.println("Score: " + awayWinnerElement.getText());
            } else if(item.getAttribute("class").contains("cscore--home-winner")) {
                WebElement homeWinnerElement = item.findElement(By.xpath("./*[contains(@class, 'cscore_link')]/descendant::ul/li[1]/div[contains(@class, 'cscore_team')]/div[contains(@class, 'cscore_score')]/span"));

                System.out.println("Score: " + homeWinnerElement.getText());
            }
        }

        /*
            //div[@id='global-viewport']/descendant::section[@id='global-scoreboard']/descendant::div[@class='scores-carousel']/ul/li/div/div[@data-league]/following-sibling::div
         */

        driver.close();
        driver.quit();
    }
}
