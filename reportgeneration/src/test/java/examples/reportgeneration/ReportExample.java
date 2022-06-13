package examples.reportgeneration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportExample {
	ExtentReports r=new ExtentReports();
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		System.out.println("Generated");
		ExtentSparkReporter d=new ExtentSparkReporter(path);
		
		d.config().setDocumentTitle("Example Report");
		d.config().setReportName("My report");
		
		
		r.attachReporter(d);
		r.setSystemInfo("Tester", "Manju");
	}
	@Test
	public void exTest()
	{
		r.createTest("ex test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manjunath k s\\Desktop\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(dr.getTitle());
	}
	@Test
	public void exampleTest()
	{
		r.createTest("example test");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manjunath k s\\Desktop\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		System.out.println(dr.getTitle());
	
		r.flush();
	}

}
