package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebElement winner, team, score;
        WebElement draw1, draw2, teamDraw1, teamDraw2, scoreDraw1, scoreDraw2;
        String league;
        int i = 1;

        for (WebElement item : finalScores) {
            league = driver.findElement(By.xpath("(//div[contains(@class,'cscore--final')])[" + i + "]/preceding::h2[contains(@class, 'scoreLabel_title')][1]")).getAttribute("innerHTML");

            if(item.getAttribute("class").contains("cscore--away-winner")) {
                winner = item.findElement(By.cssSelector(".cscore_item--away"));
                team = winner.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                score = item.findElement(By.xpath("./descendant::li[contains(@class, 'cscore_item') and contains(@class, 'cscore_item--away')]/descendant::div[@class='cscore_score update__score  ']"));

                System.out.println("League: " + league + ". Away winner: " + team.getAttribute("innerHTML") + ". Score: " + score.getAttribute("innerHTML").trim());
                //System.out.println("League: " + league + ". Away winner: " + team.getAttribute("innerHTML"));
            } else if(item.getAttribute("class").contains("cscore--home-winner")) {
                winner = item.findElement(By.cssSelector(".cscore_item--home"));
                team = winner.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                score = item.findElement(By.xpath("./descendant::li[contains(@class, 'cscore_item') and contains(@class, 'cscore_item--home')]/descendant::div[@class='cscore_score update__score  ']"));

                System.out.println("League: " + league + ". Home winner: " + team.getAttribute("innerHTML") + ". Score: " + score.getAttribute("innerHTML").trim());
                //System.out.println("League: " + league + ". Home winner: " + team.getAttribute("innerHTML"));
            } else if(item.getAttribute("class").contains("top cscore--final")) {
                draw1 = item.findElement(By.cssSelector(".cscore_item--away"));
                teamDraw1 = draw1.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                scoreDraw1 = item.findElement(By.xpath("./descendant::li[contains(@class, 'cscore_item') and contains(@class, 'cscore_item--away')]/descendant::div[@class='cscore_score update__score  ']"));

                draw2 = item.findElement(By.cssSelector(".cscore_item--home"));
                teamDraw2 = draw2.findElement(By.cssSelector("span[class='cscore_name cscore_name--long']"));
                scoreDraw2 = item.findElement(By.xpath("./descendant::li[contains(@class, 'cscore_item') and contains(@class, 'cscore_item--home')]/descendant::div[@class='cscore_score update__score  ']"));

                System.out.println("League: " + league + ". Draw! between: " + teamDraw1.getAttribute("innerHTML") + " (score: " + scoreDraw1.getAttribute("innerHTML").trim() + ")"+
                        " and: " + teamDraw2.getAttribute("innerHTML") + " (score: " + scoreDraw2.getAttribute("innerHTML").trim() +")");
            }

            i++;
        }

        /*
            this XPATH founds all the div scores:
            //div[@id='global-viewport']/descendant::section[@id='global-scoreboard']/descendant::div[@class='scores-carousel']/ul/li/div/div[@data-league]/following-sibling::div
         */

        driver.close();
        driver.quit();
    }
}
