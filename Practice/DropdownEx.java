package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//select[@aria-label='rows per page']"));
		Select st=new Select(drop);
		st.selectByIndex(5); 
		Thread.sleep(3000);driver.quit();
	}
}
