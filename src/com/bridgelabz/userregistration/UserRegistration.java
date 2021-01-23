package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
	
// FirstName 
	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		System.out.println("Enter First Name:");
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.next();

		Pattern firstNameRegExp = Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
		Matcher matchResult = firstNameRegExp.matcher(userInput);
		boolean firstNameResult = matchResult.matches();
		if (firstNameResult == true) {
			System.out.println(firstNameResult);
		} else {
			System.out.println(firstNameResult);
		}

		// Last Name
		System.out.println("Enter Last Name:");
		Scanner scanner1 = new Scanner(System.in);
		String userInputLastName = scanner1.next();

		Pattern lastNameRegExp = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
		Matcher matchResultLastName = lastNameRegExp.matcher(userInputLastName);
		boolean lastNameResult = matchResultLastName.matches();
		if (lastNameResult == true) {
			System.out.println(lastNameResult);
		} else {
			System.out.println(lastNameResult);
		}
// Email 
		System.out.println("Enter Email:");
		Scanner scanner2 = new Scanner(System.in);
		String userInputemail = scanner2.next();

		Pattern emailRegExp = Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$");
		Matcher matchResultemail = emailRegExp.matcher(userInputemail);
		boolean emailResult = matchResultemail.matches();
		if (emailResult == true) {
			System.out.println(emailResult);
		} else {
			System.out.println(emailResult);
		}

// PhoneNumber
		System.out.println("Enter PhoneNumber:");
		Scanner scanner3 = new Scanner(System.in);
		String userInputPhonenum = scanner3.next();

		Pattern PhonenumRegExp = Pattern.compile("^[91+][[:space:]][0-9]$");
		Matcher matchResultPhonenum = PhonenumRegExp.matcher(userInputPhonenum);
		boolean PhonenumResult = matchResultemail.matches();
		if (PhonenumResult == true) {
			System.out.println(PhonenumResult);
		} else {
			System.out.println(PhonenumResult);
		}
// Password Rule1
		System.out.println("Enter Password Rule1:");
		Scanner scanner4 = new Scanner(System.in);
		String userInputPasswordR1 = scanner4.next();

		Pattern PasswordR1RegExp = Pattern.compile("^[a-zA-Z0-9]{8,}$");
		Matcher matchResultPasswordR1 = PasswordR1RegExp.matcher(userInputPasswordR1);
		boolean PasswordR1Result = matchResultPasswordR1.matches();
		if (PasswordR1Result == true) {
			System.out.println(PasswordR1Result);
		} else {
			System.out.println(PasswordR1Result);
		}
// Password Rule2
		System.out.println("Enter Password Rule2:");
		Scanner scanner5 = new Scanner(System.in);
		String userInputPasswordR2 = scanner5.next();

		Pattern PasswordR2RegExp = Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$");
		Matcher matchResultPasswordR2 = PasswordR2RegExp.matcher(userInputPasswordR2);
		boolean PasswordR2Result = matchResultPasswordR2.matches();
		if (PasswordR2Result == true) {
			System.out.println(PasswordR2Result);
		} else {
			System.out.println(PasswordR2Result);
		}
	}
}
