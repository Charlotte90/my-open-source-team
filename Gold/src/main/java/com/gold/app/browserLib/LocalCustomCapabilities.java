package com.gold.app.browserLib;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by Danny on 29/04/2017.
 */
public class LocalCustomCapabilities {

    public FirefoxDriver getFireFoxDriver(String machineType) {
        String systemPath = System.getProperty("user.dir");
        String fireFoxPath = systemPath + "\\drivers\\windows\\firefox\\geckodriver-v0.15.0-win64\\geckodriver.exe";
        System.setProperty("Webdriver.gecko.driver", fireFoxPath);
        FirefoxProfile profile = new FirefoxProfile();
        profile.setAcceptUntrustedCertificates(true);
        DesiredCapabilities caps = DesiredCapabilities.firefox();
        caps.setJavascriptEnabled(true);
        caps.setPlatform(Platform.WIN10);
        caps.setCapability(FirefoxDriver.PROFILE, profile);
        return new FirefoxDriver(caps);
    }

    public ChromeDriver getChromeDriver(String machineType) {
        String systemPath = System.getProperty("user.dir");
        String chromePath = systemPath + "\\drivers\\windows\\chrome\\chromedriver_win32\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-extension");
        chromeOptions.addArguments("--start-maximised");
        chromeOptions.addArguments("--enabled -javascript");
        return new ChromeDriver(chromeOptions);
    }

    public InternetExplorerDriver getIEDriver(String machineType) {
        String systemPath = System.getProperty("user.dir");
        String IEPath = systemPath + "\\drivers\\windows\\internet-explorer\\IEDriverServer_Win32_3.0.0\\IEDriverServer.exe";
        System.setProperty("webdriver.ie.driver", IEPath);
        DesiredCapabilities ieCaps = DesiredCapabilities.internetExplorer();
        ieCaps.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
        ieCaps.setJavascriptEnabled(true);
        ieCaps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        return new InternetExplorerDriver();
    }

    public EdgeDriver getMicrosoftEdge(String machineType) {
        String systemPath = System.getProperty("user.dir");
        String microsoftEdgePath = systemPath + "\\drivers\\windows\\microsoft edge\\MicrosoftWebDriver.exe";
        System.setProperty("webdriver.edge.driver", microsoftEdgePath);
        DesiredCapabilities caps = DesiredCapabilities.edge();
        caps.setPlatform(Platform.WIN10);
        caps.setJavascriptEnabled(true);
        return new EdgeDriver(caps);
    }

    public SafariDriver getSafariDriver(String machineType) {
        DesiredCapabilities caps = DesiredCapabilities.safari();
        caps.setJavascriptEnabled(true);
        caps.setPlatform(Platform.MAC);
        return new SafariDriver();

    }
}
