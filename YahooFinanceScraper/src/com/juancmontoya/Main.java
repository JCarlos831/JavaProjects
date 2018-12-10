package com.juancmontoya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://login.yahoo.com/?.src=finance&.intl=us&.done=https%3A%2F%2Ffinance.yahoo.com%2Fportfolios&add=1");

        driver.findElement(By.id("login-username")).sendKeys("testfinance@yahoo.com" + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("login-passwd")).sendKeys("3eggWhites6Almonds" + Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"fin-tradeit\"]/div[2]/div/div/div[2]/button[2]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main\"]/section/section/div[2]/table/tbody/tr/td[1]/a")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main\"]/section/section[1]/ul/li[2]/a")).click();

        Thread.sleep(5000);

        // Portfolio Summary

        String portfolioSummary = "";

        String portfolioValue = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[1]")).getText() + ", ";

        String portfolioDayGain = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[2]/span")).getText();

        String array1[] = portfolioDayGain.split(" ");

        portfolioDayGain = array1[0] + ", ";

        String portfolioDayGainPercent = array1[1] + ", ";

        String portfolioTotalGain = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[3]/span")).getText();

        String array2[] = portfolioTotalGain.split(" ");

        portfolioTotalGain = array2[0] + ", ";

        String portfolioTotalGainPercent = array2[1];

        portfolioSummary += portfolioValue + portfolioDayGain + portfolioDayGainPercent + portfolioTotalGain + portfolioTotalGainPercent;

        System.out.println(portfolioSummary);

        // Portfolio Table

        List<String> stockData = new ArrayList<>();

        WebElement table = driver.findElement(By.className("tJDbU "));

        List<WebElement> tableRows = table.findElements(By.tagName("tr"));

        for (WebElement tableRow : tableRows) {
            List<WebElement> tableColumns = tableRow.findElements(By.tagName("td"));

            if (tableColumns.size() > 0) {
                for (WebElement tableColumn : tableColumns) {
//                    stockData += tableColumn.getText() + ", ";
                    stockData.add(tableColumn.getText());
                }

//                String array3[] = stockData.split(", ");

                String[] array4 = stockData.get(0).split("\n");
                String symbol = array4[0];
                String lastPrice = array4[1];

                String[] array5 = stockData.get(1).split("\n");
                String priceChange = array5[0];
                String priceChangePercent = array5[1];

                String shares = stockData.get(2);
                String costBasis = stockData.get(3);
                String marketValue = stockData.get(4);

                String[] array6 = stockData.get(5).split("\n");
                String dayGainPriceChange = array6[0];
                String dayGainPriceChangePercent = array6[1];

                String[] array7 = stockData.get(6).split("\n");
                String totalGainPriceChange = array7[0];
                String totalGainPriceChangePercent = array7[1];

                System.out.println(symbol + " " + lastPrice  + " " + priceChange + " " + priceChangePercent + " " +
                        shares + " " + costBasis + " " + marketValue + " " + dayGainPriceChange + " " + dayGainPriceChangePercent + " " +
                        totalGainPriceChange + " " + totalGainPriceChangePercent);
//                System.out.println(stockData);
            }
//            stockData = "";
            stockData.clear();
        }

        driver.quit();

    }
}
