package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\libs\\selenium-jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://crudphpsaikat.000webhostapp.com/list.php");
		driver.findElement(By.name("add")).click();
		
		String pri_url = driver.getCurrentUrl();
		
		driver.get(pri_url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("Zeba Labiba");
		
		driver.findElement(By.name("email")).sendKeys("zeba898@gmail.com");
		
		driver.findElement(By.name("mobile")).sendKeys("01709336345");
		
		driver.findElement(By.name("save")).click();
		//driver.findElement(By.xpath("//a[@class=\"btn btn-default\"]"));
		
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