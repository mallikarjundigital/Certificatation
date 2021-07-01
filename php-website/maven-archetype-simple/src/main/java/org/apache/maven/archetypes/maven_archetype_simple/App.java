package org.apache.maven.archetypes.maven_archetype_simple;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class App
{
 @Test

 public static void main(String[] args) {

 
 System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
 ChromeOptions chromeOptions = new ChromeOptions();
 WebDriver driver = new ChromeDriver(chromeOptions);

 driver.get("http://localhost:8001");
 
 System.out.println("Hi, Your are testing the PHP Website using Selenium WebDriver");


 
 // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
// driver.find_element_by_id 
 driver.findElement(By.id("About Us")).click() ;
 driver.findElement(By.linkText("About Us")).click();  
 
 //Thread.sleep(5000);
 driver.quit();
 }

}