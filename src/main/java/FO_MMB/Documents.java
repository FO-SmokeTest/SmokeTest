package FO_MMB;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import AbstractMethods.AbstractComponents;

public class Documents extends AbstractComponents {
	
	static WebDriver driver;
	
	@SuppressWarnings("static-access")
	public Documents(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void Document() 
	{
		
		List<WebElement> Docs = driver.findElements(By.xpath(Resources.xpathsFO_MMB.xpath_Documents));
		  
	    int count = Docs.size();
	    
	    System.out.println("Total Docs: " + count);
	    
	    for(int i=0; i<count; i++) 
        {
      	  String DocName = Docs.get(i).getText();
      	  
      	  if(i==0) 
      	  {
      		MMBWebsite.Doc1 = DocName; 
      	  }
      	  else if(i==1) 
      	  {
      		MMBWebsite.Doc2 = DocName;
      	  }
      	  else if(i==2) 
      	  {
      		MMBWebsite.Doc3 = DocName;
      	  }
      	  else if(i==3) 
      	  {
      		MMBWebsite.Doc4 = DocName;
      	  }
      	  else if(i==4) 
      	  {
      		MMBWebsite.Doc5 = DocName;
      	  }
      	  else if(i==5) 
      	  {
      		MMBWebsite.Doc6 = DocName;
      	  }
      	  else if(i==6) 
    	  {
      		MMBWebsite.Doc7 = DocName;
    	  }
      	  else if(i==7) 
    	  {
      		MMBWebsite.Doc8 = DocName;
    	  }
      	  else if(i==8) 
    	  {
      		MMBWebsite.Doc9 = DocName;
    	  }
      	  else if(i==9) 
    	  {
      		MMBWebsite.Doc10 = DocName;
    	  }
      	 
        }
        
        if (MMBWebsite.Doc1 != null) 
        {
        	MMBWebsite.FinalDoc = MMBWebsite.Doc1;
      	  if(MMBWebsite.Doc2 != null) 
      	  {
      		MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2;
      		  if(MMBWebsite.Doc3 != null) 
          	  {
      			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3;
          		  if(MMBWebsite.Doc4 != null) 
              	  {
          			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4;
              		  if(MMBWebsite.Doc5 != null) 
                  	  {
              			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5;
                  		  if(MMBWebsite.Doc6 != null) 
                      	  {
                  			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5 + ", " + '\n' + MMBWebsite.Doc6;
                      		  if(MMBWebsite.Doc7 != null) 
                          	  {
                      			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5 + ", " + '\n' + MMBWebsite.Doc6 + ", " + '\n' + MMBWebsite.Doc7;
                          		  if(MMBWebsite.Doc8 != null) 
                              	  {
                          			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5 + ", " + '\n' + MMBWebsite.Doc6 + ", " + '\n' + MMBWebsite.Doc7 + ", " + '\n' + MMBWebsite.Doc8;
                              		  if(MMBWebsite.Doc9 != null) 
                                  	  {
                              			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5 + ", " + '\n' + MMBWebsite.Doc6 + ", " + '\n' + MMBWebsite.Doc7 + ", " + '\n' + MMBWebsite.Doc8 + ", " + '\n' + MMBWebsite.Doc9;
                                  		  if(MMBWebsite.Doc10 != null) 
                                      	  {
                                  			MMBWebsite.FinalDoc = MMBWebsite.Doc1 + ", " + '\n' + MMBWebsite.Doc2 + ", " + '\n' + MMBWebsite.Doc3 + ", " + '\n' + MMBWebsite.Doc4 + ", " + '\n' + MMBWebsite.Doc5 + ", " + '\n' + MMBWebsite.Doc6 + ", " + '\n' + MMBWebsite.Doc7 + ", " + '\n' + MMBWebsite.Doc8 + ", " + '\n' + MMBWebsite.Doc9 + ", " + '\n' + MMBWebsite.Doc10;
                                      	  }
                                  	  }
                              	  }
                          	  }
                      	  }
                  	  }
              	  }
          	  }
      	  }
      	  
        }
        
        MMBWebsite.FinalDoc = "Generated Docs are : " + '\n' + MMBWebsite.FinalDoc;
        System.out.println(MMBWebsite.FinalDoc);
        
        
	    
/*	    for(int i=0; i<count; i++) 
	    {
	    	String DocName = Docs.get(i).getText();
	    	
	    	if(DocName.contains("confirmation")) 
	    	{
	    		System.out.println("Confirmation document name is: " + DocName);
	    	}
	    	else if(DocName.contains("reserveringsbevestiging")) 
	    	{
	    		System.out.println("Confirmation document name is: " + DocName);
	    	}
	    	
	    	if(DocName.contains("invoice")) 
	    	{
	    		System.out.println("invoice document name is: " + DocName);
	    	}
	    	else if(DocName.contains("factuur")) 
	    	{
	    		System.out.println("invoice document name is: " + DocName);
	    	}
	    	
	    	if(DocName.contains("terms")) 
	    	{
	    		System.out.println("Terms and Conditions document name is: " + DocName);
	    	}
	    	else if(DocName.contains("algemene voorwaarden")) 
	    	{
	    		System.out.println("Terms and Conditions document name is: " + DocName);
	    	}
			
	    }
*/			  
	}

}
