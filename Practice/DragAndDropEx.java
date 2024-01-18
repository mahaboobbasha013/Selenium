package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement Drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(Drag, Drop).build().perform();
		Thread.sleep(3000);
		driver.get("https://demoqa.com/dragabble");
		WebElement drag=driver.findElement(By.xpath("//div[@id='dragBox']"));
		ac.dragAndDropBy(drag, 1000, 0).build().perform();
		Thread.sleep(3000);driver.quit();
	}

}
