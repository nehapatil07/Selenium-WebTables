package utility;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MobNmbrColUtility {
	public static WebDriver driver;
	public static ArrayList<String> getMobNumbers(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		ArrayList<String> ActMobNumbers=new ArrayList<>();
		List<WebElement> rows=driver.findElements(By.xpath("//tr"));
		String str;
		for(int i=1;i<rows.size();i++){
			int index=i+1;
			str=driver.findElement(By.xpath("//tr["+index+"]/td[4]")).getText();
			ActMobNumbers.add(str);
			System.out.println(str);
		}
		return ActMobNumbers;
  }
	
	public static ArrayList<String> ExpList(){
		ArrayList<String> ExpList=new ArrayList<>();
		ExpList.add("9898989898");
		ExpList.add("999999999");
		ExpList.add("1111111111");
		ExpList.add("999999999");
		return ExpList;	
	}
	public static void main(String[] args) {
		MobNmbrColUtility.getMobNumbers();
	}
}
