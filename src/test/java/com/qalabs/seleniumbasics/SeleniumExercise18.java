package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumExercise18 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {
        String browser = "chrome";
        WebDriver driver = WebDriverFactory.getDriver(browser);
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.manage().window().maximize();
        driver.navigate().to("https://www.espn.com.mx/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Scores");

        List<WebElement> finalScores = driver.findElements(By.cssSelector(".cscore--final"));
        WebElement winner, score;
        String league;

        for (int i = 0; i < finalScores.size(); i++) {
            league = driver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])[" + i + "]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");

            if(finalScores.get(i).getAttribute("class").contains("cscore--away-winner")) {
                winner = finalScores.get(i).findElement(By.cssSelector(".cscore_item--away"));
                score = winner.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));

                System.out.println(league + ". Away winner: " + score.getAttribute("innerHTML"));
            } else if(finalScores.get(i).getAttribute("class").contains("csclre--home-winner")) {
                winner = finalScores.get(i).findElement(By.cssSelector(".cscore_item--away"));
                score = winner.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));

                System.out.println(league + ". Home winner: " + score.getAttribute("innerHTML"));
            }
        }

        /*
            this XPATH founds all the div scores:
            //div[@id='global-viewport']/descendant::section[@id='global-scoreboard']/descendant::div[@class='scores-carousel']/ul/li/div/div[@data-league]/following-sibling::div
         */

        driver.close();
        driver.quit();
    }
}
