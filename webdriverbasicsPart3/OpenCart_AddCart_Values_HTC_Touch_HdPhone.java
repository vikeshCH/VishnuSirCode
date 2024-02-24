package webdriverbasicsPart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart_AddCart_Values_HTC_Touch_HdPhone {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://demo-opencart.com/");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		String actualSubTotal = driver.findElement(By.xpath("//td/strong[contains(text(),'Sub-Total')]")).getText();
		String actualSubTotal_Value = driver.findElement(By.xpath("//td[text()='$100.00']")).getText();
		String actualEco_Tax = driver.findElement(By.xpath("//td/strong[contains(text(),'Eco Tax (-2.00)')]")).getText();
		String actualEco_Tax_Value = driver.findElement(By.xpath("//td[text()='$2.00']")).getText();
		String actualVAT = driver.findElement(By.xpath("//td/strong[contains(text(),'VAT (20%)')]")).getText();
		String actualVAT_Value = driver.findElement(By.xpath("//td[text()='$20.00']")).getText();
		////td/strong[text(),'Total']
		String actualTotal = driver.findElement(By.xpath("//td/strong[text()='Total']")).getText();
		String actualTotal_Value = driver.findElement(By.xpath("//td[text()='$122.00']")).getText();
		System.out.println(actualSubTotal + " : " + actualSubTotal_Value);
		System.out.println(actualEco_Tax + " : "+ actualEco_Tax_Value);
		System.out.println(actualVAT + " : "+ actualVAT_Value);
		System.out.println(actualTotal + " : "+ actualTotal_Value);
		
		String expectedSubTotal = "Sub-Total";
		String expectedSubTotal_Value = "$100.00";
		String expectedEco_Tax  = "Eco Tax (-2.00)";
		String expectedEco_Tax_Value = "$2.00";
		String expectedVAT= "VAT (20%)";
		String expectedVAT_Value= "$20.00";
		String expectedTotal = "Total";
		String expectedTotal_Value = "$122.00";
		////1
		if (actualSubTotal.equals(expectedSubTotal)) {
			System.out.println("Acutual Result & Expected Result are Equal of  Sub-Total_Text = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of  Sub-Total_Text = Test Fail");
		}
		/////2
		if (actualSubTotal_Value.equals(expectedSubTotal_Value)) {
			System.out.println("Acutual Result & Expected Result are Equal of SubTotal_Value = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of SubTotal_Value = Test Fail");
		}
		/////3
		if (actualEco_Tax.equals(expectedEco_Tax)) {
			System.out.println("Acutual Result & Expected Result are Equal of Eco_Tax_Text = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of Eco_Tax_Text = Test Fail");
		}
		////4
		if (actualEco_Tax_Value.equals(expectedEco_Tax_Value)) {
			System.out.println("Acutual Result & Expected Result are Equal of Eco_Tax_Value = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of Eco_Tax_Value = Test Fail");
		}
		////5
		if (actualVAT.equals(expectedVAT)) {
			System.out.println("Acutual Result & Expected Result are Equal of VAT_Text = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of VAT_Text = Test Fail");
		}
		//////6
		if (actualVAT_Value.equals(expectedVAT_Value)) {
			System.out.println("Acutual Result & Expected Result are Equal of VAT_Value = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of VAT_Value = Test Fail");
		}
		//////7
		if (actualTotal.equals(expectedTotal)) {
			System.out.println("Acutual Result & Expected Result are Equal of Total_Text = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of Total_Text = Test Fail");
		}
		/////8
		if (actualTotal_Value.equals(expectedTotal_Value)) {
			System.out.println("Acutual Result & Expected Result are Equal of Total_Value = Test Pass");
		}
		else {
			System.out.println("Acutual Result & Expected Result are Not Equal of Total_Value = Test Fail");
		}
		
		
	}

}
