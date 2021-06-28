package HomeWork;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MailIDVerification {
	public static WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		ArrayList<String> ActList = new ArrayList<>();
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		
		String str; 
		for(int i=1;i<rows.size();i++){
			int index=i+1;
			str = driver.findElement(By.xpath("//tr[" + index + "]/td[3]")).getText();
		
			if(str.contains("@gmail.com")){
			ActList.add(str);
			System.out.println(ActList);
				System.out.println();
			}
		}}}
