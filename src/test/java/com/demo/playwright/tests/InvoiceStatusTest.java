package com.demo.playwright.tests;
import com.demo.playwright.api.InvoiceApiClient;
import com.demo.playwright.pages.InvoicePage;
import com.demo.playwright.utils.BaseTest;
import com.demo.playwright.utils.TestConfig;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoiceStatusTest extends BaseTest {
    @Test
    public void invoiceShouldBePaid() {
        // 1. API creates PAID invoice
        InvoiceApiClient.InvoiceStatus status = InvoiceApiClient.createInvoice("PAID-1001");
        Assert.assertEquals(status, InvoiceApiClient.InvoiceStatus.PAID);
        
        // 2. UI shows PAID invoice
        InvoicePage invoicePage = new InvoicePage(page);
        invoicePage.open(String.format(TestConfig.PAID_INVOICE, "1001"));
        Assert.assertTrue(invoicePage.getHeaderText().contains("PAID-1001"));
        Assert.assertTrue(invoicePage.getHeaderText().contains("PAID"));
    }
    
    @Test
    public void invoiceShouldBePending() {
        // 1. API creates PENDING invoice
        InvoiceApiClient.InvoiceStatus status = InvoiceApiClient.createInvoice("PENDING-2001");
        Assert.assertEquals(status, InvoiceApiClient.InvoiceStatus.PENDING);
        
        // 2. UI shows PENDING invoice
        InvoicePage invoicePage = new InvoicePage(page);
        invoicePage.open(String.format(TestConfig.PENDING_INVOICE, "2001"));
        Assert.assertTrue(invoicePage.getHeaderText().contains("PENDING-2001"));
        Assert.assertTrue(invoicePage.getHeaderText().contains("PENDING"));
    }
}
