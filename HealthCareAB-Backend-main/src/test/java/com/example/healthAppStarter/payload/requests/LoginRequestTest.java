package com.example.healthAppStarter.payload.requests;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginRequestTest {

    @Test
    public void getUsername() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("testUser");
        String username = loginRequest.getUsername();
        assertEquals("testUser", username);
    }

    @Test
    public void setUsername() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("newUser");
        assertEquals("newUser", loginRequest.getUsername());
    }

    @Test
    public void getPassword() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword("testPassword");
        String password = loginRequest.getPassword();
        assertEquals("testPassword", password);

    }

    @Test
    public void setPassword() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword("newPassword");
        assertEquals("newPassword", loginRequest.getPassword());
    }

}