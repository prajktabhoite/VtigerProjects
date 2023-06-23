package PROJECTS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ProjectTasks {

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
		driver.findElement(By.xpath("(//*[text()=' Project Tasks'])[1]")).click();	
		driver.findElement(By.id("ProjectTask_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("ProjectTask_editView_fieldName_projecttaskname")).sendKeys("Software");		
		WebElement ele1 = driver.findElement(By.cssSelector("*[name='projecttasktype']"));
		Select s1 = new Select(ele1);
		s1.selectByValue("administrative");	
		driver.findElement(By.id("ProjectTask_editView_fieldName_projectid_create")).click();
		
		driver.findElement(By.id("Project_editView_fieldName_projectname")).sendKeys("abcd");
		WebElement ele2 = driver.findElement(By.xpath("(//*[@name='assigned_user_id'])[2]"));
		Select s2 = new Select(ele2);
		s2.selectByValue("4");	
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[5]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[6]")).click();
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		
		driver.findElement(By.xpath("(//*[contains(@name,'saveButton')])")).click();
		
		WebElement ele3 = driver.findElement(By.xpath("//*[@name='projecttaskstatus']"));
		Select s3 = new Select(ele3);
		s3.selectByValue("Completed");	
		
		WebElement ele4 = driver.findElement(By.xpath("//*[@name='projecttaskpriority']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("normal");	
		
		driver.findElement(By.id("ProjectTask_editView_fieldName_projecttasknumber")).sendKeys("78");
		
		WebElement ele5 = driver.findElement(By.xpath("//*[@name='assigned_user_id']"));
		Select s5 = new Select(ele5);
		s5.selectByValue("3");
		
		
		WebElement ele6 = driver.findElement(By.xpath("//*[@name='projecttaskprogress']"));
		Select s6 = new Select(ele6);
		s6.selectByValue("40%");
		
		driver.findElement(By.id("ProjectTask_editView_fieldName_projecttaskhours")).sendKeys("85");
		
		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[3]")).click();
		driver.findElement(By.xpath("//TABLE[@class=' table-condensed']/TFOOT/TR[1]/TH[@style='display: table-cell;']")).click();
		
		
		driver.findElement(By.xpath("(//*[contains(@class,'input-group-addon')])[4]")).click();
		driver.findElement(By.xpath("/HTML/BODY/DIV[8]/DIV[1]/TABLE/TFOOT/TR[1]/TH")).click();
		
		driver.findElement(By.id("ProjectTask_editView_fieldName_description")).sendKeys("Selenium is an open source umbrella project for a range of tools and libraries aimed at supporting browser automation. It provides a playback tool for authoring functional tests across most modern web browsers, without the need to learn a test scripting language.");
		
		driver.findElement(By.cssSelector("*[type='submit']")).click();
		
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//a[.='Atlas Jeniffer']")).click();
		Thread.sleep(200);
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	}

}
