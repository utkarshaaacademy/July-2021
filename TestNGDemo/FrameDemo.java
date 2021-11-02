package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameDemo {
	WebDriver driver;
@Test
public void FrameTest() throws InterruptedException
{System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sharayu\\Dropbox\\My PC (LAPTOP-IKS9SD1L)\\Desktop\\chromedriver.exe");
driver=new ChromeDriver(); 
driver.get("https://demoqa.com/frames");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
String parentWindow = driver.getWindowHandle();
//WebElement Frame2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
driver.switchTo().frame("frame2");
String FrameText = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
System.out.println(FrameText);
driver.switchTo().window(parentWindow);
driver.switchTo().frame("frame1");
String FrameText1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
System.out.println(FrameText1);
String ExpectedTitle = "ToolsQA";
String ActualTitle = driver.getTitle();
Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
}
