package com.demo.playwright.api;
public class InvoiceApiClient {
    public enum InvoiceStatus { PAID, PENDING }
    public static InvoiceStatus createInvoice(String invoiceId) {
        System.out.println("API: Creating invoice " + invoiceId);
        return invoiceId.startsWith("PAID") ? InvoiceStatus.PAID : InvoiceStatus.PENDING;
    }
}
