import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip 
{
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver()
		
	   System.setProperty("webdriver.chrome.driver", "C:\\Jars\\chromedriver_win32\\chromedriver.exe");		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
				
	}
	
}
