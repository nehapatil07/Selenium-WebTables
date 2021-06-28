package HomeWork;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class UsersFromMaharashtra {
	public static WebDriver driver;
	
	
public static ArrayList<String> getUserNames(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	ArrayList<String> ActListofUsers=new ArrayList<>();
	List<WebElement> rows=driver.findElements(By.xpath("//tr"));
	for(int i=1;i<rows.size();i++){
		int index=i+1;
		String str;
		str=driver.findElement(By.xpath("//tr["+index+"]/td[2]")).getText();
		ActListofUsers.add(str);
		System.out.println(str);
	}	
	return ActListofUsers;
}
public static ArrayList<String> ExpListofUsers(){
	ArrayList<String> expUsers=new ArrayList<>();
	expUsers.add("Kiran");
	expUsers.add("Sagar");
	expUsers.add("Monica");
	expUsers.add("Kimaya");
	return expUsers;
}

public static ArrayList<String> getStates(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	
	ArrayList<String> ActListofStates=new ArrayList<>();
	List<WebElement> rows=driver.findElements(By.xpath("//tr"));
	for(int i=1;i<rows.size();i++){
		int index=i+1;
		String str;
		str=driver.findElement(By.xpath("//tr["+index+"]/td[7]")).getText();
		ActListofStates.add(str);
		System.out.println(str);
	}
	return ActListofStates;

}
public static ArrayList<String> ExpListofStates(){
	ArrayList<String> expStates=new ArrayList<>();
	expStates.add("Maharashtra");
	expStates.add("Punjab");
	expStates.add("Maharashtra");
	expStates.add("Punjab");
	return expStates;
}

}

