package utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility { 
	public static WebDriver driver;
public static ArrayList<String> getListofHeadings(){
	System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("file:///D:/Offline%20Website/Offline%20Website/pages/examples/users.html");
	List<WebElement> row=driver.findElements(By.tagName("th"));
	ArrayList<String> ActList=new ArrayList();
	 for(WebElement rowLabel:row){
		 String text=rowLabel.getText();
		 ActList.add(text);
		 System.out.println(text);
	 }
	return ActList;
}
public static ArrayList<String> fetchExpList(){
	ArrayList<String> ExpList=new ArrayList<>();
	ExpList.add("#");
	ExpList.add("Username");
	ExpList.add("Emails");
	ExpList.add("Mobile");
	ExpList.add("Course");
	ExpList.add("Gender");
	ExpList.add("State");
	ExpList.add("Action");	
	return ExpList;
}
public static void main(String[] args) {
	Utility.getListofHeadings();
}
}
