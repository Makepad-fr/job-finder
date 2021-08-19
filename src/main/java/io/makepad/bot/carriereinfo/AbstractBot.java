package io.makepad.bot.carriereinfo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AbstractBot {
    protected final WebDriver driver;
    protected final WebDriverWait wait;

    AbstractBot(){
        DesiredCapabilities caps = new DesiredCapabilities();
        FirefoxProfile profile = new FirefoxProfile();
        FirefoxOptions options = new FirefoxOptions();
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36 OPR/60.0.3255.170";
        options.addPreference("general.useragent.override",userAgent);
        this.driver = new FirefoxDriver(options);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(120));
        this.driver.manage().window().maximize();
        this.driver.get("https://www.carriere-info.fr/FRANCE-Emploi");
    }
}
