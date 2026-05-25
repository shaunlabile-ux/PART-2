/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Student
 */
public class Login {
 private String storedUsername = "kyl_1";
    private String storedPassword = "Password@123";

    // Username validation
    public boolean checkUserName(String username) {

        return username.contains("_")
                && username.length() <= 5;
    }

    // Password validation
    public boolean checkPasswordComplexity(String password) {

        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {

            if (Character.isUpperCase(c)) {
                hasCapital = true;
            }

            if (Character.isDigit(c)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }

        return password.length() >= 8
                && hasCapital
                && hasNumber
                && hasSpecial;
    }

    // Phone number validation
    public boolean checkCellPhoneNumber(String number) {

        return number.matches("^\\+27\\d{9}$");
    }

    // Register user
    public String registerUser(String username,
            String password,
            String number) {

        if (!checkUserName(username)) {

            return "Username incorrectly formatted.";
        }

        if (!checkPasswordComplexity(password)) {

            return "Password incorrectly formatted.";
        }

        if (!checkCellPhoneNumber(number)) {

            return "Phone number incorrectly formatted.";
        }

        storedUsername = username;
        storedPassword = password;

        return "User registered successfully.";
    }

    // Login user
    public boolean loginUser(String username,
            String password) {

        if (storedUsername == null
                || storedPassword == null) {

            return false;
        }

        return storedUsername.equals(username)
                && storedPassword.equals(password);
    }

    // Login message
    public String returnLoginStatus(boolean success) {

        if (success) {

            return "Login successful.";
        } else {

            return "Username or password incorrect.";
        }
    }   
}
