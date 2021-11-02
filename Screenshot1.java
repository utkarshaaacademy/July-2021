import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot1 {

	
		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.gecko.driver","C:\\\\Users\\\\eclipse-workspace\\\\ToolsQa_Project\\\\Driver\\\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://demoqa.com/automation-practice-form");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcfile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File (".\\Screenshot\\"+timestamp()+".jpeg"));

	}
		public static String timestamp() 
		{
			return new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
		}
			
		}


