package HomeWork;
import java.util.ArrayList;
import org.testng.annotations.Test;
public class PrintMahaUsers {
  @Test
  public void f() {
	  ArrayList<String> users=UsersFromMaharashtra.ExpListofUsers();
	  ArrayList<String> states=UsersFromMaharashtra.ExpListofStates();
	  if(users.size()==states.size()){
		  for(int i=0;i<users.size();i++){
			  String stateText=states.get(i);
			  String userText=users.get(i);
			  
			  ArrayList<String> MahaUsers=new ArrayList<>();
			  if(stateText.contains("Maharashtra")){
				  //System.out.println(stateText);
				  MahaUsers.add(userText);
				  System.out.println(MahaUsers);
			  }
		  }
	  }			 
}
}