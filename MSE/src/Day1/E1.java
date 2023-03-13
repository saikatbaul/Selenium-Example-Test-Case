package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\libs\\selenium-jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://crudphpsaikat.000webhostapp.com/index.php");
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("uname")).sendKeys("saikat");
		
		driver.findElement(By.name("password")).sendKeys("4444");
		
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
