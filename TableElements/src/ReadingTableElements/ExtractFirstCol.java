package ReadingTableElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractFirstCol {
	WebDriver driver;
	@Test
	public void Colelements(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ArrayList<String> FirstColElements=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		String str;
		for(WebElement col:rows){
			if(rows.indexOf(col)==0)
				str=col.findElement(By.xpath("//th[1]")).getText();
			else
				 str=col.findElement(By.tagName("td")).getText();
				System.out.println(str);
				FirstColElements.add(str);	
		}	
	}

}
