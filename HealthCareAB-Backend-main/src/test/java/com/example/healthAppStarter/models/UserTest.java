package com.example.healthAppStarter.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getFirstName() {
        //Här testar jag fail.
        fail("This test is not implemented");
    }

    @Test
    void setFirstName() {
        //Testar hur det ser ut ifall man inte anger samma
        User user = new User();
        user.setLastName("Mohamed");
        assertEquals("Yousif", user.getLastName());

           }


    @Test
    void setLastName() {
            User user = new User();
            user.setLastName("Mohamed");

        String actualLastName = user.getLastName();
        String expectedLastName = "Mohamed";
        assertEquals(expectedLastName, actualLastName, "Expected: " + expectedLastName + ", Actual: " + actualLastName);

        assertEquals("Mohamed", user.getLastName());

    }

    @Test
    void setPhoneNumber() {
        User user = new User();
        user.setPhoneNumber("123456789");
        assertEquals("123456789", user.getPhoneNumber());
    }

    @Test
    void getGender() {
        User user = new User();
        user.setGender("Male");
        assertEquals("Male", user.getGender());
    }

    @Test
    void setGender() {
        User user = new User();
        user.setGender("Male");
        assertEquals("Male", user.getGender());
    }

    @org.junit.Test
    public void testGetFirstName() {

    }
    @org.junit.Test
    public void testSetFirstName() {
    }


    @org.junit.Test
    public void testGetLastName1() {
    }

    @org.junit.Test
    public void testSetLastName1() {
    }

    @org.junit.Test
    public void testGetPhoneNumber1() {
    }

    @org.junit.Test
    public void testSetPhoneNumber1() {
    }

    @org.junit.Test
    public void testGetGender() {
    }

    @org.junit.Test
    public void testSetGender() {
    }

}