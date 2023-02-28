package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\libs\\selenium-jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crudphpsaikat.000webhostapp.com/list.php");
		
		Thread.sleep(800);
		
		driver.findElement(By.name("out")).click();
		
		String acting_url = driver.getCurrentUrl();
		String desired_url = "https://crudphpsaikat.000webhostapp.com/index.php";
		
		if(acting_url.equals(desired_url))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
}

