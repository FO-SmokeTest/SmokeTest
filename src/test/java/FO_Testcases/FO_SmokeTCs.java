package FO_Testcases;

import org.testng.annotations.Test;

public class FO_SmokeTCs {

	@Test
	public static void SmokeCases() throws Exception 
	{
		
		
		TwowayWithAdults.PPRD_BE_B2C();
		TwowayWithAdults.PPRD_NL_B2C();
		TwowayWithAdults.PPRD_FR_B2C();
		TwowayWithAdults.PPRD_MA_B2C();
		
		TwowayWithAdults.PPRD_BE_Inhouse();
		TwowayWithAdults.PPRD_NL_Inhouse();
		TwowayWithAdults.PPRD_MA_Inhouse();
		
		TwowayWithAdults.PPRD_BE_3PA();
		TwowayWithAdults.PPRD_NL_3PA();
		TwowayWithAdults.PPRD_MA_3PA();
		
		
		TwowayWithAdults.SIT_BE_B2C();
		TwowayWithAdults.SIT_NL_B2C();
		TwowayWithAdults.SIT_FR_B2C();
		TwowayWithAdults.SIT_MA_B2C();
		
		TwowayWithAdults.SIT_BE_Inhouse();
		TwowayWithAdults.SIT_NL_Inhouse();
		TwowayWithAdults.SIT_MA_Inhouse();
	
		TwowayWithAdults.SIT_BE_3PA();
		TwowayWithAdults.SIT_NL_3PA();
		TwowayWithAdults.SIT_MA_3PA();
		
	}
	
	
	

}
