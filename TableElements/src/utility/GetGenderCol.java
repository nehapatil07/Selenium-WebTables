package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetGenderCol {
	public static WebDriver driver;
	  public static ArrayList<String> ActGenderList() {
		  System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
			ArrayList<String> GenderList=new ArrayList<>();
			List<WebElement> rows=driver.findElements(By.xpath("//tr"));
			String str;
			for(int i=1;i<rows.size();i++){
				int index=i+1;
				str=driver.findElement(By.xpath("//tr["+index+"]/td[6]")).getText();
				GenderList.add(str);
				//System.out.println(str);
			}
			return GenderList;
}
	  public static ArrayList<String> ExpList(){
		  ArrayList<String> ExpGenderList=new ArrayList<>();
		  ExpGenderList.add("Male");
		  ExpGenderList.add("Male");
		  ExpGenderList.add("Female");
		  ExpGenderList.add("Female");
		return ExpGenderList;
		  
	  }
}