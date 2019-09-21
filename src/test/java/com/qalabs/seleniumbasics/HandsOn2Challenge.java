package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandsOn2Challenge {

        public static void main(String[] args) throws InterruptedException, NullPointerException {
            String browser = "chrome";
            String url="https://www.espn.com.mx/";
            WebDriver myDriver = WebDriverFactory.getDriver(browser);
            myDriver.manage().window().maximize();
            myDriver.get(url);
            myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            List<WebElement> myElementsLeague = myDriver.findElements(By.cssSelector("div[class='scoreLabel_content']"));
            System.out.println("***Leagues: " + myElementsLeague.size());
            for(WebElement elemento: myElementsLeague) {
                System.out.println("Liga: " + elemento.getText());
            }
            System.out.print("***Games played***\n");
            List<WebElement> gamesElements = myDriver.findElements(By.xpath("//span[contains(@class,'cscore_name--long')]/preceding::div[@class='cscore_team  icon-font-after']"));
            //System.out.println("Games Elem.: " + gamesElements.size());
            int aux = 0;
            String team1 = "";
            int score1 = 0;
            String team2 = "";
            int score2 = 0;
            for(WebElement elemento: gamesElements) {
                if(elemento.getText().length() > 1) {
                    if(aux == 0) {
                        aux++;
                        team1 = elemento.getText().substring(0, elemento.getText().length() - 2);
                        score1 = Integer.parseInt(elemento.getText().substring(elemento.getText().length() - 1, elemento.getText().length()));
                    } else {
                        aux = 0;
                        team2 = elemento.getText().substring(0, elemento.getText().length() - 2);
                        score2 = Integer.parseInt(elemento.getText().substring(elemento.getText().length() - 1, elemento.getText().length()));

                        if(score1 > score2) {
                            System.out.println("Winner team "+ team1 + " score: " + score1);
                        } else if(score1 == score2) {
                            //System.out.println("EMPATE");
                        } else {
                            System.out.println("Winner team " + team2 + " score: " + score2);
                        }
                    }
                }
            }

            myDriver.close();

        }
}
