package HomeWork;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAndGenderList {
	public static WebDriver driver;
	public static ArrayList<String> getUserList(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		List<WebElement> UserList=driver.findElements(By.xpath("//td[2]"));  //kiran, sagar, monica, kimaya
		ArrayList<String> ActUserList=new ArrayList<>();
		for(WebElement users:UserList){
			String userText=users.getText();
			//System.out.println(userText);
			ActUserList.add(userText);
		}
		return ActUserList;
	}
	public static ArrayList<String> getGenderList(){
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
		List<WebElement> GenderList=driver.findElements(By.xpath("//td[6]")); // male, male, female, female
		ArrayList<String> ActGenderList=new ArrayList<>();
		for(WebElement Gender:GenderList){
			String genderText=Gender.getText();
			//System.out.println(genderText);
			ActGenderList.add(genderText);
		}
		return ActGenderList;	
	}
	
}
