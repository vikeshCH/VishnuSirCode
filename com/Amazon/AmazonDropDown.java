package com.Amazon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		By All_Links_DropDownProperty=By.id("searchDropdownBox"); 
		WebElement selectLanguagesDropDown=driver.findElement(All_Links_DropDownProperty);
		
		 List<WebElement> All_Links_DropDown =selectLanguagesDropDown.findElements(By.tagName("option"));
		

		FileInputStream excelTestDataFile1 = new FileInputStream("./src/com/ExcelFiles/TestDataFamily.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile1);
		XSSFSheet dataSheet = workBook.getSheet("amazon_AllCategories_Links");

		int LinksCount = All_Links_DropDown.size();

		for (int index = 0; index < LinksCount; index++) {
			String linkName = All_Links_DropDown.get(index).getText();
			Row rowData = dataSheet.createRow(index);
			Cell cellData = rowData.createCell(1);
			cellData.setCellValue(linkName);

			FileOutputStream testDataOutputFile = new FileOutputStream("./src/com/ExcelFiles/TestDataFamily.xlsx");
			workBook.write(testDataOutputFile);
			System.out.println(index + " - " + linkName);
		}
	}
}

/*
 * for (int i = 0; i < args.length; i++) {
 *  List <WebElement> DropDown = driver.findElements(By.id("searchDropdownBox")); DropDown.get(i).getText();
 * System.out.println(DropDown); }
 */

//		for (WebElement ele : links) {
//			System.out.println(ele.getText());
//		}



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
 * int selectLanguagesCount=selectLanguages.size(); 
 * System.out. println(" The number of languages in Select Languages DropDown is :- "+selectLanguagesCount);
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
 * selectLanguagesSelection.selectByVisibleText("Tamil");
 */
