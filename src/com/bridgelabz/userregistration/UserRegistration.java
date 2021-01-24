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
// Password Rule3
		System.out.println("Enter Password Rule3:");
		Scanner scanner6 = new Scanner(System.in);
		String userInputPasswordR3 = scanner6.next();

		Pattern PasswordR3RegExp = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
		Matcher matchResultPasswordR3= PasswordR3RegExp.matcher(userInputPasswordR3);
		boolean PasswordR3Result = matchResultPasswordR3.matches();
		if (PasswordR3Result == true) {
			System.out.println(PasswordR3Result);
		} else {
			System.out.println(PasswordR3Result);
		}
// Password Rule4
				System.out.println("Enter Password Rule4:");
				Scanner scanner7= new Scanner(System.in);
				String userInputPasswordR4 = scanner7.next();

				Pattern PasswordR4RegExp = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!_%*#?&]{1})[a-zA-Z0-9@$!_%*#?&]{8,}$");
				Matcher matchResultPasswordR4= PasswordR4RegExp.matcher(userInputPasswordR4);
				boolean PasswordR4Result = matchResultPasswordR4.matches();
				if (PasswordR4Result == true) {
					System.out.println(PasswordR4Result);
				} else {
					System.out.println(PasswordR4Result);
				}

//Email Sample
				System.out.println("Welcome In Email Smaples:");
				Scanner scanner8 = new Scanner(System.in);
				String userInputEmailSamples = scanner8.next();

				Pattern pattern = Pattern
						.compile("^([a-zA-a0-9\\.\\-\\+]+)@([a-zA-Z0-9\\.]{1,5})([a-zA-Z\\.]+){1,3}([a-zA-Z]{1,3})$");
				Matcher match1 = pattern.matcher("abc@yahoo.com");
				Matcher match2 = pattern.matcher("abc-100@yahoo.com");
				Matcher match3 = pattern.matcher("abc.100@yahoo.com");
				Matcher match4 = pattern.matcher("abc111@abc.com");
				Matcher match5 = pattern.matcher("abc-100@abc.net");
				Matcher match6 = pattern.matcher("abc.100@abc.com.au");
				Matcher match7 = pattern.matcher("abc@1.com");
				Matcher match8 = pattern.matcher("abc@gmail.com.com");
				Matcher match9 = pattern.matcher("abc+100@gmail.com");

				boolean patternValidity1 = match1.matches();
				boolean patternValidity2 = match2.matches();
				boolean patternValidity3 = match3.matches();
				boolean patternValidity4 = match4.matches();
				boolean patternValidity5 = match5.matches();
				boolean patternValidity6 = match6.matches();
				boolean patternValidity7 = match7.matches();
				boolean patternValidity8 = match8.matches();
				boolean patternValidity9 = match9.matches();

				System.out.println(patternValidity1);
				System.out.println(patternValidity2);
				System.out.println(patternValidity3);
				System.out.println(patternValidity4);
				System.out.println(patternValidity5);
				System.out.println(patternValidity6);
				System.out.println(patternValidity7);
				System.out.println(patternValidity8);
				System.out.println(patternValidity9);
				boolean patternValidity;
			}

		}

