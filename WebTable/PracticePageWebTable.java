package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;

public class PracticePageWebTable extends BaseTest {
	
	public void FetchingWebTable() {
		
		WebElement WebtableHighlight = driver.findElement(By.id("product"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');",
				WebtableHighlight);
		
		List<WebElement> WebtableNames = driver.findElements(By.id("product"));

		
		String xpath1 = "//*[@id=\"product\"]/tbody/tr[";
		String xpath2 = "]/td[1]";
		
		int webtablesize = WebtableNames.size();
		System.out.println(" The size of the WebElement :- "+webtablesize);
		
		
		for (int i = 1; i <webtablesize ; i++) {
			String names =  WebtableNames.get(i).getText();
			System.out.println(names);
			
			//WebElement webTableRow = driver.findElement(By.xpath(xpath1+i+xpath2));

		}
		
		System.out.println();
		
		List<WebElement> WebtableNames2 = driver.findElements(By.xpath("//*[@name=\"courses\"]"));
		int webtablesize1 = WebtableNames2.size();
		System.out.println(" The size of the WebElement :- "+webtablesize1);
		
		for (int i = 0; i <1 ; i++) {
			String names1 =  WebtableNames2.get(i).getText();
			System.out.println(names1);
			
			//WebElement webTableRow = driver.findElement(By.xpath(xpath1+i+xpath2));

		}
		
		
		//iframe
		System.out.println();
		
		driver.switchTo().frame("courses-iframe");
		WebElement headerBlock =  driver.findElement(By.xpath("//nav[@class='main-menu']"));
		String headerBlockText = headerBlock.getText();
		System.out.println(headerBlockText);
		
		System.out.println();
		
		driver.switchTo().defaultContent();
		//id = - Footer Block
		
		WebElement footerBlock = driver.findElement(By.id("gf-BIG"));
		String footerBlockContent = footerBlock.getText();
		System.out.println(footerBlockContent);
		
		System.out.println();
		
		
		
	}
	
	public static void main(String[] args) {
		PracticePageWebTable table = new PracticePageWebTable();
		table.applicationLaunch();
		table.FetchingWebTable();
		table.applicationClose();
	}
	
}
