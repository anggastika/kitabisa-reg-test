package demo.webdriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//class AndroidDriverInstance
public class AndroidDriverInstance {

  public static AndroidDriver androidDriver;


  public static void initialize() {
    String appiumUrl = "http://0.0.0.0:4723/wd/hub/";
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("platformName", "Android");
    caps.setCapability("platformVersion", "10.0");
    caps.setCapability("deviceName", "device");
    caps.setCapability("udid", "emulator-5554");
    caps.setCapability("app",
        System.getProperty("user.dir") + File.separator + "APP" + File.separator + "arif.apk");
    caps.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
    caps.setCapability("appPackage", "com.bibit.bibitid");
    caps.setCapability("appActivity", ".MainActivity");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("chromedriverExecutable",
        System.getProperty("user.dir") + File.separator + "chromedriver");
    try {
      androidDriver = new AndroidDriver<>(new URL(appiumUrl), caps);
      androidDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }




  public static void quit() {
    androidDriver.quit();
  }

}
