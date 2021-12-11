package AlertHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import systemProperty.setProperty;

public class getAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setProperty systemProperty = new setProperty();
		systemProperty.setData();

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);

		driver.findElement(By.id("name")).sendKeys("Himalaya");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		// driver.findElement(By.id("confirmbtn")).click();

		driver.findElement(By.id("name")).sendKeys("Shinde");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		driver.quit();
	}

}
