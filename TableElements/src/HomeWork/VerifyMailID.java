package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyMailID {
	public static WebDriver driver;
	public static void MailID() {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		ArrayList<String> ActList = new ArrayList<>();
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		String str;
		for (int i = 1; i < rows.size(); i++) {
			int index = i + 1;
			str = driver.findElement(By.xpath("//tr[" + index + "]/td[3]")).getText();
			//System.out.println(str);
			ActList.add(str);
			boolean ActResult = str.contains("@gmail.com");
			System.out.println(ActResult);
			if(ActResult==false){
				System.out.println("test case failed");
			} else{
				System.out.println("test case is passed");
			}
		}
		
	}
	public static void main(String[] args) {
		VerifyMailID.MailID();
	}
	
	
}
