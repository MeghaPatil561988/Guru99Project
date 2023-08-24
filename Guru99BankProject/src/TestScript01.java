/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.MarionetteDriver;


/**
 * 
 * @author Krishna Rungta
 *        Test Script 01
 *        ************** 
 *        Test Steps
 *        1)  Go to http://www.demo.guru99.com/V4/
          2) Enter valid UserId
          3) Enter valid Password
          4) Click Login
 */

public class TestScript01 {

    

    public static void main(String[] args) throws Exception {	  
	
    	//Setup Chrome driver    	
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Megha\\eclipse-workspace\\Guru99BankProject\\drivers\\chromedriver.exe");
    	 System.setProperty("webdriver.gecko.driver", "E:\\Selenium Folder\\geckodriver-v0.27.0-win64\\geckodriver.exe");
    	 //WebDriver driver = new ChromeDriver();
      	 WebDriver driver = new FirefoxDriver();
    	
    	 
	    //WebDriver driver = new ChromeDriver();
    	 System.out.println("Execution started-- Opening Firefox browser.");
    	String baseUrl = "http://www.demo.guru99.com/V4/";
    	
    	// launch Firefox and direct it to the Base URL
    	driver.get(baseUrl);


	    // Enter username
	    driver.findElement(By.name("uid")).sendKeys("mngr293217");

	    // Enter Password
	    driver.findElement(By.name("password")).sendKeys("demavAs");
   
	    //Manger Id : mngr293217
	    
	    // Click Login
	    driver.findElement(By.name("btnLogin")).click();
	    
	    driver.close();


	    }
	

    }

