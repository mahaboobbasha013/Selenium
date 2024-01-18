package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement click=driver.findElement(By.xpath("//a[@aria-label='Watches']"));
		Actions ac=new Actions(driver);
		//click operation
		ac.click(click).build().perform();
		//right click operation
		ac.contextClick().build().perform();
		//mouse over operation
		//ac.moveToElement(click).build().perform();
		WebElement text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions s=new Actions(driver);
		s.click(text).sendKeys("iphone 15").build().perform();
		Thread.sleep(3000); driver.quit();

	}
}
