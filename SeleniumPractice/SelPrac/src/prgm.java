//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class prgm {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://in.godaddy.com/");
     //driver.wait(10000);
     //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    //driver.close();
     
	}

}
