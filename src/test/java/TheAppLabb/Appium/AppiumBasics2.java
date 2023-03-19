package TheAppLabb.Appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics2 {
	
	   @Test
	   public void AppiumTest() throws MalformedURLException
	   {
		    
		   //Android Driver  ,  IOS driver
		   // first argument should be the server port number
//		  UiAutomator2Options dc = new UiAutomator2Options();
//		  dc.setPlatformName(null)
		
		   DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 5");
			dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
			dc.setCapability("appium:app", "/Users/bharadwajvittal/eclipse-workspace/Appium/src/test/java/Resources/ApiDemos-debug.apk");
		   AppiumDriver driver = new AppiumDriver( new URL("http://localhost:4723/wd/hub")  , dc);
		   
	   }

}
