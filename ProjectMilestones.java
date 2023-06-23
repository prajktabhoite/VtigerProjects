package PROJECTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProjectMilestones {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();	
		driver.findElement(By.id("appnavigator")).click();	
		driver.findElement(By.xpath("//span[text()=' PROJECTS']")).click();		
		driver.findElement(By.xpath("(//*[text()=' Project Milestones'])[1]")).click();	
		driver.findElement(By.id("ProjectMilestone_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("ProjectMilestone_editView_fieldName_projectmilestonename")).sendKeys("Software");
		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[3]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		
		WebElement ele2 = driver.findElement(By.xpath("//*[@name='projectmilestonetype']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("administrative");
		
		driver.findElement(By.id("ProjectMilestone_editView_fieldName_projectid_create")).click();
		driver.findElement(By.id("Project_editView_fieldName_projectname")).sendKeys("Abcd");
		
		WebElement ele3 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s3 = new Select(ele3);
		s3.selectByValue("4");
		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[4]")).click();
		driver.findElement(By.xpath("/HTML/BODY/DIV[7]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
		
		//driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[5]")).click();
		Thread.sleep(200);
		WebElement ele = driver.findElement(By.id("Project_editView_fieldName_targetenddate"));
		ele.sendKeys("15");
		 Actions d = new Actions(driver);
		 d.sendKeys(ele, Keys.ENTER);
		 d.perform();
		
		driver.findElement(By.cssSelector("*[name='saveButton']")).click();
		
		WebElement ele4 = driver.findElement(By.xpath("//*[@name='assigned_user_id']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("4");	

		driver.findElement(By.id("ProjectMilestone_editView_fieldName_description")).sendKeys("ProjectMilestone_editView_fieldName_description");
		driver.findElement(By.cssSelector("*[class='btn btn-success saveButton']")).click();
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
	}

}
