package HomeWork;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.MobNmbrColUtility;

public class VerifyMobileNumber {
WebDriver driver;
  @Test
  public void MobNumber() {
	ArrayList<String> ExpList=MobNmbrColUtility.ExpList();
	ArrayList<String> ActList=MobNmbrColUtility.getMobNumbers();
	Assert.assertEquals(ExpList, ActList);
}
}