package PROJECTS;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contacts {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();	
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' PROJECTS']")).click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()=' Contacts'])[5]")).click();	
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@name='salutationtype']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("Mr.");
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Software");
		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("8523697415");
		driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("8523697415");
		driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("8523369415");
		driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("7410852063");
		driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("Software");

		
		WebElement ele6 = driver.findElement(By.id("Contacts_editView_fieldName_birthday"));
		ele6.sendKeys("10");
		 Actions d = new Actions(driver);
		 d.sendKeys(ele6, Keys.ENTER);
		 d.perform();
		
		driver.findElement(By.id("Contacts_editView_fieldName_contact_id_create")).click();
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("(//*[@name='salutationtype'])[2]"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Mr.");
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML/BODY/DIV[5]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV[1]/DIV/TABLE/TBODY/TR[1]/TD[2]/INPUT")).sendKeys("Software");
		driver.findElement(By.xpath("/HTML/BODY/DIV[5]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV[1]/DIV/TABLE/TBODY/TR[1]/TD[4]/INPUT")).sendKeys("Hardware");
		driver.findElement(By.xpath("/HTML/BODY/DIV[5]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV[1]/DIV/TABLE/TBODY/TR[2]/TD[2]/INPUT")).sendKeys("789456321");
		driver.findElement(By.xpath("/HTML/BODY/DIV[5]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV[1]/DIV/TABLE/TBODY/TR[3]/TD[2]/INPUT")).sendKeys("www.abc@gmail.com");
		driver.findElement(By.xpath("/HTML/BODY/DIV[5]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV[1]/DIV/TABLE/TBODY/TR[2]/TD[4]/DIV/DIV/INPUT[2]")).sendKeys("Software");
		
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("4");
		
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("www.abc@gmail.com");
		
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		
		driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();
		
		
		WebElement ele4 = driver.findElement(By.xpath("//*[@name='assigned_user_id']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("4");
		
		
	   driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Software");
	   Thread.sleep(2000);
	   driver.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
	   Thread.sleep(2000);
	   
	   
	   driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("IT");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("8529637415");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc@gmail.com");
		WebElement ele9 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s9 = new Select(ele9);
		s9.selectByValue("4");
		
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()='Yes'])")).click();
		
	   
				
		WebElement ele5 = driver.findElement(By.xpath("//*[@name='leadsource']"));
		Select s5 = new Select(ele5);
		s5.selectByValue("Public Relations");
		
		driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("Software");
		
		driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("IT");
		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("www.abc@gmail.com");
		driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("Software");
		driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("8529637415");
		
		JavascriptExecutor js1 =  (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,200)");

		
		driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();
		driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();
		
		driver.findElement(By.xpath("//*[@name='mailingstreet']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='otherstreet']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation");

		driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("741852");
		driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("PUNE");
		driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("SATARA");
		driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("852963");
		driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("INDIA");
		driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("Software");
		driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("Nashik");
		driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("Kerla");
		driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("89653274566");
		driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("US");
		
		
		JavascriptExecutor js2 =  (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0,400)");
		
		driver.findElement(By.xpath("//*[@name='description']")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation");
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@class='fileUploadBtn btn btn-primary']")).click();
		Thread.sleep(200);
		 Runtime.getRuntime().exec("C:\\Users\\Prajakta\\Desktop\\AutoitFiles\\A.exe"); 
		 Thread.sleep(200);
		 driver.findElement(By.xpath("(//*[@class='btn btn-success saveButton'])")).click();
		 Thread.sleep(2000);	
		 driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		 Thread.sleep(200);
		 driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		
		
		
		
		
		

	}

}
