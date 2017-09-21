package com.gold.app.browserLib;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Danny on 29/04/2017.
 */
public class RemoteCustomCapabilities {


    private URL url;
    private String systemPath;

    public RemoteCustomCapabilities() throws MalformedURLException {
        this.systemPath = System.getProperty("user.dir");
        url = new URL("http://192.168.1.10:4445/wd/hub");
    }

    public WebDriver getFireFoxDriver() {
        String systemPath = System.getProperty("user.dir");
        String fireFoxPath = systemPath + "\\drivers\\windows\\firefox\\geckodriver-v0.15.0-win64\\geckodriver.exe";
        System.setProperty("Webdriver.gecko.driver", fireFoxPath);
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setJavascriptEnabled(true);
        caps.setPlatform(Platform.WIN10);
        caps.setCapability(FirefoxDriver.PROFILE, profile);
        return new RemoteWebDriver(url, caps);
    }

    public WebDriver getChromeDriver() {
        String systemPath = System.getProperty("user.dir");
        String chromePath = systemPath + "\\drivers\\windows\\chrome\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extension");
        chromeOptions.addArguments("--start-maximised");
        chromeOptions.addArguments("--enabled -javascript");
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setJavascriptEnabled(true);
        caps.setPlatform(Platform.WIN10);
        caps.setBrowserName("chrome");
        return new RemoteWebDriver(url, caps);
    }

    public WebDriver getIEDriver() {
        String systemPath = System.getProperty("user.dir");
        String IEPath = systemPath + "\\drivers\\windows\\internet-explorer\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", IEPath);
        DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
        ieCaps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        ieCaps.setJavascriptEnabled(true);
        ieCaps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        return new RemoteWebDriver(url, ieCaps);
    }

    public WebDriver getMicrosoftEdge() {
        String systemPath = System.getProperty("user.dir");
        String microsoftEdgePath = systemPath + "\\drivers\\windows\\microsoft edge\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", microsoftEdgePath);
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setPlatform(Platform.WIN10);
        caps.setJavascriptEnabled(true);
        return new RemoteWebDriver(url, caps);
    }

    public WebDriver getSafariDriver() {
        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setJavascriptEnabled(true);
        caps.setPlatform(Platform.MAC);
        return new RemoteWebDriver(url, caps);

    }
}
