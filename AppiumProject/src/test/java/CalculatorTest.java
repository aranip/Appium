import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CalculatorTest {
	 static AppiumDriver<MobileElement> driver;
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try{
	openCalculator();
}catch(Exception exp){
	System.out.println(exp.getCause());
	System.out.println(exp.getMessage());
	exp.printStackTrace();
}
	}

	public static void openCalculator() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName","Alcatel");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","5.1.1"); 
		cap.setCapability("udid","9fe6a744");
		
		cap.setCapability("appPackage","com.tct.calculator");
		cap.setCapability("appActivity","com.tct.calculator.Calculator");
		
		URL url = new URL(" http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application started");
		
	}
}
