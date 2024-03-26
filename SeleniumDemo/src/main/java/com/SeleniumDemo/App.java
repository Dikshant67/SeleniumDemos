package com.SeleniumDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//      driver.manage().window().maximize(); //1 .for maximizing the window 
//      driver.manage().window().fullscreen(); //2. for fullscreen window
      //3.Setting size of the window.
      //for this we need to create a Dimension class object
//      Dimension d=new Dimension(300,530);
//      driver.manage().window().setSize(d);
//      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      WebDriverWait wait = new WebDriverWait(driver, 10);
      WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));

      // Perform actions on the button
      button.click();
    }
}
