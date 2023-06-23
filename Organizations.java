package PROJECTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Organizations {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();	
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.xpath("//span[text()=' PROJECTS']")).click();	
		Thread.sleep(200);
		driver.findElement(By.xpath("(//*[text()=' Organizations'])[5]")).click();	
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("AccountName");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7418529631");
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("FAX");
		driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("7418529635");
		driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("Accounts_editView_fieldName_ownership")).sendKeys("74185");
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@name='rating']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("Active");
		
		JavascriptExecutor js2 =  (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,100)");
		
		driver.findElement(By.id("Accounts_editView_fieldName_siccode")).sendKeys("PQ74185");
		driver.findElement(By.id("Accounts_editView_fieldName_annual_revenue")).sendKeys("74185");
		driver.findElement(By.id("Accounts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc.com");
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("***");
		driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
		driver.findElement(By.xpath("(//*[@id='Accounts_editView_fieldName_accountname'])[2]")).sendKeys("AccountName");
		driver.findElement(By.xpath("(//*[@id='Accounts_editView_fieldName_phone'])[2]")).sendKeys("7418529635");
		driver.findElement(By.xpath("(//*[@id='Accounts_editView_fieldName_website'])[2]")).sendKeys("www.abcd.com");
		
		WebElement ele2 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s2 = new Select(ele2);
		s2.selectByValue("2");
		driver.findElement(By.xpath("(//*[@name='saveButton'])[1]")).click();
		
		driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("856");
		driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("abc@gmail.com");
		
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='industry'])[1]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("Banking");
		
		WebElement ele4 = driver.findElement(By.xpath("(//*[@name='accounttype'])[1]"));
		Select s4 = new Select(ele4);
		s4.selectByValue("Integrator");
		
		driver.findElement(By.id("Accounts_editView_fieldName_emailoptout")).click();
		
		WebElement ele5 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[1]"));
		Select s5 = new Select(ele5);
		s5.selectByValue("4");
		
		JavascriptExecutor js3 =  (JavascriptExecutor)driver;
		js3.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.cssSelector("*[name='bill_street']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. ");
		driver.findElement(By.cssSelector("*[name='ship_street']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. ");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_pobox")).sendKeys("BOX");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_city")).sendKeys("PUNE");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_state")).sendKeys("MAHARASHTRA");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_code")).sendKeys("BQ85296");
		driver.findElement(By.id("Accounts_editView_fieldName_bill_country")).sendKeys("INDIA");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_pobox")).sendKeys("852");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_city")).sendKeys("SATARA");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_state")).sendKeys("MAHARASHTRA");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_code")).sendKeys("BQ85296");
		driver.findElement(By.id("Accounts_editView_fieldName_ship_country")).sendKeys("INDIA");
		driver.findElement(By.cssSelector("*[name='description']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. ");
		driver.findElement(By.cssSelector("*[class='btn btn-success saveButton']")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		

		
		

	}

}
