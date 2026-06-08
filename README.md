# Banking Application

## Objective

The Banking Application is a console-based Java project developed to simulate basic banking operations. The project demonstrates Object-Oriented Programming (OOP), exception handling, input validation, and menu-driven application development using Java.

---

## Features Implemented

* Deposit Money
* Withdraw Money
* Check Current Balance
* Exit Application
* Input Validation
* Exception Handling using InputMismatchException

---

## Technologies Used

* Java
* OOP Concepts
* Exception Handling
* Scanner Class
* Control Statements (if-else, switch, loops)

---

## Project Structure

banking_application/

├── BankAccount.java

└── BankingApp.java

### Class Responsibilities

#### BankAccount.java

Responsible for:

* Managing account balance
* Deposit operation
* Withdraw operation
* Balance inquiry

#### BankingApp.java

Responsible for:

* User interaction
* Menu handling
* Input validation
* Exception handling

---

## Concepts Demonstrated

* Classes and Objects
* Constructors
* Encapsulation
* Method-based Design
* Exception Handling
* Input Validation
* Menu-driven Programming

---

## How to Compile and Run

### Compile

javac BankAccount.java BankingApp.java

### Run

java BankingApp

---

## Sample Output

Welcome to Banking App

1. Deposit
2. Withdraw
3. Check Balance
4. Exit

Enter your choice: 1

Enter Amount to Deposit
5000

Deposit Successful

Current Balance: 5000.0

---

Enter your choice: 2

Enter Amount to Withdraw
2000

Withdrawal Successful

Current Balance: 3000.0

---

Enter your choice: 3

Current Balance: 3000.0

---

Enter your choice: 4

Thank you for using Banking Application.

---

## Exception Handling Covered

### Invalid Numeric Input

Example:

Enter Amount to Deposit

abc

Output:

Invalid Input. Please Enter Numeric Value only

### Invalid Deposit Amount

Example:

Enter Amount to Deposit

-100

Output:

Amount must be positive

### Invalid Withdrawal Request

Example:

Current Balance = 1000

Enter Amount to Withdraw

5000

Output:

Invalid withdrawal request

---

## Screenshots

Screenshots demonstrating:

- Main Menu
- Deposit Operation
- Withdrawal Operation
- Balance Inquiry
- Exception Handling
- Invalid Transactions

## Author

Jitesh Agrawal

Java Development Intern
