package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class NestedFramesEx {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/nestedframes");
		WebElement parentframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(parentframe);
		WebElement parent_text=driver.findElement(By.xpath("//body"));
		System.out.println(parent_text.getText());
		WebElement childframe=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		WebElement child_text=driver.findElement(By.xpath("//body"));
		System.out.println(child_text.getText());
		driver.quit();
	}

}
