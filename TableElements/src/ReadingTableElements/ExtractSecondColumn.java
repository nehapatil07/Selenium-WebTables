package ReadingTableElements;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExtractSecondColumn {
	WebDriver driver;

	@Test
	public void UserNameColumn() {
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		ArrayList<String> UserNames = new ArrayList<>();
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		String uname;
		for(int i=0;i<rows.size();i++){
			int row=i+1;
			if(i==0)
				uname=driver.findElement(By.xpath("//tr[1]/th[2]")).getText();
			else
				uname=driver.findElement(By.xpath("//tr["+row+"]/td[2]")).getText();
			UserNames.add(uname);
			System.out.print(uname);
			}
		//System.out.println(UserNames);
		}
}