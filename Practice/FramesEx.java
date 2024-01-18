package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesEx {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(element);
		WebElement gettext=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(gettext.getText());
	}
}
