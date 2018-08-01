package upload;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload1 {

	public static void main(String[] args)throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","/home/tantraadmin/browserdrivers/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://karmahealthcare.in/karma-app/dev/Login.html");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("NetTantra");
		driver.findElement(By.xpath("//input[@id='passowrd']")).sendKeys("reset123");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jh=((JavascriptExecutor)driver);
		jh.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//div[@id='cssmenu']/ul/li/a[2]/span[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//a[@href='https://karmahealthcare.in/karma-app/dev/HealthCardAdd']")).click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Baslambi')]")).click();
		driver.findElement(By.xpath("//input[@id='card_no']")).sendKeys("UTM1234");
		driver.findElement(By.xpath("//input[@id='add_card_no']")).click();
		Thread.sleep(2000);
		Alert al= driver.switchTo().alert();
		String msg= al.getText();
		System.out.println(msg);
		al.accept();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Baslambi')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='file']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("file")).sendKeys("/home/tantraadmin/1234.xls");
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	    r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3000);
		driver.findElement(By.name("file")).sendKeys("/home/tantraadmin/1234.xls");
		driver.findElement(By.name("Submit_1")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://karmahealthcare.in/karma-app/dev/HealthCardManage']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='healthcard_notissued']")).sendKeys("UTM1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='next']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='psearch']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("ps_iframe");
		driver.findElement(By.id("20761")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='fa fa-user-plus fa-2x']")).click();
		Thread.sleep(3000);
		Alert hg= driver.switchTo().alert();
		String mesg= hg.getText();
		System.out.println(mesg);
		hg.accept();
		driver.findElement(By.xpath("//a[@href='https://karmahealthcare.in/karma-app/dev/HealthCardManageExisting']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hc_issued']")).sendKeys("UTM1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hc_issued_view']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='UTM1234_dh']")).click();
		Thread.sleep(3000);
		Alert ha= driver.switchTo().alert();
		String mgs= ha.getText();
		System.out.println(mgs);
		ha.accept();
		Thread.sleep(3000);
		Alert hd= driver.switchTo().alert();
		String mggs= hd.getText();
		System.out.println(mggs);
		hd.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='https://karmahealthcare.in/karma-app/dev/HealthCardSearch.html']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='healthcard_no']")).sendKeys("ASD3453");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='patient_id']")).sendKeys("BS20761");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='MobileNumber']")).sendKeys("7686786786");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='patient_name']")).sendKeys("Testforpricing");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	
		

	    


	}

}
