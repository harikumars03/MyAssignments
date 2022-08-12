package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String sourceData=driver.getPageSource();
	System.out.println(sourceData);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harikumar");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("harikumarsel@gmail.com");
	driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Change*12345");

	WebElement  birthday  = driver.findElement(By.name("birthday_day"));
	Select dd1=new Select(birthday);
	dd1.selectByVisibleText("03");
	

	WebElement  birthmonth  = driver.findElement(By.name("birthday_month"));
	Select dd2=new Select(birthmonth);
	dd2.selectByVisibleText("03");
	
	WebElement  birthyear  = driver.findElement(By.name("birthday_year"));
	Select dd3=new Select(birthyear);
	dd3.selectByVisibleText("1997");
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	driver.findElement(By.name("websubmit")).click();
	driver.close();
	
}
}

