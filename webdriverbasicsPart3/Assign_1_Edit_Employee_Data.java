		package webdriverbasicsPart3;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_1_Edit_Employee_Data {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		driver.findElement(By.xpath("//*[@id='frmList_ohrmListComponent']/div[1]/ul/li[5]/a")).click();

		
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[10]/td[3]/a"));
		String firstValue_Stored=firstName.getText();
		System.out.println(firstValue_Stored);
		
		WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[10]/td[4]/a"));
		String naidu = lastName.getText();
		System.out.println(naidu);
		WebElement iD_ram = driver.findElement(By.xpath("//table/tbody/tr/td/a[text()=0017]"));
		iD_ram.click();
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("vanil");
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("kumar");
		driver.findElement(By.id("btnSave")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		WebElement firstName_V = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[13]/td[3]/a"));
		String venkayya = firstName_V.getText();
		System.out.println(venkayya);
		WebElement lastName_Naidu = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[13]/td[4]/a"));
		String naidu_last = lastName_Naidu.getText();
		System.out.println(naidu_last);
		
		if (firstValue_Stored != venkayya) {
			if(naidu != naidu_last) {
				System.out.println("First Names & Last Names are changed ----> Test Pass");
			}
		}
		else {
			System.out.println("First Names & Last Names are not changed -----> Test Fail");
		}	
	}
}
