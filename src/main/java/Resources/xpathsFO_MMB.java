package Resources;

public class xpathsFO_MMB {
	
	
	public static String id_homepage_privacyAccept = "cmCloseBanner";
	
	
	public static String xpath_MMBCalendar_B2C = "//input[@id='departureDate']";
	public static String xpath_MMBCalendarMonth_B2C = "//select[@class='react-datepicker__month-year-select']";
	public static String xpath_MMBCalendarDay_B2C = "//div[contains(@aria-disabled,'false')]";
	public static String xpath_BookingRef_B2C = "//input[@placeholder='Type your booking reference']";
	public static String xpath_LeadPaxLastName_B2C = "//input[@placeholder='Type the name of the lead passenger']";
	
	public static String xpath_MMBlinkBEandNL_InhouseAnd3PA = "//a[normalize-space()='Reservering opvragen']";
	public static String xpath_MMBlinkMA_InhouseAnd3PA = "//a[normalize-space()='Chercher une réservation']";
	public static String xpath_BookingRef_InhouseAnd3PA = "//input[@name='bookingRefereneceId']";
	
	public static String xpath_ContinueToMMB = "//button[normalize-space()='Log in to your booking']";
//	public static String xpath_ContinueToMMB_InhouseAnd3PA = "//button[normalize-space()='Log in to your booking']";
	
	public static String xpath_Documents = "//div[@class='UI__traveDocumentWrapper'] //span[@class='HighlightedLink__text']";
	
	public static String xpath_ClickBaggage = "//div[@id='PerLegLuggageUpgrade__component'] //button[@aria-label='button']";
	public static String xpath_20kgBaggagePax1 = "(//div[@class='actualContent']/div[2]//button[contains(@aria-label,'button')])[1]";
	public static String xpath_25kgBaggagePax1 = "(//div[@class='actualContent']/div[2]//button[contains(@aria-label,'button')])[2]";
	public static String xpath_30kgBaggagePax1 = "(//div[@class='actualContent']/div[2]//button[contains(@aria-label,'button')])[3]";
	public static String xpath_40kgBaggagePax1 = "(//div[@class='actualContent']/div[2]//button[contains(@aria-label,'button')])[4]";
	public static String xpath_50kgBaggagePax1 = "(//div[@class='actualContent']/div[2]//button[contains(@aria-label,'button')])[5]";
	public static String xpath_20kgBaggagePax2 = "(//div[@class='actualContent']/div[3]//button[contains(@aria-label,'button')])[1]";
	public static String xpath_25kgBaggagePax2 = "(//div[@class='actualContent']/div[3]//button[contains(@aria-label,'button')])[2]";
	public static String xpath_30kgBaggagePax2 = "(//div[@class='actualContent']/div[3]//button[contains(@aria-label,'button')])[3]";
	public static String xpath_40kgBaggagePax2 = "(//div[@class='actualContent']/div[3]//button[contains(@aria-label,'button')])[4]";
	public static String xpath_50kgBaggagePax2 = "(//div[@class='actualContent']/div[3]//button[contains(@aria-label,'button')])[5]";
	public static String xpath_SaveBaggage = "(//div[@class='Luggage__buttonContainer'] //button[@role='button'])[2]";
	
	public static String xpath_ClickSports = "//div[@id='SpecialLuggage__component'] //button[@aria-label='button']";
	public static String xpath_WaterSkiSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[1]";
	public static String xpath_DiveSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[2]";
	public static String xpath_ParagliderSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[3]";
	public static String xpath_GolfSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[4]";
	public static String xpath_SurfBoardSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[5]";
	public static String xpath_BicycleSportsPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[6]";
	public static String xpath_WaterSkiSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[1]";
	public static String xpath_DiveSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[2]";
	public static String xpath_ParagliderSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[3]";
	public static String xpath_GolfSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[4]";
	public static String xpath_SurfBoardSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[5]";
	public static String xpath_BicycleSportsPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[6]";
	public static String xpath_SaveSportsSSR = "(//div[@class='SSRSpecialLuggage__buttonContainer'] //button[@role='button'])[2]";
	
	public static String xpath_ClickPets = "//div[@id='PetsInfo__component'] //button[@aria-label='button']";
	public static String xpath_PetcPetPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[1]";
	public static String xpath_AvihPetPax1 = "(//div[@class='actualContent']/div[2] //span[@class='inputs__text'])[2]";
	public static String xpath_PetcPetPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[1]";
	public static String xpath_AvihPetPax2 = "(//div[@class='actualContent']/div[3] //span[@class='inputs__text'])[2]";
	public static String xpath_SavePetSSR = "(//div[@class='SSRPets__buttonContainer'] //button[@role='button'])[2]";
	
	public static String xpath_ContinueFromMMB = "//div[@class='UI__summaryButton'] //button[@aria-label='button']";
	
	public static String xpath_ContinueFromReviewChanges = "(//div[@class='ActionBtns__ButtonChanges'] //button[@aria-label='button'])[2]";
	
	public static String xpath_BookingRefOnAmendConfirm = "//div[@class='PaymentConfirmation__component'] //span";
	//div[@class='PaymentConfirmation__component'] /div[2]
	
}
