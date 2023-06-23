package PROJECTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Projects {

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
		driver.findElement(By.xpath("(//*[text()=' Projects'])[1]")).click();
		Thread.sleep(200);
		driver.findElement(By.id("Project_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("Project_editView_fieldName_projectname")).sendKeys("Software");		
		WebElement ele1 = driver.findElement(By.cssSelector("*[name='assigned_user_id']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("2");		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[3]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();	
		WebElement ele2 = driver.findElement(By.cssSelector("*[name='projecttype']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("administrative");
		driver.findElement(By.id("Project_editView_fieldName_potentialid_create")).click();
		driver.findElement(By.id("Potentials_editView_fieldName_potentialname")).sendKeys("abcd");
		driver.findElement(By.id("Potentials_editView_fieldName_amount")).sendKeys("852");	
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("2");	
		driver.findElement(By.id("related_to_display")).sendKeys("related_to_display");	
		driver.findElement(By.xpath("(//*[contains(@class,'fa fa-calendar ')])[4]")).click();
		driver.findElement(By.xpath("/HTML/BODY/DIV[9]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
		WebElement ele4 = driver.findElement(By.xpath("//*[@name='sales_stage']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("Prospecting");
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/HTML/BODY/DIV[1]/DIV[4]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV/DIV[1]/TABLE/TBODY/TR[1]/TD[4]/DIV/SPAN/I")).click();
		driver.findElement(By.xpath("/HTML/BODY/DIV[8]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("/HTML/BODY/DIV[1]/DIV[4]/DIV[2]/DIV/FORM/DIV[2]/DIV/DIV/DIV[1]/TABLE/TBODY/TR[2]/TD[4]/DIV/SPAN/I")).click();
		Thread.sleep(200);
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		WebElement ele8 = driver.findElement(By.xpath("//*[@name='projectstatus']"));
		Select s8 = new Select(ele8);
		s8.selectByValue("in progress");	
		driver.findElement(By.id("Project_editView_fieldName_linktoaccountscontacts_create")).click();	
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("ABC");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("8529637415");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.abc.com");		
		WebElement ele9 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s9 = new Select(ele9);
		s9.selectByValue("4");	
		driver.findElement(By.xpath("//*[@name='saveButton']")).click();
		WebElement ele5 = driver.findElement(By.xpath("//*[@class='select2 referenceModulesList select2-offscreen']"));
		Select s5 = new Select(ele5);
		s5.selectByValue("Contacts");
		driver.findElement(By.id("Project_editView_fieldName_targetbudget")).sendKeys("5000");
		driver.findElement(By.id("Project_editView_fieldName_projecturl")).sendKeys("https://demo.vtiger.com/");
		WebElement ele6 = driver.findElement(By.xpath("//*[@name='projectpriority']"));
		Select s6 = new Select(ele6);
		s6.selectByValue("high");
		WebElement ele7 = driver.findElement(By.xpath("//*[@name='progress']"));
		Select s7 = new Select(ele7);
		s7.selectByValue("40%");
		driver.findElement(By.id("Project_editView_fieldName_description")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browser");	
		driver.findElement(By.xpath("//*[text()='Save']")).click();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		

	}

}
