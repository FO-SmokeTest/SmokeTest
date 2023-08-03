package Resources;

public class xpathsFO_BookFlow {
	
	
	//-----**** &&&&&&&&&&&&&&&&&&&&&&& ****-----    
	//-----**** B2C BE special Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&&&&&&& ****----- 	
		
	//Search panel shadow host and search panel elements	
	public static String cssSelector_ShadowHost_BE = "tui-flight-search-bar[lang='nl-BE']";

	//Visa card payment
	public static String xpath_VisaCardSelection_BE ="(//span[contains(@class,'inputs__circle inputs__aligntop')])[7]";
	public static String xpath_VisaCardName_BE = "//input[@id='Ecom_Payment_Card_Name']";
	public static String xpath_VisaCardNumber_BE = "//input[@id='Ecom_Payment_Card_Number']";
	public static String xpath_VisaExpiryMonth_BE = "//select[@id='Ecom_Payment_Card_ExpDate_Month']";
	public static String xpath_VisaExpireYear_BE = "//select[@id='Ecom_Payment_Card_ExpDate_Year']";
	public static String xpath_VisaCVV_BE = "//input[@id='Ecom_Payment_Card_Verification']";
	public static String xpath_PaymentConfirm_BE = "(//input[@id='submit3'])[1]";

	public static String xpath_SofortSelection_BE = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[1]";
	public static String xpath_sofortPaymentConfirm_BE = "//input[@id='btn_Accept']";

	public static String xpath_IdealPaymentSelection_BE = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[9]";
	public static String xpath_IdealBankSelection_BE = "//select[@title='Selecteer uw bank']";  //TST iDEAL
	public static String xpath_IdealBankContinue_BE = "//input[@id='btn_Continue']";
	public static String xpath_IdealPaymentSuccess_BE = "//input[@id='btn_Accept']";



	//-----**** &&&&&&&&&&&&&&&&&&&&&&& ****-----    
	//-----**** B2C NL special Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&&&&&&& ****----- 

	//Search panel shadow host and search panel elements
	public static String cssSelector_ShadowHost_NL = "tui-flight-search-bar[lang='nl-NL']";

	//Visa card payment
	public static String xpath_VisaCardSelection_NL = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[2]";
	public static String xpath_VisaCardNumber_NL = "(//input[@Class='form-control form-control-inline'])";
	public static String xpath_VisaExpiryMonth_NL = "//select[@id='expdatemonth']";
	public static String xpath_VisaExpireYear_NL = "//select[@id='expdateyear']";
	public static String xpath_VisaCVV_NL = "(//input[@Class='form-control form-control-sm form-control-inline'])";
	public static String xpath_PaymentConfirm_NL = "//input[@id='submitCC']";

	public static String xpath_IdealPaymentSelection_NL = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[1]";
	public static String xpath_IdealBankSelection_NL = "//select[@id='bankId']";  //ING
	public static String xpath_IdealBankContinue_NL = "//input[@id='submitOB']";
	public static String xpath_IdealPaymentSuccess_NL = "//input[@value='Accept payment']";



	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
	//-----**** B2C FR&MA special Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****----- 

	//Search panel shadow host and search panel elements
	public static String cssSelector_ShadowHost_FRAndMA = "tui-flight-search-bar[lang='fr-FR']";

	public static String xpath_MADSelection = "//select[@aria-label='Select']";     //MAD

	//Visa card payment
	public static String xpath_VisaCardSelection_MAinMAD = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[4]";
	public static String xpath_VisaCardName_MAinMAD = "(//input[@id='cardHolderName'])[1]";
	public static String xpath_VisaCardNumber_MAinMAD = "(//input[@id='pan'])[1]";
	public static String xpath_VisaExpiryMonth_MAinMAD = "//select[@id='date-validite']";
	public static String xpath_VisaExpireYear_MAinMAD = "//select[@name='Ecom_Payment_Card_ExpDate_Year']";
	public static String xpath_VisaCVV_MAinMAD = "//input[@id='code-verification']";
	public static String xpath_VisaCardCheckbox_MAinMAD = "//input[@id='ml']";
	public static String xpath_PaymentConfirm_MAinMAD = "//button[normalize-space()='Valider le paiement']";

	public static String xpath_ConfirmationpageAppear_MAinMAD = "//a[@id='retour']";


	public static String xpath_VisaCardSelection_FR = "(//span[contains(@class,'inputs__circle inputs__aligntop')])[5]";




	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
	//-----**** Inhouse BE&NL special Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&&&&&& ****----- 

	//Your connection is not private 
	public static String id_homepage_advanced = "details-button";
	public static String id_homepage_unsafe = "proceed-link";
		
	//Login page
	public static String id_username = "userNameInput";
	public static String id_password = "passwordInput";
	public static String id_signin = "submitButton";

	public static String xpath_GetBookingAmount = "(//div[@class=' UI__paymentColEnd'])[1]";
	public static String xpath_CashSelection = "//div[@id='retailPaymentType__component']//li[1]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_PaymentTransfer = "//div[@id='retailPaymentType__component']//li[2]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_CardPayment_BEInhouse = "//div[@id='retailPaymentType__component']//li[3]//span[@class='inputs__circle inputs__alignmiddle']";

	public static String xpath_Amex_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[1]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_Bancontact_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[2]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_Maestro_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[3]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_Master_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[4]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_MasterDebit_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[5]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_Visa_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[6]//span[@class='inputs__circle inputs__alignmiddle']";
	public static String xpath_VisaDebit_BEandMAInhouse = "//div[@class='UI__paymentTypeCard']//li[7]//span[@class='inputs__circle inputs__alignmiddle']";

	public static String xpath_EnterNameForCashPayment = "//input[@name='payerName']";
	public static String xpath_EnterMoneyForReservation = "//input[@placeholder='€']";
	public static String xpath_EnterMoneyForReservation_MA = "//input[@placeholder='MAD']";
	public static String xpath_ConfirmPayment_Inhouse = "//span[@class='UI__addPayment'] //button[@aria-label='button']";
	
	public static String xpath_ConfirmBooking = "//div[@class='UI__continue'] //button[@aria-label='button']";



	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****-----    
	//-----**** 3PA BE&NL special Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&&&&&&&&&& ****----- 

	//Login page
	public static String xpath_username = "//input[@id='username']";
	public static String xpath_password = "//input[@id='password']";
	public static String xpath_ref = "//input[@id='agentref']";
	public static String xpath_BE_login ="//button[contains(text(),'LOG IN')]";	
	public static String xpath_NL_login = "//button[contains(text(),'INLOGGEN')]";
	public static String xpath_MA_login = "//button[contains(text(),'SE CONNECTER')]";

	public static String xpath_WebsiteLoadVerification_3PA = "//section[@class='top']";



	//-----**** &&&&&&&&&&&&&&&&&& ****-----    
	//-----**** FO common Locators ****----- 
	//-----**** &&&&&&&&&&&&&&&&&& ****----- 

	//homepage privacy popup
	public static String id_homepage_privacyAccept = "cmCloseBanner";

	//Oneway or Twoway
	public static String cssSelector_Oneway = "[id='radio-oneway'] [class='stroke__c7ec9']"; 
	public static String cssSelector_Twoway = "[id='radio-return'] [class='stroke__de3cd']";

	//Airports selection
	public static String cssSelector_OutboundSearch = "#searchField-airport-outbound";
	public static String cssSelector_InboundSearch = "#searchField-airport-inbound";

	//Calendar selection
	public static String cssSelector_OutboundCalendertextbox = "#searchField-date-outbound";
	public static String cssSelector_OutboundDate = "[id='calendarItems-outbound'] div[class='entry__6a711 day__6a711 available__6a711']";
	public static String cssSelector_OutboundMonth = "[id='calendar-outbound'] [class='select__06932']";
	public static String cssSelector_InboundCalendertextbox = "#searchField-date-inbound"; 
	public static String cssSelector_InboundDate = "[id='calendarItems-inbound'] div[class='entry__6a711 day__6a711 available__6a711']";
	public static String cssSelector_InboundMonth = "[id='calendar-inbound'] [class='select__06932']";

	//Passengers selection
	public static String cssSelector_PassengerDropdown = "#searchField-pax";
	public static String cssSelector_AdultDropdown = "#travelPartySelectAdults";
	public static String cssSelector_ChildDropdown = "#travelPartySelectChildren";
	public static String cssSelector_SingleChildAgeDropdown = ".child-age-sel";
	public static String cssSelector_Child1AgeDropdown = "select[name='0']";
	public static String cssSelector_Child2AgeDropdown = "select[name='1']";

	//Initiate search
	public static String cssSelector_SearchButton = "#searchButton";
	 
	//Search Results page element locators
//	public static String xpath_OutboundFlightSelect = "(//button[@aria-label='button'])[1]";
//	public static String xpath_InboundFlightSelect = "(//button[@aria-label='button'])[1]";
//	public static String xpath_ContinueFromSearchResults = "(//button[@aria-label='button'])";
	public static String xpath_NearByAirortsCheckbox = "(//label[@aria-label='checkbox'])";
	public static String xpath_OutboundFlightSelect = "(//div[@id='flightsearchresults__component']/div[4] //button[@aria-label='button'])[1]";
	public static String xpath_InboundFlightSelect = "(//div[@id='flightsearchresults__component']/div[8] //button[@aria-label='button'])[1]";
	public static String xpath_ContinueFromSearchResults = "//div[@class='SummaryPanel__summary'] //button[@aria-label='button']";
	
	//Flight options page element locators 
	public static String xpath_randomClickonCurrentPage = "//li[@class='navigations__current']";
	public static String cssSelector_ShadowHost_Baggage = "tui-fo-special-service-luggage[basic-currency='EUR']";
	public static String cssSelector_ShadowHost_Sports = "tui-fo-special-service-sports[basic-currency='EUR']";
	public static String cssSelector_ShadowHost_Pets = "tui-fo-special-service-animals[basic-currency='EUR']";
	
	public static String cssSelector_20kgBaggagePax1 = "div[class='passengersList__d9407e'] div:nth-child(1) li:nth-child(2) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_25kgBaggagePax1 = "div[class='passengersList__d9407e'] div:nth-child(1) li:nth-child(3) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_30kgBaggagePax1 = "div[class='passengersList__d9407e'] div:nth-child(1) li:nth-child(4) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_40kgBaggagePax1 = "div[class='passengersList__d9407e'] div:nth-child(1) li:nth-child(5) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_50kgBaggagePax1 = "div[class='passengersList__d9407e'] div:nth-child(1) li:nth-child(6) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_20kgBaggagePax2 = "div[class='passengersList__d9407e'] div:nth-child(2) li:nth-child(2) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_25kgBaggagePax2 = "div[class='passengersList__d9407e'] div:nth-child(2) li:nth-child(3) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_30kgBaggagePax2 = "div[class='passengersList__d9407e'] div:nth-child(2) li:nth-child(4) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_40kgBaggagePax2 = "div[class='passengersList__d9407e'] div:nth-child(2) li:nth-child(5) .button__27b5c6.luggageSelectBtn__af46ad";
	public static String cssSelector_50kgBaggagePax2 = "div[class='passengersList__d9407e'] div:nth-child(2) li:nth-child(6) .button__27b5c6.luggageSelectBtn__af46ad";
	
	public static String cssSelector_SportsLink = ".link___6yEPw";
	public static String cssSelector_WaterSkiSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__WINTER_SPORTS_EQUIPMENT'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	//li[data-test-id='outbound__WINTER_SPORTS_EQUIPMENT'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']
	public static String cssSelector_DiveSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__DIVE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_ParagliderSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__PARAGLIDER_PARACHUTE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_GolfSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__GOLF'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_SurfBoardSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__SURFBOARD'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_BicycleSportsPax1 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__BICYCLE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_WaterSkiSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__WINTER_SPORTS_EQUIPMENT'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_DiveSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__DIVE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_ParagliderSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__PARAGLIDER_PARACHUTE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_GolfSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__GOLF'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_SurfBoardSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__SURFBOARD'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_BicycleSportsPax2 = "div[class='contentBlock__3461a9'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__BICYCLE'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	
	public static String cssSelector_PetsLink = ".link___6yEPw";
	public static String cssSelector_AvihPetPax1 = "div[class='contentBlock__acc60c'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__AVIH'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_PetcPetPax1 = "div[class='contentBlock__acc60c'] div:nth-child(1) > div:nth-child(1) > div:nth-child(1) [data-test-id='outbound__PETC'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_AvihPetPax2 = "div[class='contentBlock__acc60c'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__AVIH'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	public static String cssSelector_PetcPetPax2 = "div[class='contentBlock__acc60c'] div:nth-child(1) > div:nth-child(1) > div:nth-child(2) [data-test-id='outbound__PETC'] div[class='checkboxToggle___qi978 checkboxIcon___q5gnc']";
	
	public static String xpath_ContinueFromFlightOptionsPage = "//button[@aria-label='extra options continue button']";

	//Extra options page element locators
	
	public static String xpath_DOBCheckBoxPax1 = "(//span[@class='inputs__box'])[1]";
	public static String xpath_DOBCheckBoxPax2 = "(//span[@class='inputs__box'])[2]";
	public static String xpath_DateOfDOB_Pax1 = "(//input[@aria-label='day'])[1]";
	public static String xpath_MonthOfDOB_Pax1 = "(//input[@aria-label='month'])[1]";
	public static String xpath_YearOfDOB_Pax1 = "(//input[@aria-label='year'])[1]";
	public static String xpath_DateOfDOB_Pax2 = "(//input[@aria-label='day'])[2]";
	public static String xpath_MonthOfDOB_Pax2 = "(//input[@aria-label='month'])[2]";
	public static String xpath_YearOfDOB_Pax2 = "(//input[@aria-label='year'])[2]";
	public static String xpath_InsuranceRecalculation = "//button[@aria-label='button']";
	public static String xpath_CombiInsurance = "(//span[@class='InsuranceType__copy'])[4]";
	public static String xpath_SelectingCombiInsurancePax1 = "(//div[@class='InsuranceType__insuranceTypes'][4] //span[@class='PerPersonSelectList__checkbox'])[1]";
	public static String xpath_SelectingCombiInsurancePax2 = "(//div[@class='InsuranceType__insuranceTypes'][4] //span[@class='PerPersonSelectList__checkbox'])[2]";
	
	public static String xpath_ContinueFromExtraOptionsPage = "//button[@aria-label='extra options continue button']";
	public static String xpath_InsuranceConfirm = "//button[@aria-label='action apply']";

	//Flight, Extra and Passenger page load verification
	public static String xpath_FlightExtraPassengerPageLoadVerification = "//div[@class='HubAndSpokeStepIndicator__stepIndicatorWrapper']";

	//Passenger details page element locators
	public static String xpath_FirstName_LeadPax = "(//input[@id='FIRSTNAMEADULT1'])[1]";
	public static String xpath_LastName_LeadPax = "(//input[@id='SURNAMEADULT1'])[1]";
	public static String xpath_Gender_LeadPax = "(//select[@id='GENDERADULT1'])[1]";
	public static String xpath_DateOfDOB_LeadPax = "(//input[@aria-label='day'])[1]";
	public static String xpath_MonthOfDOB_LeadPax = "(//input[@aria-label='month'])[1]";
	public static String xpath_YearOfDOB_LeadPax = "(//input[@aria-label='year'])[1]";
	public static String xpath_Address1 = "(//input[@id='ADDRESS1ADULT1'])[1]";
	public static String xpath_HouseNo = "(//input[@id='HOUSENUMBERADULT1'])[1]";
	public static String xpath_PostalCode = "(//input[@id='POSTALCODEADULT1'])[1]";
	public static String xpath_City = "(//input[@id='TOWNADULT1'])[1]";
	public static String xpath_PhoneNo = "(//input[@id='MOBILENUMBERADULT1'])[1]";
	public static String xpath_Email = "(//input[@id='EMAILADDRESSADULT1'])[1]";
	public static String xpath_EmargencyName = "(//input[@id='SURNAMEnull1'])[1]";
	public static String xpath_EmargencyNo = "(//input[@id='MOBILENUMBERnull1'])[1]";
	public static String xpath_PassengerdetailsCheckbox = "//div[@class='UI__important_info_wrap']//span[@class='inputs__box']//*[name()='svg']";

	public static String xpath_FirstName_NonLeadPax = "(//input[@id='FIRSTNAMEADULT2'])[1]";
	public static String xpath_LastName_NonLeadPax = "(//input[@id='SURNAMEADULT2'])[1]";
	public static String xpath_Gender_NonLeadPax = "(//select[@id='GENDERADULT2'])[1]";
	public static String xpath_DateOfDOB_NonLeadPax = "(//input[@aria-label='day'])[2]";
	public static String xpath_MonthOfDOB_NonLeadPax = "(//input[@aria-label='month'])[2]";
	public static String xpath_YearOfDOB_NonLeadPax = "(//input[@aria-label='year'])[2]";

	public static String xpath_FirstName_ChildPaxAs2nd = "(//input[@id='FIRSTNAMECHILD2'])[1]";
	public static String xpath_LastName_ChildPaxAs2nd = "(//input[@id='SURNAMECHILD2'])[1]";
	public static String xpath_Gender_ChildPaxAs2nd = "(//select[@id='GENDERCHILD2'])[1]";
	public static String xpath_DateOfDOB_ChildPaxAs2nd = "(//input[@aria-label='day'])[2]";
	public static String xpath_MonthOfDOB_ChildPaxAs2nd = "(//input[@aria-label='month'])[2]";
	public static String xpath_YearOfDOB_ChildPaxAs2nd = "(//input[@aria-label='year'])[2]";

	public static String xpath_FirstName_ChildPaxAs3rd = "(//input[@id='FIRSTNAMECHILD3'])[1]";
	public static String xpath_LastName_ChildPaxAs3rd = "(//input[@id='SURNAMECHILD3'])[1]";
	public static String xpath_Gender_ChildPaxAs3rd = "(//select[@id='GENDERCHILD3'])[1]";
	public static String xpath_DateOfDOB_ChildPaxAs3rd = "(//input[@aria-label='day'])[3]";
	public static String xpath_MonthOfDOB_ChildPaxAs3rd = "(//input[@aria-label='month'])[3]";
	public static String xpath_YearOfDOB_ChildPaxAs3rd = "(//input[@aria-label='year'])[3]";

	public static String xpath_FirstName_ChildPaxAs4th = "(//input[@id='FIRSTNAMECHILD4'])[1]";
	public static String xpath_LastName_ChildPaxAs4th = "(//input[@id='SURNAMECHILD4'])[1]";
	public static String xpath_Gender_ChildPaxAs4th = "(//select[@id='GENDERCHILD4'])[1]";
	public static String xpath_DateOfDOB_ChildPaxAs4th = "(//input[@aria-label='day'])[4]";
	public static String xpath_MonthOfDOB_ChildPaxAs4th = "(//input[@aria-label='month'])[4]";
	public static String xpath_YearOfDOB_ChildPaxAs4th = "(//input[@aria-label='year'])[4]";

	public static String xpath_FirstName_InfantAs2nd = "(//input[@id='FIRSTNAMEINFANT2'])[1]";
	public static String xpath_LastName_InfantAs2nd = "(//input[@id='SURNAMEINFANT2'])[1]";
	public static String xpath_Gender_InfantAs2nd = "(//select[@id='GENDERINFANT2'])[1]";
	public static String xpath_DateOfDOB_InfantAs2nd = "(//input[@aria-label='day'])[2]";
	public static String xpath_MonthOfDOB_InfantAs2nd = "(//input[@aria-label='month'])[2]";
	public static String xpath_YearOfDOB_InfantAs2nd = "(//input[@aria-label='year'])[2]";

	public static String xpath_FirstName_InfantAs3rd = "(//input[@id='FIRSTNAMEINFANT3'])[1]";
	public static String xpath_LastName_InfantAs3rd = "(//input[@id='SURNAMEINFANT3'])[1]";
	public static String xpath_Gender_InfantAs3rd = "(//select[@id='GENDERINFANT3'])[1]";
	public static String xpath_DateOfDOB_InfantAs3rd = "(//input[@aria-label='day'])[3]";
	public static String xpath_MonthOfDOB_InfantAs3rd = "(//input[@aria-label='month'])[3]";
	public static String xpath_YearOfDOB_InfantAs3rd = "(//input[@aria-label='year'])[3]";

	public static String xpath_FirstName_InfantAs4th = "(//input[@id='FIRSTNAMEINFANT4'])[1]";
	public static String xpath_LastName_InfantAs4th = "(//input[@id='SURNAMEINFANT4'])[1]";
	public static String xpath_Gender_InfantAs4th = "(//select[@id='GENDERINFANT4'])[1]";
	public static String xpath_DateOfDOB_InfantAs4th = "(//input[@aria-label='day'])[4]";
	public static String xpath_MonthOfDOB_InfantAs4th = "(//input[@aria-label='month'])[4]";
	public static String xpath_YearOfDOB_InfantAs4th = "(//input[@aria-label='year'])[4]";

	public static String cssSelector_ContinueFromPassengersPage = "button[class='buttons__button buttons__primary buttons__fill buttons__large']";

	//Payment options page
	public static String xpath_ContinueFromPaymentOptions = "//button[@aria-label='button']";
	
	//Confirmation page xpath
	public static String xpath_BookingRefInConfirmationPage = "(//span[@class=' BookingReference__referenceID'])";
	public static String cssSelector_Shadowhost_PaymentAndConfirmationPage = "tui-fo-price-summary[mfeplacing='onTop']";
	public static String cssSelector_ExpandPassengersInConfirmationPage = "#preact_root>div:nth-child(2)>div:nth-child(1)>div[class='sectionHeader']";
	public static String cssSelector_LeadPassengerInConfirmationPage = "#preact_root>div:nth-child(2)>div:nth-child(2)>div:nth-child(1)>div:nth-child(1)>h4[data-testid='passengerName']";

	public static String cssSelector_ExpandJourneyInConfirmationPage = "#preact_root>div:nth-child(3)>div:nth-child(1)>div:nth-child(1)>div[class='sectionHeader']";
	public static String cssSelector_AirportsInConfirmationPage = "h3[datatest-id='headingText']";
	public static String cssSelector_DepartureDateInConfirmationPage = "p[data-testid='outboundDepartDate']";






	}
