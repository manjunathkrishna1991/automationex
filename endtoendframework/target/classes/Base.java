package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties p;
	public WebDriver getDriver()
	{
		try {
			FileInputStream in =new FileInputStream("D:\\all\\sel\\selwithTestNg\\endtoendframework\\src\\test\\java\\resources\\data.properties");
			
			p=new Properties();
			
			p.load(in);
			
			String browser = p.getProperty("browser");
			
			if(browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjunath k s\\Desktop\\chromedriver.exe");
				
				driver=new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return driver;
	}
	
	public String takeScreenShot(String name,WebDriver driver)
	{
		 TakesScreenshot screen = (TakesScreenshot)driver;
			File file=screen.getScreenshotAs(OutputType.FILE);
			Date d=new Date(System.currentTimeMillis());
			String date=""+d.getDate()+"-"+d.getHours()+"-"+d.getMinutes()+"-"+d.getSeconds();
			String path=System.getProperty("user.dir")+"\\reports\\"+name+date+".png";
			try {
				FileUtils.copyFile(file, new File(path));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			return path;
	}
}
