package demo.webdriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.sun.xml.xsom.impl.scd.Iterators;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//class WebDriverInstance
public class WebdriverInstance {

    public static WebDriver webdriver;
//    public static final String USERNAME = "anggapangestika1";
//    public static final String AUTOMATE_KEY = "33Hp15yFUPyDvspxFYYn";
//    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void initialize()  {

//        DesiredCapabilities caps = new DesiredCapabilities();
//        ChromeOptions options = new ChromeOptions();
//        //options.addArguments("incognito");
//        options.setPageLoadStrategy(PageLoadStrategy.NONE);
//        caps.setCapability("os", "Windows");
//        caps.setCapability("os_version", "10");
//        caps.setCapability("browser", "Chrome");
//        caps.setCapability("browser_version", "90.0");
//        caps.setCapability("browserstack.idleTimeout","300");
//        caps.setCapability("project", "Stockbit Web");
//        caps.setCapability("build", "Stockbit Regression Test");
//        caps.setCapability("name", "Stockbit Regression Test");
//        caps.setCapability("browserstack.networkLogs", "true");
//        caps.setCapability("resolution", "1920x1080");
//        try {
//            webdriver = new RemoteWebDriver(new URL(URL), caps) {
//            };
//            //webdriver.manage().deleteAllCookies();
//            webdriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }

//        ChromeOptions option=new ChromeOptions();
//        option.setPageLoadStrategy(PageLoadStrategy.NONE);
//        webdriver = new ChromeDriver(option);
//        webdriver.manage().window().maximize();
//        webdriver.get("https://stockbit.com");

    ChromeOptions options = new ChromeOptions();
    //set chromeOptions. You can check here: https://peter.sh/experiments/chromium-command-line-switches/
    options.addArguments("--incognito", "--start-maximized");
    //set desired capabilities
    options.setCapability(CapabilityType.PLATFORM_NAME, Platform.MAC);
    options.setCapability(CapabilityType.BROWSER_NAME, BrowserType.CHROME);
    //instantiate webdriver
    webdriver = new ChromeDriver(options);
    //maximize kalo pake mac gbisa maximize
    webdriver.manage().window().maximize();
    //set implicit wait
    webdriver.manage().timeouts()
        .implicitlyWait(5, TimeUnit.SECONDS);
    webdriver.get("https://accounts.kitabisa.com/register");
//    DesiredCapabilities caps = new DesiredCapabilities();
//    caps.setCapability("browserName", "chrome");
//    caps.setCapability("browserVersion", "87.0");
//    caps.setCapability("enableVNC", true);
//    caps.setCapability("enableVideo",true);
//    webdriver = new RemoteWebDriver(new URL("http://localhost:6969/wd/hub/"),caps);
//        webdriver.manage().window().maximize();
//    //set implicit wait
//    webdriver.manage().timeouts()
//        .implicitlyWait(5, TimeUnit.SECONDS);

    }

    public static void quit() {
        webdriver.quit();
    }

}


