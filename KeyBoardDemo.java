import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\dell\\eclipse-workspace\\July-2021\\data.properties");
		prop.load(file);
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
//		driver.navigate().to(prop.getProperty("url"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		
//		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
//		//driver.findElement(By.cssSelector("input[name='firstname']"));
//		
//		WebElement firstname= driver.findElement(By.cssSelector("input[name='firstname']"));
		Actions actions=new Actions(driver);
//		actions.keyDown(Keys.SHIFT);
//		actions.sendKeys(firstname,"santosh");
//		actions.keyUp(Keys.SHIFT);
//		actions.build().perform();
		
//		driver.navigate().to("https://demoqa.com/automation-practice-form");
//		WebElement FirstName=driver.findElement(By.cssSelector("input#firstName"));
//		actions.keyDown(Keys.SHIFT);
//		actions.sendKeys(FirstName, "santosh");
//		actions.keyUp(Keys.SHIFT);
//		actions.build().perform();
//		actions.sendKeys(Keys.TAB);
//		actions.sendKeys("GHODKE").build().perform();
//		actions.sendKeys(Keys.TAB);
//		actions.sendKeys("santoshghodke@gmail.com").build().perform();
//		actions.sendKeys(Keys.TAB);
//		actions.click().build().perform();
//		WebElement uploadPic=driver.findElement(By.cssSelector("input#uploadPicture"));
//		actions.moveToElement(uploadPic).build().perform();
		
//		actions.keyDown(Keys.TAB);
//		actions.keyUp(Keys.TAB);
		
//		//click
//		driver.navigate().to("https://demoqa.com/buttons");
//		WebElement doubleClickBtn =driver.findElement(By.cssSelector("button#doubleClickBtn"));
//		WebElement RightClickBtn= driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
//		WebElement DynamicClick =driver.findElement(By.xpath("//button[text()='Click Me']"));
//		
//		actions.doubleClick(doubleClickBtn).perform();
//		actions.contextClick(RightClickBtn).perform();
//		actions.click(DynamicClick).perform();

		//Drag and Drop
//		driver.navigate().to("https://demoqa.com/droppable");
//		WebElement Source= driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement Target= driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
//		actions.dragAndDrop(Source, Target).build().perform();
		
		
//		driver.navigate().to("https://demoqa.com/menu/");
//		WebElement MainItems2= driver.findElement(By.xpath("//a[text()='Main Item 2']"));
//		actions.moveToElement(MainItems2).perform();
//		WebElement SUBSUBLIST=driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
//		actions.moveToElement(SUBSUBLIST).perform();
//		
		driver.navigate().to("https://demoqa.com/tool-tips");
		WebElement ToolTipBtn = driver.findElement(By.cssSelector("button#toolTipButton"));
		actions.moveToElement(ToolTipBtn).perform();
		String tooltiptext = driver.findElement(By.xpath("//div[@id='buttonToolTip']")).getText();
		System.out.println(tooltiptext);
//		
//		WebElement Contrary = driver.findElement(By.xpath("//a[text()='Contrary']"));
//		actions.moveToElement(Contrary).perform();
//		String ContraryText = driver.findElement(By.xpath("//div[@id='contraryTexToolTip']")).getText();
//		System.out.println(ContraryText);

	}

}
