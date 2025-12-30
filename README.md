# ⚡ Playwright UI Framework (POM)

**Reusable Page Object Model + 120+ utilities**

## 🎯 **DEMO PURPOSE**
Enterprise-grade framework (5+ project reuse)

## 🛠 **IMPLEMENTATION STEPS**

Setup Framework
   
npm i @playwright/test playwright-percy

Page Objects (pages/BillingPage.js)
   
class BillingPage {

async validateTotal(amount) { ... }

async processPayment() { ... }

}

Custom Matchers (expect.extend)
 
expect.extend({

toHaveValidBillingState: async (page, expected) => { ... }

});

Run Framework
npm run test:ui
npm run test:visual


## 🔥 **FRAMEWORK FEATURES**

✅ POM + Custom matchers (50+)

✅ Visual regression (Percy)

✅ API mocking + contract testing

✅ YAML test data

✅ Allure reporting

✅ 85% code reuse across projects
