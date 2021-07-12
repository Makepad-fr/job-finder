package io.makepad.bot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract class AbstractBot {
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
        this.driver.get("https://weworkremotely.com/");
        WebElement e = this.driver.findElement(By.xpath("//*[@id=\"category-2\"]"));
        //scroll(e);
    }



    public void ByVisibleElement() {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Find element by link text and store in variable "Element"
        WebElement Element = driver.findElement(By.xpath(""));

        //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }




}
