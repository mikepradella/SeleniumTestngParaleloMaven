package Teste.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class seleniumParallTestng {
	
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\mike.pradella\\eclipse-workspace\\SeleniumGridStandalone\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
//        System.setProperty("webdriver.firefox.marionette","C:\\Users\\mike.pradella\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
            //Goto guru99 site
//    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mike.pradella\\eclipse-workspace\\SeleniumGridStandalone\\chromedriver.exe");
//          WebDriver driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
        
    @Test    
        public void executSessionThree(){
            //Third session of WebDriver
//        System.setProperty("webdriver.edge.driver","C:\\Users\\mike.pradella\\Downloads\\MicrosoftWebDriver.exe");
        WebDriver driver = new EdgeDriver();
            //Goto guru99 site
//    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mike.pradella\\eclipse-workspace\\SeleniumGridStandalone\\chromedriver.exe");
//          WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        
        }        

}
