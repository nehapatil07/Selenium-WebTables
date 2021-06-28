package ReadingTableElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractForthCol {
	WebDriver driver;
  @Test
  public void f() {
	  	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		ArrayList<String> ForthCol=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		String str;
		for(WebElement col:rows){
			int index=rows.indexOf(col)+1;
			if(rows.indexOf(col)==0)
				str=driver.findElement(By.xpath("//tr[1]/th[4]")).getText();
			else
				str=driver.findElement(By.xpath("//tr["+index+"]/td[4]")).getText();
			ForthCol.add(str);
			System.out.println(str);
		}
  }
}
