package TestNg1;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class TestNg1 {
	
	@AfterTest(enabled=false)
	public void AfterTest() {
		System.out.println("Attitude... :)");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	
	@Test(dependsOnMethods="BsecondTest")
	public void AfirstTest() {
		System.out.println("This is first test");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
		Assert.assertTrue(false);
	}
	
	@Test
	public void BsecondTest() {
		System.out.println("This is Second test");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("I am not who so ever...");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("****************");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);*/
	}
	
	/*@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("-------------");
		/*long id = Thread.currentThread().getId();
        System.out.println("Thread id is: " + id);
	}*/
	@Test    
    public void executSessionOne(){
            //First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "C:\\WW300950\\Nileshdutta\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            //Goto guru99 site
            driver.get("http://demo.guru99.com/V4/");
            //find user name text box and fill it
            driver.findElement(By.name("uid")).sendKeys("Driver 1");
            
        }
        
    @Test    
        public void executeSessionTwo(){
            //Second session of WebDriver
    	System.setProperty("webdriver.firefox.marionette","C:\\WW300950\\Nileshdutta\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //Goto guru99 site        
        driver.get("http://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        
        }
	

}
