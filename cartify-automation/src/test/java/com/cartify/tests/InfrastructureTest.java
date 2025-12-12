package com.cartify.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * InfrastructureTest: Basic sanity check for the testing framework.
 * Migrated from SimpleFrameworkTest in auto module.
 */
public class InfrastructureTest {

    @Test(priority = 1, description = "Basic test to verify framework setup")
    public void testFrameworkSetup() {
        String expected = "Framework Ready";
        String actual = "Framework Ready";

        Assert.assertEquals(actual, expected, "Framework should be ready");
        System.out.println("✅ Framework is set up correctly!");
    }

    @Test(priority = 2, description = "Verify Java assertions work")
    public void testAssertions() {
        Assert.assertTrue(true, "True should be true");
        Assert.assertFalse(false, "False should be false");
        Assert.assertNotNull("test", "String should not be null");

        System.out.println("✅ All assertions working correctly!");
    }

    @Test(priority = 3, description = "Verify basic calculations")
    public void testBasicLogic() {
        int sum = 2 + 2;
        Assert.assertEquals(sum, 4, "2 + 2 should equal 4");

        System.out.println("✅ Basic logic tests pass!");
    }
}
