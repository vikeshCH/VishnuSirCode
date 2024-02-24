package All_UseFull_SmartWork_Resources;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Utility.Log;

public class UDM_AutomationPracticePage extends BaseTest {

	@Test(priority = 1, description = " Verify HeaderBlock Text ")
	public void headerBlockElements_GetLinks() throws InterruptedException {
		System.out.println(" ****************** headerBlockElements_Got_Text **************** ");
		WebElement HeaderBlock = driver
				.findElement(By.xpath("//header[@class = 'jumbotron text-center header_style']"));
		String HeaderBlockContent = HeaderBlock.getText();
		System.out.println(HeaderBlockContent);
		Log.info(" ***** headerBlockElements_Got_Text ******* ");
		System.out.println();
		Thread.sleep(3000);
	}

	@Test(priority = 2, description = " Click_On_RadioButton ")
	public void Click_On_RadioButton() {
		// RadioButtons by clicking on it Select one Option...
		By radioButton2Property = By.xpath("//input[@value='radio2']");
		WebElement radioButton = driver.findElement(radioButton2Property);
		radioButton.click();
		// System.out.println("Click on Radio Button option 2");
		Log.info(" ***** Click_On_RadioButton option 2 ******* ");
		System.out.println();
	}

	@Test(priority = 3, description = " Select_One_Option_From_The_DropDownList ")
	public void Select_One_Option_From_The_DropDownList() {
		// Click on DropDown Button & Select one Option from the list
		By ClickOnDropDownProperty = By.id("dropdown-class-example");
		WebElement ClickOnDropDown = driver.findElement(ClickOnDropDownProperty);
		ClickOnDropDown.click();
		System.out.println("Click on Select option");
		// Log.info(" ***** Select_One_Option_From_The_DropDownList ******* ");

		Select countryOption_DropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		countryOption_DropDown.selectByValue("option2");
		// System.out.println("Selected option 2");
		Log.info(" ***** Select_One_Option_From_The_DropDownList option 2 ******* ");

	}

	@Test(priority = 4, description = " Click_On_CheckBox ")
	public void Click_On_CheckBox() {
		By CheckBox2Property = By.xpath("//input[@id='checkBoxOption2']");
		WebElement CheckBox2 = driver.findElement(CheckBox2Property);
		CheckBox2.click();
		// System.out.println("Click on Check Box option 2");
		Log.info(" ***** Click_On_CheckBox option 2 ******* ");

	}

	@Test(priority = 5, description = " EnterKeyWord_Select_Suggested_Option_From_The_List ")
	public void EnterKeyWord_Select_Suggested_Option_From_The_List() {
		By SelectCountriesProperty = By.xpath("//input[@id='autocomplete']");
		WebElement SelectCountries = driver.findElement(SelectCountriesProperty);
		SelectCountries.sendKeys("In");

		new WebDriverWait(driver, Duration.ofSeconds(20))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ui-id-17']"))).click();

		// System.out.println("Selected Country name India");
		Log.info(" ***** EnterKeyWord_Select_Suggested_Option_From_The_List ******* ");

	}

	@Test(priority = 6, description = " Handling_Alert_Message ")
	public void Handling_Alert_Message() throws InterruptedException {
		By alertMessageProperty = By.id("name");
		WebElement alertMessage = driver.findElement(alertMessageProperty);
		alertMessage.sendKeys("Vikesh");

		By alertButtonProperty = By.id("alertbtn");
		WebElement alertButton = driver.findElement(alertButtonProperty);
		alertButton.click();

		Alert alertWindow = driver.switchTo().alert();
		Thread.sleep(3000);
		alertWindow.accept();
		// System.out.println("Enter Alert Name in Tesxt Box ----> Alert Message as
		// vikesh");
		// System.out.println("Click on Alert Message Button");
		Log.info(" ***** Handling_Alert_Message Click on Alert Message Button ******* ");

	}

	@Test(priority = 7, description = " ShowElement_HideElement_IsEnabled ")
	public void ShowElement_HideElement_IsEnabled() {
		// Checking isDisplayed or Not Text Box
		By textBoxHideProperty = By.id("displayed-text");
		boolean textBoxHide = driver.findElement(textBoxHideProperty).isDisplayed();

		if (textBoxHide) {
			System.out.println("The text box is Enabled");
		} else {
			System.out.println("The text box is not Enabled");
		}
		Log.info(" ***** ShowElement_HideElement_IsEnabled ******* ");

	}

	@Test(priority = 8, description = " Handling_MultipleWindowObjects_MultipleTabs ")
	public void Handling_MultipleWindowObjects_MultipleTabs() throws InterruptedException {
		// Single Window
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("parent Window Handle - " + parentWindowHandle + " - " + driver.getTitle());

		driver.findElement(By.id("openwindow")).click();

		Set<String> WindowHandles = driver.getWindowHandles();
		for (String windowHandle : WindowHandles) {
			if (!windowHandle.equals(parentWindowHandle)) {
				driver.switchTo().window(windowHandle);
				System.out.println("Child Window Handle - " + windowHandle + " - " + driver.getTitle());
				driver.manage().window().maximize();

				WebElement footerBlock = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']"));
				List<WebElement> footerBlock_links = footerBlock.findElements(By.tagName("a"));

				int footerBlock_linksCount = footerBlock_links.size();
				System.out.println(" No.of Links in the Header Block :- " + footerBlock_linksCount);

				for (int i = 0; i < footerBlock_linksCount; i++) {
					String footerBlock_links_Names = footerBlock_links.get(i).getText();
					System.out.println(i + " - " + footerBlock_links_Names);
					Thread.sleep(2000);
				}
				driver.close();
				driver.switchTo().window(parentWindowHandle);

			}
		}

		Log.info(" ***** Handling_SingleWindowObjects******* ");

		driver.findElement(By.id("opentab")).click();
		Thread.sleep(3000);
		// driver.quit();

		// Single Tab
		String parentWindowHandle2 = driver.getWindowHandle();
		System.out.println("parent Window Handle - " + parentWindowHandle + " - " + driver.getTitle());

		// driver.findElement(By.id("openwindow")).click();

		Set<String> WindowHandlesTab = driver.getWindowHandles();

		for (String windowHandle1 : WindowHandlesTab) {
			if (!windowHandle1.equals(parentWindowHandle2)) {
				driver.switchTo().window(windowHandle1);
				System.out.println("Child Window Handle - " + WindowHandlesTab + " - " + driver.getTitle());
				driver.manage().window().maximize();

				WebElement footerBlock = driver.findElement(By.xpath("//*[@id='navbarSupportedContent']"));
				List<WebElement> footerBlock_links = footerBlock.findElements(By.tagName("a"));

				int footerBlock_linksCount = footerBlock_links.size();
				System.out.println(" No.of Links in the Header Block :- " + footerBlock_linksCount);

				for (int i = 0; i < footerBlock_linksCount; i++) {
					String footerBlock_links_Names = footerBlock_links.get(i).getText();
					System.out.println(i + " - " + footerBlock_links_Names);
					Thread.sleep(2000);
				}
				driver.close();
				driver.switchTo().window(parentWindowHandle);

			}
		}

		Log.info(" ***** Handling_SingleTab_Object ******* ");

	}

	@Test(priority = 9, description = " MouseOverActions_MoveTo_TopOfThePage ")
	public void MouseOverActions_MoveTo_TopOfThePage() {
		By MouseOverProperty = By.id("mousehover");
		WebElement MouseOver = driver.findElement(MouseOverProperty);
		Actions moveMosetoMouseOverButton = new Actions(driver);
		moveMosetoMouseOverButton.moveToElement(MouseOver).build().perform();

		WebElement moveToTargetTop = driver.findElement(By.xpath("//html/body/div[4]/div/fieldset/div/div/a[1]"));
		moveMosetoMouseOverButton.click(moveToTargetTop).build().perform();
		// System.out.println("Moved to Top of the Page");
		Log.info(" ***** MouseOverActions_MoveTo_TopOfThePage ******* ");
		System.out.println();
	}

	@Test(priority = 10, description = " FetchingWebTableData_ReadData ")
	public void FetchingWebTableData_ReadData() {
		WebElement WebtableHighlight = driver.findElement(By.id("product"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');",
				WebtableHighlight);

		List<WebElement> WebtableNames = driver.findElements(By.id("product"));

		String xpath1 = "//*[@id=\"product\"]/tbody/tr[";
		String xpath2 = "]/td[1]";

		int webtablesize = WebtableNames.size();
		System.out.println(" The size of the WebElement :- " + webtablesize);

		for (int i = 1; i < webtablesize; i++) {
			String names = WebtableNames.get(i).getText();
			// System.out.println(names);
			Log.info(names);

			// WebElement webTableRow = driver.findElement(By.xpath(xpath1+i+xpath2));

		}
		Log.info(" ***** FetchingWebTableData_ReadData ******* ");

		System.out.println();

		List<WebElement> WebtableNames2 = driver.findElements(By.xpath("//*[@name=\"courses\"]"));
		int webtablesize1 = WebtableNames2.size();
		System.out.println(" The size of the WebElement :- " + webtablesize1);

		for (int i = 0; i < 1; i++) {
			String names1 = WebtableNames2.get(i).getText();
			// System.out.println(names1);
			Log.info(names1);

			// WebElement webTableRow = driver.findElement(By.xpath(xpath1+i+xpath2));

		}
		Log.info(" ***** FetchingWebTableData_ReadData ******* ");

		System.out.println();

	}

	// @Test(priority = 11 , description = " FetchingWebTableData_in_Excel_WriteData
	// ")
	public void FetchingWebTableData_in_Excel_WriteData() {

	}

	@Test(priority = 11, description = " SwitchTo_Iframe_WebElements ")
	public void SwitchTo_Iframe_WebElements() {
		// iframe
		driver.switchTo().frame("courses-iframe");
		WebElement headerBlock = driver.findElement(By.xpath("//nav[@class='main-menu']"));
		String headerBlockText = headerBlock.getText();
		System.out.println(headerBlockText);
		Log.info(headerBlockText);
		System.out.println();

		driver.switchTo().defaultContent();
		// id = - Footer Block

	}

	@Test(priority = 12, description = " FooterBlockElements_GetText_Click_on_MultipleLinks ")
	public void FooterBlockBlockElements_GetText_Click_on_MultipleLinks() {
		WebElement footerBlock = driver.findElement(By.id("gf-BIG"));
		String footerBlockContent = footerBlock.getText();
		// System.out.println(footerBlockContent);
		Log.info(footerBlockContent);
		Log.info(" ***** FooterBlockBlockElements_GetText_Click_on_MultipleLinks ******* ");
		System.out.println();
	}
	
	 //Portals --- //ESS //ESS --- 
}
