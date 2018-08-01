package upload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class couponn {

	public static void main(String[] args)throws Throwable {
			 System.setProperty("webdriver.chrome.driver","/home/tantraadmin/browserdrivers/chromedriver");
			    WebDriver driver=new ChromeDriver();
			    driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.get("https://karmahealthcare.in/karma-app/test/Login.html");
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("NetTantra");
				driver.findElement(By.xpath("//input[@id='passowrd']")).sendKeys("reset123");
				driver.findElement(By.xpath("//input[@class='button']")).click();
				WebDriverWait wait1=new WebDriverWait(driver,20);
			    wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Patient Registration')]")));
				driver.findElement(By.xpath("//a[contains(text(),'Patient Registration')]")).click();
				WebDriverWait wait=new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='chw']/following-sibling::div/div[2]/div/div[@data-value=16]")));
				driver.findElement(By.xpath("//select[@id='chw']/following-sibling::div/div[2]/div/div[@data-value=16]")).click();
				driver.findElement(By.xpath("//input[@id=\"patient_name\"]")).sendKeys("Testl");
				driver.findElement(By.xpath("//input[@id='parent']")).sendKeys("qwer");
				driver.findElement(By.xpath("//input[@id='patient_age']")).sendKeys("34");
				WebElement yearbutton=driver.findElement(By.xpath("//input[@id='age_unit_years']"));
				yearbutton.click();
				boolean year=yearbutton.isSelected();
				if (year) {
					System.out.println("year radio button is selected");
					{
					System.out.println("year button is not selected");
					}
					
				}
	            WebElement sexbutton=driver.findElement(By.xpath("//input[@value='Female']"));
				sexbutton.click();
				boolean sex=sexbutton.isSelected();
				if (sex) {
					System.out.println("female radio button is selected");
					{
					System.out.println("female button is not selected");
					}
					
				}
				WebElement marriedbuttn=driver.findElement(By.xpath("//td[@colspan='2']//input[@value='0']"));
				marriedbuttn.click();
				boolean married=marriedbuttn.isSelected();
				if (married) {
					System.out.println("No radio button is selected");
					{
					System.out.println("NO button is not selected");
					}
					
				}
				WebElement bplbtn=driver.findElement(By.xpath("//input[@name='isBPL' and @value=1]"));
				bplbtn.click();
				boolean bpl=bplbtn.isSelected();
				if (bpl) {
					System.out.println("No radio button is selected");
					{
					System.out.println("NO radio button is not selected");
					}
					
				}
				driver.findElement(By.xpath("//input[@id='prescription']")).click();
				Alert al= driver.switchTo().alert();
				String msg= al.getText();
				System.out.println(msg);
				al.accept();
				WebDriverWait wait8=new WebDriverWait(driver, 10);
				wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='button']")));
				driver.findElement(By.xpath("//a[@class='button']")).click();
				WebDriverWait wait3=new WebDriverWait(driver,20);
				wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Edit\\Registration Details']")));
				driver.findElement(By.xpath("//input[@value='Edit\\Registration Details']")).click();
				WebDriverWait wait9=new WebDriverWait(driver, 10);
				wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='camp']")));
				driver.findElement(By.xpath("//input[@id='camp']")).click();
				WebDriverWait wait2=new WebDriverWait(driver, 10);
				wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=30]")));
				driver.findElement(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=30]")).click();
				driver.findElement(By.xpath("//select[@id='transport']/following-sibling::div//div[1]")).click();
				WebDriverWait waitb=new WebDriverWait(driver,20);
				waitb.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=4]")));
				driver.findElement(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=4]")).click();
				driver.findElement(By.xpath("//input[@name='weight']")).sendKeys("54");
				driver.findElement(By.xpath("//input[@name='height']")).sendKeys("162");
				driver.findElement(By.xpath("//input[@name='high_bp']")).sendKeys("90");
				driver.findElement(By.xpath("//input[@name='low_bp']")).sendKeys("90");
				driver.findElement(By.xpath("//input[@name='pulse']")).sendKeys("70");
				driver.findElement(By.xpath("//input[@name='temperature']")).sendKeys("98");
				driver.findElement(By.xpath("//input[@name='respiratory_rate']")).sendKeys("13");
				driver.findElement(By.xpath("//input[@name='spo2']")).sendKeys("99");
				driver.findElement(By.xpath("//select[@id='test_range_list[]0']/following-sibling::div/div[1]")).click();
				WebDriverWait waitv=new WebDriverWait(driver,20);
				waitv.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=\"[PoC] Blood Cholesterol Strip test (Total)\"]")));
				driver.findElement(By.xpath("//div[@class='selectize-dropdown-content'][1]/div[@data-value=\"[PoC] Blood Cholesterol Strip test (Total)\"]")).click();
				driver.findElement(By.xpath("//div[@class='selectize-input items not-full']//input[@id='NaN']")).sendKeys("120");
				driver.findElement(By.xpath("//input[@id='Email' and @value=\"Save\"]")).click();
				Alert all= driver.switchTo().alert();
				String mesg= all.getText();
				System.out.println(mesg);
				all.accept();
				Alert al1= driver.switchTo().alert();
				String mesg1= al1.getText();
				System.out.println(mesg1);
				al1.accept();
				
				
				
				
				
				
				
				
				

	}

}
