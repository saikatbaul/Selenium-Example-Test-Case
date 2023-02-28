package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\libs\\selenium-jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int n = 15;
		driver.get("https://crudphpsaikat.000webhostapp.com/update.php?id="+n);
		
		Thread.sleep(1000);
		
		WebElement txtbx_name = driver.findElement(By.name("name"));
		txtbx_name.sendKeys(Keys.chord(Keys.CONTROL, "a"), "Mr Saikat Baul");

		WebElement txtbx_email = driver.findElement(By.name("email"));
		txtbx_email.sendKeys(Keys.chord(Keys.CONTROL, "a"), "saikat@gmail.com");
		
		WebElement txtbx_mobile = driver.findElement(By.name("mobile"));
		txtbx_mobile.sendKeys(Keys.chord(Keys.CONTROL, "a"), "01718116914");
		
		driver.findElement(By.name("submit")).click();
		
		String acting_url = driver.getCurrentUrl();
		String desired_url = "https://crudphpsaikat.000webhostapp.com/list.php";
		
		if(acting_url.equals(desired_url))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
//		driver.close();
//		driver.quit();
	}
}