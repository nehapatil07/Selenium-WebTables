package ReadingTableElements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractThirdColumn {
	WebDriver driver;
  @Test
  public void ThirdColumn() {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		ArrayList<String> ThirdCol=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		String str;
		for(int i=0;i<rows.size();i++){
			int row=i+1;
			if(i==0)
				str=driver.findElement(By.xpath("//tr[1]/th[3]")).getText();
			else
				str=driver.findElement(By.xpath("//tr["+row+"]/td[3]")).getText();
			ThirdCol.add(str);
			System.out.println(str);
		}
		
  }
}
