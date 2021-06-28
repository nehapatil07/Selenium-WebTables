package HomeWork;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
public class PrintMaleUsers {
	public static WebDriver driver;
	@Test
	public void PrintMaleUserNames(){
	ArrayList<String> ActuserList=UserAndGenderList.getUserList();
	ArrayList<String> ActgenderList=UserAndGenderList.getGenderList();
	if(ActgenderList.size()==ActuserList.size()){
		for(int i=0;i<ActuserList.size();i++){
		String userText=ActuserList.get(i);
		String genderText=ActgenderList.get(i);
		
		ArrayList<String> MaleUsers=new ArrayList<>();
			if(genderText.equals("Male")){
				//System.out.println(genderText);
				MaleUsers.add(userText);
				System.out.println("Male Users are>> "+MaleUsers);
			}
		} 
}
	}}
