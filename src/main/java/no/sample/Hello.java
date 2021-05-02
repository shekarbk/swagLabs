package no.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
        WebElement password=driver.findElement(By.id("password"));
        WebElement login=driver.findElement(By.xpath("//*[@id='login-button']"));
        
        username.sendKeys("locked_out_user");
        password.sendKeys("secret_sauce");
        login.click();
        
        String actualUrl="https://www.saucedemo.com/inventory.html";
        String expectedUrl= driver.getCurrentUrl();
//        Assert.assertEquals(expectedUrl,actualUrl);
	}

}
