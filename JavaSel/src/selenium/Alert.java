package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "aarsha";
		System.setProperty("webdriver.chrome.driver","C:/Users/AARSNK/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.className("btn-style")).click();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
	}

}
