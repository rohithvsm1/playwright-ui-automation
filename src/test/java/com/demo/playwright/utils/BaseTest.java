package com.demo.playwright.utils;
import com.microsoft.playwright.*;
import org.testng.annotations.*;

public class BaseTest {
    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;
    
    @BeforeSuite(alwaysRun = true)
    public static void launchBrowser() {
        System.out.println("🚀 LAUNCHING BROWSER...");
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
            .setHeadless(false)
            .setSlowMo(1000));
        System.out.println("✅ BROWSER LAUNCHED!");
    }
    
    @BeforeMethod(alwaysRun = true)
    public void setupPage() {
        System.out.println("📄 NEW PAGE...");
        context = browser.newContext();
        page = context.newPage();
        page.navigate("about:blank");
        System.out.println("✅ PAGE READY!");
    }
    
    @AfterMethod(alwaysRun = true)
    public void teardownPage() {
        if (context != null) context.close();
    }
    
    @AfterSuite(alwaysRun = true)
    public static void closeBrowser() {
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
