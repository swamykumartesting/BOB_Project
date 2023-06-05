package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Gmail {
	
	public WebDriver driver; 
	
	public void openurl() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	
    public void createaccount() {
    	
    	driver.findElement(By.name("firstName")).sendKeys("APJ Kalams");
    	
			
	}
	
     public void login() {
		
		driver.findElement(By.name("identifier")).sendKeys("raja@gmail.com");
	}
     
     public void logout() {
    	
    	 driver.findElement(By.name("logr")).click();
 		
 	}
 

	public static void main(String[] args) {

		Gmail g = new Gmail();
		g.openurl();
		g.createaccount();
		g.login();
		g.logout();

	}

}
