package ReadingTableElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractAllTableElements {
	WebDriver driver;
  @Test
  public void ReadElementsFromTable() {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	  
	  WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table"));
	  
	  List<WebElement> tr=driver.findElements(By.tagName("tr"));
	  System.out.println("number of rows>> "+tr.size());
	  for(WebElement row:tr){
		  List<WebElement> td=driver.findElements(By.tagName("td"));
		  System.out.println("number of cols>> "+td.size());
		  	for(WebElement col:td){
		  		String str=col.getText();
		  		System.out.println(str);
		  	}
		  	System.out.println("***************");
		  	
		  
	  }
  }
}
