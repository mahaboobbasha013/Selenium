package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MosehoverOperationEx {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement mousehover=driver.findElement(By.xpath("//span[@class='_27h2j1']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(mousehover).build().perform();
	}
}
