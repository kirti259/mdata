import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mtest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.driver.chromedriver","C:\\selenium resources\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://techpub-connect-demo.netlify.app/html/contactus.html");
		driver.findElement(By.xpath("//h1[contains(text(),'Contact Us')]"));
		
		javaScriptExecutor js =(javaScriptExecutor) driver;
		js.executeScript("Windows.args.scrollby(0,350)", "");
		
	driver.findElement(By.xpath("//label[contains(text(),'Name')]")).sendKeys("kirti jadhav");
	driver.findElement(By.xpath("//label[contains(text(),'Phone')]")).sendKeys("123456789");
	driver.findElement(By.xpath("//label[contains(text(),'Email')]")).sendKeys("kirtijadhav05@gmail.com");
	driver.findElement(By.xpath("//label[contains(text(),'Subject')]")).sendKeys("to given a test");
    driver.findElement(By.xpath("//label[contains(text(),'Message')]")).sendKeys("sir give me update as early as possible");
	driver.findElement(By.xpath("//button[contains(text(),'SUBMIT NOW')]")).click();

		}