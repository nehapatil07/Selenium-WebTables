package DynamicMethodsUse;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Utility;

public class VerifyFirstRowElements {
  @Test
  public void VerifycountOfLabels() {
	 ArrayList<String> ActList= Utility.getListofHeadings();
	 ArrayList<String> ExpList= Utility.fetchExpList();
	 Assert.assertEquals(ActList.size(), ExpList.size()); 
  }
  @Test
  public void VerifySequenceOfLabels(){
	  ArrayList<String> ActList=Utility.getListofHeadings();
	  ArrayList<String> ExpList= Utility.fetchExpList();
	  if(ActList.size()==ExpList.size()){     
		  ArrayList<Boolean> Alflag=new ArrayList<>();   
		  for(int i=0;i<ExpList.size();i++){   
			  String ActLabel=ActList.get(i);
			  String ExpLabel=ExpList.get(i);
			  if (!ActLabel.equals(ExpLabel)){
				  System.out.println("Expected is "+ExpLabel+" but found "+ActLabel);
				  Alflag.add(false);
			  } else{
				  Alflag.add(true);
			  }
		  }
		  boolean CheckIfAnyFalseEntryIsThr=Alflag.contains(false);
		  Assert.assertFalse(CheckIfAnyFalseEntryIsThr);
	  }
		  else{
			  Assert.assertEquals(true, false);
		  }
	  }
  }

