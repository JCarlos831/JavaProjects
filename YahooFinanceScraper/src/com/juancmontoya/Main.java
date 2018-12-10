package com.juancmontoya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.navigate().to("https://login.yahoo.com/?.src=finance&.intl=us&.done=https%3A%2F%2Ffinance.yahoo.com%2Fportfolios&add=1");

        driver.findElement(By.id("login-username")).sendKeys("testfinance@yahoo.com" + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("login-passwd")).sendKeys("3eggWhites6Almonds" + Keys.ENTER);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"fin-tradeit\"]/div[2]/div/div/div[2]/button[2]")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"main\"]/section/section/div[2]/table/tbody/tr/td[1]/a")).click();

        Thread.sleep(5000);

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

        driver.quit();

    }
}
