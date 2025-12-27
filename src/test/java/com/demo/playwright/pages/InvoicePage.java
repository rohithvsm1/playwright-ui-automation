package com.demo.playwright.pages;
import com.microsoft.playwright.*;
public class InvoicePage {
    private final Page page;
    public InvoicePage(Page page) { this.page = page; }
    public void open(String url) { page.navigate(url); }
    public String getHeaderText() { return page.locator("h1").textContent().trim(); }
}
