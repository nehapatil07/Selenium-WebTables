package ReadingTableElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractSixthCol {
	WebDriver driver;
  @Test
  public void sixthCol() {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		ArrayList<String> SixthCol=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		String str;
		for(WebElement col:rows){
			int index=rows.indexOf(col)+1;
			if(rows.indexOf(col)==0)
				str=col.findElement(By.xpath("//tr[1]/th[6]")).getText();
			else
				str=col.findElement(By.xpath("//tr["+index+"]/td[6]")).getText();
			SixthCol.add(str);
			System.out.println(str);
		}
  }
}
