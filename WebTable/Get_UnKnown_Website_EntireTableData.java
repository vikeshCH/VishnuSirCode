package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_UnKnown_Website_EntireTableData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.smashingmagazine.com/2019/01/table-design-patterns-web/");
		driver.get("https://webdatacommons.org/webtables/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		//WebElement framewebTable1 = driver.findElement(By.id("cp_embed_omzbGY"));
		//driver.switchTo().frame(framewebTable1);
		
		
		WebElement webTable = driver.findElement(By.xpath("//*[@id=\"toccontent\"]/table[1]/tbody"));
		WebElement row2 = webTable.findElement(By.xpath("//*[@id=\"toccontent\"]/table[1]/tbody/tr[2]"));
		WebElement row2ofCell2 = row2.findElement(By.xpath("//*[@id=\"toccontent\"]/table[1]/tbody/tr[2]/td[1]"));

		
		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');", row2ofCell2 );
		
		WebElement webTable2 = driver.findElement(By.xpath("//*[@id=\"toccontent\"]/table[2]/tbody"));
		WebElement t2row2 = webTable2.findElement(By.xpath("//*[@id=\"toccontent\"]/table[2]/tbody/tr[4]"));
		WebElement t2row2ofCell2 = t2row2.findElement(By.xpath("//*[@id=\"toccontent\"]/table[2]/tbody/tr[4]/td"));

		
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor)driver;
		jsExecutor1.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');", t2row2ofCell2 );
		
		WebElement webTable3 = driver.findElement(By.xpath("//*[@id=\"toccontent\"]/table[3]/tbody"));

		
		JavascriptExecutor jsExecutor2 = (JavascriptExecutor)driver;
		jsExecutor2.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');",  webTable3);
		
		String data1=row2ofCell2.getText();
		System.out.println(data1);
		
		String data2=t2row2ofCell2.getText();
		System.out.println(data2);

	}

}
