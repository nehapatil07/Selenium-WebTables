package HomeWork;

import java.util.ArrayList;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.GetGenderCol;

public class VerifyGender {
	@Test
	public void getLabelsofGender(){
		ArrayList<String> Expected=GetGenderCol.ExpList();
		ArrayList<String> Actual=GetGenderCol.ActGenderList();
		if(Expected.size()==Actual.size()){
			ArrayList<Boolean> Alflag=new ArrayList<>();
			for(int i=1;i<Expected.size();i++){
				if(!Expected.equals(Actual)){
					System.out.println("Expected gender is>> "+Expected+" but found>> "+Actual);
				Alflag.add(false);
				} else{
					System.out.println("passed");
					Alflag.add(true);
				}
			}
			boolean checkifAnyWrongEntryisThr=Alflag.contains(false);
			Assert.assertFalse(checkifAnyWrongEntryisThr);
		} else{
			Assert.assertEquals(true, false);
		}
	}
	
		
}
