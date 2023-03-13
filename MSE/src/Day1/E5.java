package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\libs\\selenium-jars\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		int n = 55;
		driver.get("https://crudphpsaikat.000webhostapp.com/delete.php?id="+n);
		
		Thread.sleep(1000);
		
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

