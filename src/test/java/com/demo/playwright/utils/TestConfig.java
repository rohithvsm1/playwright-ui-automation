package com.demo.playwright.utils;
public class TestConfig {
    public static final String PAID_INVOICE = "data:text/html," +
        "<!DOCTYPE html><html><head><title>AT&T Invoice</title></head>" +
        "<body style='font-family:Arial;padding:20px;'>" +
        "<h1 style='color:green'>Invoice PAID-%s ✅</h1>" +
        "<p><strong>Status:</strong> PAID</p>" +
        "<p><strong>Amount:</strong> $100.00</p>" +
        "<p><strong>Due Date:</strong> PAID</p>" +
        "</body></html>";
    
    public static final String PENDING_INVOICE = "data:text/html," +
        "<!DOCTYPE html><html><head><title>AT&T Invoice</title></head>" +
        "<body style='font-family:Arial;padding:20px;'>" +
        "<h1 style='color:orange'>Invoice PENDING-%s ⚠️</h1>" +
        "<p><strong>Status:</strong> PENDING</p>" +
        "<p><strong>Amount:</strong> $200.00</p>" +
        "<p><strong>Due Date:</strong> 2025-01-15</p>" +
        "</body></html>";
}
