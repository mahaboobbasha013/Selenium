package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinksPrintEx {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		List<WebElement>print=driver.findElements(By.xpath("//a"));
		System.out.println(print.size());
		for(int i=0;i<print.size();i++) {
			String link=print.get(i).getAttribute("href");
			System.out.println(link);
		}
	}

}
