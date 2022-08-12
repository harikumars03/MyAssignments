package Assignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
	    driver.findElement(By.xpath("(//ul[@class='sectionTabBar']//a)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='left-content-column']//a)[2]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Harikumar");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Sel");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Harikumar");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sel");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("SoftWare");
		driver.findElement(By.xpath("(//textarea[@class='inputBox'])[1]")).sendKeys("Welcome");
		driver.findElement(By.xpath("//input[contains(@id,'_primaryEmail')]")).sendKeys("harikumarsel03@gmail.com");
		WebElement dd1 = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select drop1=new Select(dd1);
		drop1.selectByIndex(15);
		WebElement dd2 = driver.findElement(By.xpath("//select[contains(@id,'_generalCountryGeoId')]"));
		Select drop2=new Select(dd2);
		drop2.selectByVisibleText("India");
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='createContactForm_preferredCurrencyUomId']"));
		Select drop3=new Select(dd3);
		drop3.selectByValue("INR");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).sendKeys("WellCome");
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Infosys");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		}

}

