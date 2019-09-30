package com.qalabs.seleniumbasics.testngexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGExample1 extends BaseTest {
    @Test
    public void passTC() {
        this.myDriver.get("https://www.google.com.mx/");
        Assert.assertEquals(this.myDriver.getCurrentUrl(), "https://www.google.com.mx/", "Parece que no es Google");
    }
}
