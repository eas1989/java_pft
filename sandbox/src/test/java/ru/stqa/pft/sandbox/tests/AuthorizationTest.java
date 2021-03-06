// Generated by Selenium IDE

//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
package ru.stqa.pft.sandbox.tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class AuthorizationTest extends TestBase {

    @Test
    public void testLogin() {
        app.getAuthorizationHelper().setLogin();
        app.getAuthorizationHelper().setPassword();
        app.getAuthorizationHelper().loginButtonClick();
        app.getNavigationHelper().sleep(5000);
        Assert.assertTrue(app.getAuthorizationHelper().isElementTourWindowDisplayed());
    }

}
