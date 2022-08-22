package mavendemo;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePages;

public class Selenium {
	public void setup() {
		protected HomePages homePage;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\suman\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.youtube.com/watch?v=oo8hakhidQM&t=1204s");
		driver.get("https://the-internet.herokuapp.com/");
		homePage=new HomePages(driver)
		driver .manage().window().maximize();
		
		System.out.println(driver.getTitle());
		driver .manage().window().fullscreen();
		
	   /* List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		WebElement inputLink=driver.findElement(By.linkText("Hovers"));
		inputLink.click();*/
		
	    //driver .manage().window().setSize(new Dimension(393,381));
		
		//driver.quit();
		
	}
	public static void main(String ...args) {
		Selenium obj=new Selenium();
		obj.setup();
		
		
		
	}

}
