# QuickChat Application – Part 2

## Student Details
- Name: Shaun Rikhotso
- Student Number: ST10520428
- Module: PROG5121
- Assignment: POE Part 2

---

# Project Description

QuickChat is a Java console application developed using NetBeans.  
The application allows users to register, log in, and send messages using a menu-driven system.

The program includes input validation, message handling, message hashing, JSON storage, and JUnit testing.

---

# Features

## Registration and Login
The system allows users to:
- Register an account
- Log in with username and password
- Validate usernames, passwords, and South African phone numbers

### Validation Rules
#### Username
- Must contain an underscore (_)
- Must not exceed 5 characters

#### Password
- Must contain:
  - 8 or more characters
  - A capital letter
  - A number
  - A special character

#### Phone Number
- Must start with +27
- Must be correctly formatted

---

# QuickChat Features

## Send Messages
Users can:
- Enter recipient number
- Enter a message
- Send, store, or disregard a message

## Message Validation
- Recipient number is validated
- Messages cannot exceed 250 characters

## Message Hash
A message hash is automatically generated using:
- Message ID
- Message number
- First and last words of the message

## JSON Storage
Messages can be stored in a JSON file.

---

# Classes Used

## Main Class
Handles:
- User interaction
- Menu system
- Program execution flow

## Login Class
Handles:
- Registration
- Validation
- Authentication

## Message Class
Handles:
- Message creation
- Validation
- Hash generation
- Message storage

---

# Unit Testing

JUnit tests were created to test:
- Username validation
- Password validation
- Phone number validation
- Message validation
- Message hash generation

---

# How to Run the Program

1. Open the project in NetBeans
2. Run the Main class
3. Register or log in
4. Use the menu to send messages

---

# GitHub Repository

PASTE YOUR GITHUB LINK HERE

---

# Video Demonstration

The video demonstrates:
- Program structure
- Registration and login
- Message functionality
- Validation methods
- JUnit testing
- Program execution

PASTE YOUR YOUTUBE LINK HERE

---

# Notes

- The application was developed using Java in NetBeans
- Object-oriented programming principles were used
- Input validation and testing improve system reliability
