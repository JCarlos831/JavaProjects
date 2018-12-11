package com.juancmontoya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void scrape() throws SQLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        ChromeDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://login.yahoo.com/?.src=finance&.intl=us&.done=https%3A%2F%2Ffinance.yahoo.com%2Fportfolios&add=1");

        driver.findElement(By.id("login-username")).sendKeys("testfinance@yahoo.com" + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.id("login-passwd")).sendKeys("3eggWhites6Almonds" + Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"fin-tradeit\"]/div[2]/div/div/div[2]/button[2]")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"main\"]/section/section/div[2]/table/tbody/tr/td[1]/a")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id=\"main\"]/section/section[1]/ul/li[2]/a")).click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        // Portfolio Summary

        List<String> portfolioSummary = new ArrayList<>();

        String netWorth = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[1]")).getText();

        portfolioSummary.add(netWorth);

        String portfolioDayGain = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[2]/span")).getText();

        String array1[] = portfolioDayGain.split(" ");

        portfolioDayGain = array1[0];

        portfolioSummary.add(portfolioDayGain);

        String portfolioDayGainPercentTemp = array1[1];
        String dayGainPercentTemp = portfolioDayGainPercentTemp.replace("(", "");
        String portfolioDayGainPercent = dayGainPercentTemp.replace(")", "");

        portfolioSummary.add(portfolioDayGainPercent);

        String portfolioTotalGain = driver.findElement(By.xpath("//*[@id=\"main\"]/section/header/div/div[1]/div/div[2]/p[3]/span")).getText();
        portfolioSummary.add(portfolioDayGain);

        String array2[] = portfolioTotalGain.split(" ");

        portfolioTotalGain = array2[0];
        portfolioSummary.add(portfolioTotalGain);

        String portfolioTotalGainPercentTemp = array2[1];
        String totalGainPercentTemp = portfolioTotalGainPercentTemp.replace("(", "");
        String portfolioTotalGainPercent = totalGainPercentTemp.replace(")", "");
        portfolioSummary.add(portfolioTotalGainPercent);

        System.out.println("net worth: " + netWorth + ", day gain: " + portfolioDayGain + ", day gain %: " + portfolioDayGainPercent
        + ", total gain: " + portfolioTotalGain + ", total gain %: " + portfolioTotalGainPercent);

        // Create DB Connection
        Connection conn = null;
        Statement stmt = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:/Users/JuanCMontoya/Projects/IdeaProjects/JavaPrograms/YahooFinanceScraper/Raspador.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

            conn.setAutoCommit(false);

            stmt = conn.createStatement();

            String sql = "INSERT INTO snapshots(netWorth,dayGainChange,dayGainChangePercent,totalGainChange,totalGainChangePercent)VALUES (" + "'" + netWorth + "','" + portfolioDayGain + "','" + portfolioDayGainPercent + "','" + portfolioTotalGain + "','" + portfolioTotalGainPercent + "')";

            System.out.println(sql);
            stmt.executeUpdate(sql);

            stmt.close();

            conn.commit();

            conn.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        // Portfolio Table

        List<String> stockData = new ArrayList<>();

        WebElement table = driver.findElement(By.className("tJDbU "));

        List<WebElement> tableRows = table.findElements(By.tagName("tr"));

        for (WebElement tableRow : tableRows) {
            List<WebElement> tableColumns = tableRow.findElements(By.tagName("td"));

            if (tableColumns.size() > 0) {
                for (WebElement tableColumn : tableColumns) {
                    stockData.add(tableColumn.getText());
                }

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

//                System.out.println(symbol + " " + lastPrice  + " " + priceChange + " " + priceChangePercent + " " +
//                        shares + " " + costBasis + " " + marketValue + " " + dayGainPriceChange + " " + dayGainPriceChangePercent + " " +
//                        totalGainPriceChange + " " + totalGainPriceChangePercent);

                // Create DB Connection
                conn = null;
//                stmt = null;
                try {
                    // db parameters
                    String url = "jdbc:sqlite:/Users/JuanCMontoya/Projects/IdeaProjects/JavaPrograms/YahooFinanceScraper/Raspador.db";
                    // create a connection to the database
                    conn = DriverManager.getConnection(url);

                    System.out.println("Connection to SQLite has been established.");

                    conn.setAutoCommit(false);

                    stmt = conn.createStatement();

                    String sql = "INSERT INTO stocks(symbol,lastPrice,priceChange,priceChangePercent,shares,costBasis,marketValue,dayGainPriceChange,dayGainPriceChangePercent,totalGainPriceChange,totalGainPriceChangePercent)" +
                            "VALUES (" + "'" + symbol + "','" + lastPrice + "','" + priceChange + "','" + priceChangePercent + "','" + shares + "','" + costBasis + "','" + marketValue + "','"
                            + dayGainPriceChange + "','" + dayGainPriceChangePercent + "','" + totalGainPriceChange + "','" + totalGainPriceChangePercent + "')";

                    System.out.println(sql);
                    stmt.executeUpdate(sql);

                    stmt.close();

                    conn.commit();

                    conn.close();

                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                } finally {
                    try {
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                }

            }

            stockData.clear();

        }

        driver.quit();

    }

    public static void main(String[] args) throws SQLException {
        scrape();
    }
}