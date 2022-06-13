package resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportGeneration {

	static ExtentReports extent;
	
	public static ExtentReports getExtent()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter re=new ExtentSparkReporter(path);
		re.config().setDocumentTitle("Automation report");
		re.config().setReportName("End to End Test");
		
		extent=new ExtentReports();
		
		extent.attachReporter(re);
		extent.setSystemInfo("Tester", "Manjunath");
		
		return extent;
	}
}
