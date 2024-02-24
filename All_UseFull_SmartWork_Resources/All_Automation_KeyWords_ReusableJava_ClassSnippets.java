package All_UseFull_SmartWork_Resources;

public class All_Automation_KeyWords_ReusableJava_ClassSnippets {
	
	
	// Verifying and Validating UserName (Element)
	// the element of the WebPage is identified based on its properties
	// Properties of the elements are identified by inspecting it - right click on the
    // element under test- select inspect option
	// Right click on the Highlighted source code - select Copy - select Outer HTML

	// <input name="txtUsername" id="txtUsername" type="text">
	// The properties of the element always contains attributes and their corresponding values
	/*
	<input name="txtUsername" id="txtUsername" type="text">

	 < - tag
	<input - input tag

	 name - attribute
	 txtUsername - value

	 id - attribute / locator
	 txtUsername - value / selector

	 type - attribute
	 text - value
	 
	  locator - linkText
      Selector - Sign in
      <a  aria-label="Sign in"
      href="https://accounts.google.com/ServiceLogin?hl=en&amp;passive=true&amp;continue=https://www.google.com/&amp;ec=GAZAmgQ"
      target="_top"><span >Sign in</span></a>
	 
	*/

	// The available properties of the inspected element - we should look for an existence
	// of locator of the selenium webDriver
	// Properties contains Locators and their corresponding values

	// id - attribute / locator
	// txtUsername - value / selector

	// 1. Identifying the element uniquely out of other elements of the webPage
	// 2. Performing the Operation on the Element

	//driver.findElement(By.id("txtUsername")).sendKeys("srini");

	// Password element properties
	// <input name="txtPassword"  autocomplete="off" type="password">

	// name - locator
	// txtPassword - selector


	// id="txtPassword"
	//driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

	// <input type="submit"  class="button"  value="LOGIN">
	
	/*
	 * for(int a=3;a>=-3;a=a-5) { // True Block System.out.println(a+ " - " +
	 * "LiveTech"); }
	 */
	
	/*
	 * Actions - class is used to perform operations related to either Mouse of
	 * function keys of the KeyBoard Actions helloSignInAction = new
	 * Actions(driver);
	 * helloSignInAction.moveToElement(helloSignIn).build().perform();
	 */
	
	
	/*
	 * System.out.println(" @@@@@@@@@@ 6  @@@@@@@@@@@ "); System.out.println();
	 * 
	 * 
	 * for(int i=1;i<=3;i++) { 
	 * for(int j=1;j<=2;j++) { 
	 * System.out.println("i"+"j");
	 * } 
	 * }
	 */
	
	
	/*
	 * // Automating UserName WebElement String userNameTestData="srini"; // Test
	 * data - which should be passed to sendKeys method By
	 * userNameProperty=By.id("txtUsername"); // idetifying the property of an
	 * element assigned to a variable // the property of the element should be
	 * identified in the WebPage WebElement
	 * userName=driver.findElement(userNameProperty); // WebElement is an interface
	 * of Selenium ( which can be treated as a dataType ) // Performing an operation
	 * on the identified webElement userName.sendKeys(userNameTestData);
	 */
	
	
	//refoxBrowser.navigate().to("http://bing.com"); // On the current Browser- in the
    //   same tab - webdriver will
    // open another Url Address
	
	
	
	//String actual_GoogleHomePageUrlAddress=chromeBrowser.getCurrentUrl();	
	//chromeBrowser.get(applicationUrlAddress);
	//String actual_BingHomePageTitle=chromeBrowser.getTitle();
	//String signInText=signIn.getText();
	/*
	 * String signInHrefAttributeValue=signIn.getAttribute("href");
	 * System.out.println(" The attribute value of Href of SignIn WebElement is :- "+signInHrefAttributeValue); 
	 * System.out.println();
	 */
	//if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
	//if(actual_GoogleHomePageUrlAddress.contains(expected_GoogleHomePageUrlAddress))
	
	
	// Syntax
	// dataType arrayName[][] = new dataType[size][size]
    // [] - Row , [] -Row of Cell

	// Syntax:-
	// List<dataType>arrayListName = new ArrayList<>();
	//String array2[] = new String[2]; // static Structure with 2 indexes
	// ArrayList - collections of Java
	
	//List<Object>arrayList1 = new ArrayList<>(); // Dynamic data structure with not indexes
	
	
	/*
	 * OrangeHRM Application ===========================
	 * 
	 * 1. Launch the Browser 
	 * 2. Navigate to OrangeHRM Application Url Address
	 * 3. Validation - LogIn Page expected Title - should be "OrangeHRM" expected Url
	 * Address - should have "orangehrm-4.2.0.1" expected text - should be"LOGIN Panel"
	 * 4. LogIn to the Application with a valid Test Data(single testdata) 
	 * 5. Validate OrangeHRM Application Home Page expected text - should havea text Welcome 
	 * 6. Test Welcome Admin 
	 * 7. Test LogOut 
	 * 8. Validation - LogIn Page expected Title - should be "OrangeHRM" expected Url Address - should
	 * have "orangehrm-4.2.0.1" expected text - should be "LOGIN Panel" 
	 * 9. Close the Browser with the Application
	 */
	
	
	
	/*
	 * By linksProperty=By.tagName("a");
	 * List<WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);
	 * 
	 * // System.out.println(tsrtc_HomePageLinks);
	 * 
	 * int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size(); System.out.
	 * println(" The number of links on the TSRTC Application HomePage is :- "
	 * +tsrtc_HomePageLinksCount);
	 * 
	 * 
	 * for(int index=0;index<tsrtc_HomePageLinksCount;index++) {
	 * 
	 * String linkName=tsrtc_HomePageLinks.get(index).getText();
	 * System.out.println(index+" "+linkName); }
	 */
	
	
	/*
	 * for(int index=0;index<headBlockLinksCount;index++) { // getting the names of
	 * the identified elements of the Header Block String
	 * headBlockLinkName=headerBlock_links.get(index).getText();
	 * System.out.println(index +" - " +headBlockLinkName);
	 * 
	 * headerBlock_links.get(index).click();
	 * 
	 * System.out.println(driver.getTitle());
	 * System.out.println(driver.getCurrentUrl()); System.out.println();
	 * 
	 * // since the driver focus is shifted to the next back - making the // driver
	 * to come to the previous WebPage driver.navigate().back();
	 * 
	 * 
	 * // Re-Creating the arrayList // once the driver focus is shifted to the next
	 * webpage all the elements // information stored of the previous page gets
	 * deleted -- so identifying // the elements of the header block for one more
	 * time
	 * 
	 * //Thread.sleep(5000);
	 * tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
	 * headerBlock_links=tsrtc_HeaderBlock.findElements(headerBlock_LinksProperty);
	 * 
	 * headBlockLinksCount=headerBlock_links.size();
	 */
	
	
	/*
	 * package com.ExcelOperations;
	 * 
	 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
	 * java.io.IOException;
	 * 
	 * import org.apache.poi.ss.usermodel.Cell; import
	 * org.apache.poi.ss.usermodel.Row; import
	 * org.apache.poi.xssf.usermodel.XSSFSheet; import
	 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 * 
	 * public class Excel_Read_SingleTestData {
	 * 
	 * public static void main(String[] args) throws IOException {
	 * 
	 * // Identify the file(Excel) in the System FileInputStream excelTestDataFile =
	 * new FileInputStream("./src/com/ExceTestDataFiles/SingleTestData.xlsx");
	 * 
	 * // Identify the WorkBook in the Excel file XSSFWorkbook workBook = new
	 * XSSFWorkbook(excelTestDataFile);
	 * 
	 * // Identify a particular sheet in the WorkBook XSSFSheet testDataSheet =
	 * workBook.getSheet("Sheet1");
	 * 
	 * // Identify a particular Row in the Sheet // Row - is an interface in Apache
	 * poi Row testDataSheet_Row=testDataSheet.getRow(0);
	 * 
	 * // Identify a particular Row of a Cell Cell
	 * testDataSheet_rowOfCell=testDataSheet_Row.getCell(0);
	 * 
	 * // get the test data from the Row of a Cell String
	 * testData=testDataSheet_rowOfCell.getStringCellValue();
	 * 
	 * System.out.println(" The test data in the Excel File is :- "+testData);
	 * 
	 * 
	 * }
	 * 
	 * } =============================================
	 * 
	 * package com.ExcelOperations;
	 * 
	 * import java.io.FileInputStream; import java.io.FileNotFoundException; import
	 * java.io.FileOutputStream; import java.io.IOException;
	 * 
	 * import org.apache.poi.ss.usermodel.Cell; import
	 * org.apache.poi.ss.usermodel.Row; import
	 * org.apache.poi.xssf.usermodel.XSSFSheet; import
	 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
	 * 
	 * public class Excel_Write_TestData {
	 * 
	 * public static void main(String[] args) throws IOException {
	 * 
	 * 
	 * // Identify the file(Excel) in the System FileInputStream excelTestDataFile =
	 * new FileInputStream("./src/com/ExceTestDataFiles/SingleTestData.xlsx");
	 * 
	 * // Identify the WorkBook in the Excel file XSSFWorkbook workBook = new
	 * XSSFWorkbook(excelTestDataFile);
	 * 
	 * // Identify a particular sheet in the WorkBook XSSFSheet testDataSheet =
	 * workBook.getSheet("Sheet1");
	 * 
	 * // Create a Row in the Sheet Row newRow=testDataSheet.createRow(4);
	 * 
	 * // Create a Row of a Cell in the Row Cell
	 * newRowOfNewCell=newRow.createCell(3);
	 * 
	 * // send the value into the New Row of Cell Created
	 * newRowOfNewCell.setCellValue("Selenium");
	 * 
	 * // save the Excel File on to the System - with the name of file along the
	 * extension of the file FileOutputStream testOutPutFile = new
	 * FileOutputStream("./src/com/ExceTestDataFiles/SingleTestData.xlsx");
	 * workBook.write(testOutPutFile);
	 * 
	 * }
	 * 
	 * }
	 */
	
	/*
	 * getLastRowNum() :- This is used to capture the last row no in the excel file.
	 * getLastCellNum ():- This is used to capture the last Cell No, in the row.
	 * getSheet():- This is used to capture specific sheet in the excel workbook.
	 * createSheet():- This can create an additional sheet in the excel workbook.
	 * getRow():- This will capture one complete row in the excel file.
	 * createRow():- This will create a new row in the sheet.
	 * getCell():- This will capture one cell in a row. 
	 * createCell():- This will create a new cell in an existing row. 
	 * getStringCellValue():- This will capture string data present in a cell. 
	 * getNumericCellValue():- This will capture numeric data present in a cell. 
	 * setCellValue():- This is used to write the data into the cell.
	 * write():- This is used to save the excel file.
	 */
	
	/*
	 * FileInputStream multipleTestDataFile = new FileInputStream("./src/com/ExceTestDataFiles/MultipleTestData.xlsx");
	 * XSSFWorkbook workBook = new XSSFWorkbook(multipleTestDataFile); 
	 * XSSFSheet testDataSheet = workBook.getSheet("MultipleTestData");
	 * 
	 * // In the Sheet identifying the Number of Active Rows with the data int
	 * RowsCount=testDataSheet.getLastRowNum();
	 * 
	 * // Should go automatically to every Active Row for(int
	 * rowIndex=0;rowIndex<=RowsCount;rowIndex++) { // should goto an active Row Row
	 * row=testDataSheet.getRow(rowIndex);
	 * 
	 * // Going to an active Row and identifying the number of active Cells int
	 * rowOfCellCount=row.getLastCellNum();
	 * 
	 * // going to an active row to all its active Cells for(int
	 * rowOfCellIndex=0;rowOfCellIndex<rowOfCellCount;rowOfCellIndex++ ) { // going
	 * to an active Row of its active Cell Cell
	 * rowOfCell=row.getCell(rowOfCellIndex);
	 * 
	 * // get the data from the Row of the Cell String
	 * data=rowOfCell.getStringCellValue();
	 * 
	 * // print the data of the Excel Sheet into Eclipse Console
	 * System.out.print(data+" | ");
	 * }
	 * System.out.println();
	 * } 
	 */
	
	
	// TakesScreenshot - is an interface in Selenium
	/*
	 * driver - is an object Type Casting OutputType - is an interface in Selenium
	 * File
	 * bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(bingScreenShot, new
	 * File("./ScreenShots/bingHomePage.png"));
	 */
	
	//Java Access Modifiers
	/*
	 * Visible to the package. The default. No modifiers are needed.
	 *  Visible to the class only (private).
	 *  Visible to the world (public). 
	 *  Visible to the package
	 * and all subclasses (protected).
	 */
	
	// User defined Method can be created in a  Java Class
	/*
	 * // User defined method though created in a Java Class - will not get executed by themself 
	 * // a Java Class can have any number of User Defined methods 
	 * // to perform the operation related to User defined then an Object Should becreated in 
	 * // the main method for the Class - and using the objected created the User defined 
	 * // method should be called
	 * // User defined methods should never be created within the main method
	 * // A java Class can have any number of user defined methods even without amain method 
	 * // User defined methods either can be created above the main method or below the main method
	 * // only the user defined methods called in the Main method will be executed
	 * // User defined method names should be always be unique
	 */	
	
	// Mouse Actions
	/*
	 * Actions - class is used to perform operations related to either Mouse of
	 * function keys of the KeyBoard Actions helloSignInAction = new
	 * Actions(driver);
	 * helloSignInAction.moveToElement(helloSignIn).build().perform();
	 */
	
	// Property of the Frame of the WEbPage
	// <iframe src="/resources/demos/droppable/default.html" class="demo-frame"></iframe>

	/*
	 * By webPageFrameProperty=By.className("demo-frame"); WebElement
	 * webPageFrame=driver.findElement(webPageFrameProperty);
	 * driver.switchTo().frame(webPageFrame);
	 * 
	 * // Drag Me To My Targert element Property // id="draggable" // id="draggable"
	 * 
	 * //Thread.sleep(5000);
	 * 
	 * By dragMeToMyTragetProperty=By.id("draggable"); WebElement
	 * dragMeToMyTraget=driver.findElement(dragMeToMyTragetProperty);
	 */
	
	// Drag and Drop Operation

	/*
	 * Actions dragAndDropUsingMouse = new Actions(driver);
	 * dragAndDropUsingMouse.dragAndDrop(dragMeToMyTraget,dropHere).build().perform();
	 * // Actions - its a class of Selenium used to perform Operations related to
       // Either Mouse or KeyBorad

        Actions helloSignInMouseHover = new Actions(driver);
        // 1. what type of operation should be done
        // 2. where the operation should be performed
         helloSignInMouseHover.moveToElement(helloSignIn).build().perform();
	 */
	
	// since the driver focus is in the frame of the WebPage - driver now should be
    //  switched back to the actual webPage
    // driver.switchTo().defaultContent();
	
	
	//Inheritance Concept
	
	
	
	/*
	 * for(int index=1;index<=36;index++) { // By cityNameProperty= //By.xpath(
	 * "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+index+
	 * "]/td[1]");
	 * 
	 * // OR By
	 * cityNameProperty=By.xpath(xpathExpressionPart1+index+xpathExpressionPart2);
	 * 
	 * WebElement cityName=driver.findElement(cityNameProperty); String
	 * cityNameText=cityName.getText();
	 * 
	 * System.out.println(cityNameText); }
	 */
	
	
	// @Test - user Defined method when implemented with @Test - it represents to a Test Case    

    // @Test - Should be written with the functionality under test

    // If there are multiple Test cases in a Class - then the Test cases will be executed

    // based on Alphabetical Order of the Given test case Name

    // If there are multiple Test cases in a class - if any Test Case is starting with

    // UpperCase letter - then that Test case will be executed first

  
                          //TestNG
   //If the Class has multiple Test Cases then - the Test Cases should be set with priority
   //If any of the Test Case should be ignored during the Test Run/Execution then That
   // Test case should be set with an Argument as - enable=false
  // the default status of the Test case is - enabled=true
	
	
	//TestNG Annotations & Prioritization
	
	/*
	 * @Test(priority=1)// Test Case public void gmailApplicationLaunch() // TestCase Name 
	 * // any functionality which is under Test Should be always be written within the Method implemented
	 *  // with TestNG Annotation @Test only
	 *  // Name of the Method is always called as Test Case Name 
	 * // If a class contains multiple Methods - then the TestNG will executed the Test Cases 
	 * // based on the alphabetical order of the given Test case Name
	 * // If a class contains multiple Methods - then the TestNG will executed the Test Cases 
	 * // based on the alphabetical order of the given Test case Name -fist priority will 
	 * // given to the Test Case name starting with Upper case Letter
	 */
	
	//@Test(enabled=false,description=" Validating DraftsMail Functionalty ") // The TestNG will Ignore the Current Test and will proceed to run
    //   the rest of the Test Cases
    //TestNG is informed that is a false Test Case need not be considered during the Test Run
   // The default status of the Test Case is - enabled=true
	
	
	
	
	//Select a value from the DropDown list
	/*
	 * public class OsmaniaUniversity_SelectLanguage_Selection extends BaseTest {
	 * 
	 * @Test public void dropDownSelectLanguageTest() {
	 * 
	 * // Identifying the Select Language DropDown
	 * 
	 * // id="gtranslate_selector"
	 * 
	 * By selectLanguagesDropDownProperty=By.id("gtranslate_selector"); WebElement
	 * selectLanguagesDropDown=driver.findElement(selectLanguagesDropDownProperty);
	 * 
	 * // <option value="en|hi">Hindi</option> // <option
	 * value="en|fr">French</option> // <option value="en|te">Telugu</option> //
	 * <option value="en|ur">Urdu</option> //<option value="en|ta">Tamil</option>
	 * 
	 * By dropDownElementProperty=By.tagName("option");
	 * List<WebElement>selectLanguages=selectLanguagesDropDown.findElements(
	 * dropDownElementProperty);
	 * 
	 * int selectLanguagesCount=selectLanguages.size(); System.out.
	 * println(" The number of languages in Select Languages DropDown is :- "
	 * +selectLanguagesCount);
	 * 
	 * for(int index=0;index<selectLanguagesCount;index++) { 
	 * String selectLanguagesDropDownlanguageName=selectLanguages.get(index).getText();
	 * System.out.println(index+" "+selectLanguagesDropDownlanguageName); }
	 * 
	 * // selecting an Optional Value from the DropDown(Select Languages)
	 * 
	 * Select selectLanguagesSelection = new Select(selectLanguagesDropDown);
	 * //selectLanguagesSelection.selectByIndex(7);
	 * //selectLanguagesSelection.selectByValue("en|ur");// string Type
	 * selectLanguagesSelection.selectByVisibleText("Tamil");// string Type
	 * 
	 * // DeSelection of Selected Optional Value from the DropDown // during a
	 * selection of an optional value from the dropdown - when going for //
	 * deselection of the same selected Optional Value - it is not mandartory to //
	 * use a similar type of method
	 * selectLanguagesSelection.deselectByVisibleText("Telugu");
	 * selectLanguagesSelection.deselectByValue("en|ta");
	 * selectLanguagesSelection.deselectByIndex(9);
	 * 
	 * // to deselect all the selected Optional values at a time then use the below
	 * method selectLanguagesSelection.deselectAll(); } }
	 */
	
	
	// Read & Writing the WebTable Data Dynamically Getting
	/*
	 * public class HandlingDynamicWebTable extends BaseTest {
	 * 
	 * public void handlingDynamicWebTable() {
	 * 
	 * // Identifying the WebTable // /html/body/div[5]/section[1]/div
	 * 
	 * By webTableProperty = By.xpath("/html/body/div[5]/section[1]/div");
	 * WebElement webTable = driver.findElement(webTableProperty);
	 * 
	 * //
	 * /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	 * 
	 * // Identifying the number of Rows in the WebTable By webTableRowProperty =
	 * By.tagName("tr"); // In the WebTable finding the number of Row's
	 * 
	 * List<WebElement> webTableRows = webTable.findElements(webTableRowProperty);
	 * 
	 * int webTableRowsCount = webTableRows.size();
	 * 
	 * // should goto every Row - and finding the number of Row of Cell's for (int
	 * rowIndex = 0; rowIndex <= webTableRowsCount; rowIndex++) { // Going to the
	 * WebTable and reaching to a particular Row of the WebTable WebElement row =
	 * webTableRows.get(rowIndex);
	 * 
	 * // Identifying the number of Cells in the Row By rowOfCellProperty =
	 * By.tagName("td");
	 * 
	 * // going to a particular row and identifying the number of Row of Cells
	 * List<WebElement> rowOfCells = row.findElements(rowOfCellProperty);
	 * 
	 * int rowOfCellsCount = rowOfCells.size();
	 * 
	 * // going to a Row of all its respective Cells for (int rowOfCellIndex = 0;
	 * rowOfCellIndex < rowOfCellsCount; rowOfCellIndex++) { // going to a Row of a
	 * Cell WebElement rowOfCell = rowOfCells.get(rowOfCellIndex);
	 * 
	 * // get the data from the Row oF Cell String webTableData =
	 * rowOfCell.getText(); System.out.println(webTableData);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 */
	
	// Properties File
	/*
	 * # OrangeHRM Application LogIn Page LogIn Panel element Locator is id
	 * orangeHRMApplicationLogInPageLogInPanelProperty=logInPanelHeading
	 * 
	 * # UserName element locator is id 
	 * orangeHRMApplicationUserProperty = txtUsername
	 * 
	 * // Identifying the Properties file
        propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.properties");
        properties = new Properties();
        properties.load(propertiesFile); 
	 */
	
	// Read & Write Data From Excel File as well as Property File
	/*
	 * Row testDataSheetRow; XSSFWorkbook workBook;
	 * 
	 * FileInputStream logInTestDataFile = new FileInputStream(
	 * "./src/com/OrangeHRMApplicationTestDataFiles/OrangeHRMApplication_LogInTestData.xlsx"
	 * ); workBook = new XSSFWorkbook(logInTestDataFile);XSSFSheet
	 * logInTestDataSheet = workBook.getSheet("LogInTestData");
	 * 
	 * testDataSheetRow=logInTestDataSheet.getRow(1); Cell
	 * userNameTestDataCell=testDataSheetRow.getCell(0); String
	 * userNameTestData=userNameTestDataCell.getStringCellValue();
	 * System.out.println(" The UserName is :- "+userNameTestData);
	 * 
	 * // Validating LogIn Functionality
	 * 
	 * // Automating UserName WebElement // String userNameTestData="srini"; // Test
	 * data - which should be passed to sendKeys method By
	 * userNameProperty=By.id(properties.getProperty(
	 * "orangeHRMApplicationUserProperty")); // idetifying the property of an
	 * element assigned to a variable // the property of the element should be
	 * identified in the WebPage WebElement
	 * userName=driver.findElement(userNameProperty); // WebElement is an interface
	 * of Selenium ( which can be treated as a dataType ) // Performing an operation
	 * on the identified webElement userName.sendKeys(userNameTestData);
	 * 
	 * 
	 * FileOutputStream logInTestResultFile = new FileOutputStream(
	 * "./src/com/OrangeHRMApplicationTestDataFiles/OrangeHRMApplication_LogInTestData.xlsx"
	 * ); workBook.write(logInTestResultFile);
	 */
	
	// Executing Suite File [.xml] file ----> TestNGSuit
	
	/*
	 * <suite name="OrangeHRMApplicationTesting" >
	 * 
	 * <test name="LogInTest"> <classes> <class
	 * name="com.OHRMApplicationTestingTestNG.OrangeHRMApplication_LogInTest"/>
	 * </classes> </test>
	 * 
	 * 
	 * <test name="AddEmployeeTest"> <classes> <class
	 * name="com.OHRMApplicationTestingTestNG.OrangeHRMApplication_AddEmployeeTest"/
	 * > </classes> </test>
	 * 
	 * </suite>
	 */
	
	// Validating Image
	/*
	 * // id="empPic" By photographProperty=By.id("empPic"); WebElement
	 * employeePhotograph=driver.findElement(photographProperty);
	 * 
	 * 
	 * boolean flag=employeePhotograph.isDisplayed();
	 * 
	 * if(flag) {
	 * System.out.println(" Employee Photograph Uploaded Successfully - PASS"); }
	 * else {
	 * System.out.println(" Employee Photograph NOT Uploaded Successfully - FAIL");
	 * }
	 */
	
	// Using Actions Class,  Read & write Data from both Excel & Properties File, AutoIT, getAttribute
	
	//@Test(priority=7,description=" Adding New Employee to the Add Emplyee Funcationalty in OrangeHRM Application ")
	/*public void addingNewEmployeeTest() throws InterruptedException, IOException
	{

	// id="firstName"
	By firstNameProperty=By.id("firstName");
	WebElement firstName=driver.findElement(firstNameProperty);
	firstName.sendKeys("Srini009");

	// shifting the focus from the FirstName to Middle Name
	Actions keyBoardAction = new Actions(driver);
	keyBoardAction.sendKeys(Keys.TAB).build().perform();

	//without identifying the properties of the MiddleName element directly automating
//	    middle name element - since the Actions class Object focus is now at the
//	       middleName element - using the same object directly performing the operation
	keyBoardAction.sendKeys("Nivas002").build().perform();

	// shifting the focus from the MiddleName to LastName
	keyBoardAction.sendKeys(Keys.TAB).build().perform();
	// Automating LastName
	keyBoardAction.sendKeys("Testing002").build().perform();

	// shifting to Employee ID
	keyBoardAction.sendKeys(Keys.TAB).build().perform();

	// shifting to Photograph
	keyBoardAction.sendKeys(Keys.TAB).build().perform();

	// performing ENTER key of KeyBoard Operation
	keyBoardAction.sendKeys(Keys.ENTER).build().perform();

	Thread.sleep(10000);

	java.lang.Runtime.getRuntime().exec
	("C:\\Users\\srinivas1\\Desktop\\9AMNovemberBatch\\WebApplicationTesting\\"
	+ "AutoItTestScripts\\EmployeePhotGraphUpload.exe");

	Thread.sleep(10000);


	

	// id="middleName"
	By middleNameProperty=By.id("middleName");
	WebElement middleName=driver.findElement(middleNameProperty);
	middleName.sendKeys("Nivas009");

	// id="lastName"

	By lastNameProperty=By.id("lastName");
	WebElement lastName=driver.findElement(lastNameProperty);
	lastName.sendKeys("Test009");
	
	// id="employeeId"
	By employeeIdProperty=By.id("employeeId");
	WebElement employeeId=driver.findElement(employeeIdProperty);
	String newEmployeeId=employeeId.getAttribute("value");
	System.out.println(" The expected New Employee ID is : "+newEmployeeId);

	// id="btnSave"
	By saveButtonProperty=By.id("btnSave");
	WebElement saveButton=driver.findElement(saveButtonProperty);
	saveButton.click();
	//

	}*/
	
	
	//log File Auto Generation....
	// Using Xpaths Syntaxes
	
	/*Xpath syntax-
	//tagname[@attribute='attributeValue']
	Example- //input[@name='q']

	2. //tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2' and ...]
	Example- //input[@name='q' and @type='text' and @title='Search']

	Xpath using text():
	1.//tagname[text()='textvalue']
	Example-//span[text()='hdfc netbanking']

	xpath using contains:
	1.//tagname[contains(text(),'partialtextvalue')]
	Example-//span[contains(text(),'netbanking')]

	2.//tagname[contains(@attributename,'partialValue')]
	Example-//ul[contains(@class,'erk')]

	===========================================================

	image.png

	=======================================================

	// <input type="text"  
	//data-testid="royal_email" placeholder="Email address or phone number"
	//autofocus="1" aria-label="Email address or phone number">

	// locator is Xpath
	// selector - xpath expression ( is created based on the attributes and their
//	            corresponding values )

	// Syntax of Xpath Expression Creation - based on Single Property
	// //tagname[@attribute='attributeValue']

	//By emailIdProperty=By.id("email");

	//  //input[@data-testid='royal_email']
	// By emailIdProperty=By.xpath("//input[@data-testid='royal_email']");

	// //*[@data-testid='royal_email']
	// "//" - indicates search on the complete WebPage
	// "*" - indicates search for all the Tags in the WebPage

	// By emailIdProperty=By.xpath("//*[@data-testid='royal_email']"); // based on Single Property

	// Syntax of Xpath Expression Creation - based on Multiple Properties
	// //tagname[@attributename1='attributevalue1' and @attributename2='attributevalue2' and ...]

	// //input[@placeholder='Email address or phone number' and @aria-label='Email address or phone number']
//	                OR
	// //*[@placeholder='Email address or phone number' and @aria-label='Email address or phone number']

	By emailIdProperty=By.xpath("//input[@placeholder='Email address or phone number' and @aria-label='Email address or phone number']");

	WebElement email=driver.findElement(emailIdProperty);
	email.sendKeys("srini.livetech@gmail.com");

	// Absolute Xpath expression starts with "html" tag
	// Relative xpath expression starts with "//"


	// <input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
	// data-testid="royal_pass"
	// placeholder="Password" aria-label="Password">

	//By passwordProperty=By.xpath("//input[@type='password']");
	// By passwordProperty=By.xpath("//input[@id='pass']");
	By passwordProperty=By.xpath("//*[@id=\"pass\"]");
	                             //*[@id='pass']
	                             //*[@id="pass"]

	WebElement password=driver.findElement(passwordProperty);
	password.sendKeys("Testing");

	// <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy"
	//name="login" data-testid="royal_login_button"
	// type="submit" id="u_0_5_RU">Log in</button>

	By logInButtonProperty=By.xpath("//*[@type='submit']");
	WebElement logInButton=driver.findElement(logInButtonProperty);
	logInButton.click();

	}*/
	
	// POM ----> BaseClass, PageClass, TestClass
	
	/*public class OrangeHRMApplication_LogInPage extends BaseTest
	{

	public OrangeHRMApplication_LogInPage() // This is a Constructor - when the Java Class name is
	                                       //   similar to the Method Name
	{
	PageFactory.initElements(driver, this);
	}

	// This Java Class is referred to as an Object Repository Class

	// id="logInPanelHeading"
	// Identifying the Element of the Webpage

	//WebElement orangeHRMApplicationLogInPage_LogInPanel=driver.findElement(By.id("logInPanelHeading"));

	@FindBy(id="logInPanelHeading")
	WebElement orangeHRMApplicationLogInPage_LogInPanel;
	
	@FindBy(xpath="//*[@id=\"divLogo\"]/img")
	WebElement orangeHRMApplicationLogInPageImage;
	
	*/
	
	
	
	// Handling Window popup objects
	/*
	 * // Alert alertWindow=driver.switchTo().alert(); //alertWindow.accept(); 
	 * // accept - will perform the Operation on the Ok button
	 * // alertWindow.dismiss();
	 * // dismiss - will perform operation on the Cancel button 
	 * // alertWindow.sendKeys(" Test Data "); 
	 * // to pass the Test data into the alert window
	 */	
	

	// Cucumber Complete Frame Work --- Execute with JUnit & Add Required Dependencies, tags, Reports Generations - Extent,json,html
	// Classes --->  Hooks Class, MethodsClass, TestRunner File ----->  Cucumber File (.Feature)
	// Scenarios - 1, 2, 3  ----> Login Functionality with Single Test Data And Multiple Sets of Test Data

	
	// Git ---> Pushing & Pulling the Test Scripts
	// Jenkins ---> Execution of Automated Test Scripts
	// Grid -----> Local & Host Execution --- using Different OS & Browsers

}
