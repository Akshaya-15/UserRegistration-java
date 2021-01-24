package com.bridgelabz.userregistration;
import java.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {

	@Test 
	public static boolean firstNameValidation(String userInputFirstName)
	{
		Pattern firstNameRegExp=Pattern.compile("(^[A-Z]{1})[a-z]{2,}");
		Matcher matchResult=firstNameRegExp.matcher(userInputFirstName);
		boolean firstNameResult=matchResult.matches();
		return firstNameResult;
	}
	@Test
	public static boolean LastNameValidation(String userInputLastName)
	{
		Pattern lastNameRegExp=Pattern.compile("^[A-Z]{1}[a-z]{2,}(\\s{1}){0,}[A-Z]{1}[a-z]{2,}$");
		Matcher matchResult=lastNameRegExp.matcher(userInputLastName);
		boolean lastNameResult=matchResult.matches();
		return lastNameResult;
	}
	@Test
	public static boolean EmailValidation(String userInputEmail)
	{
		Pattern EmailRegExp=Pattern.compile("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})*$");
		Matcher matchResult=EmailRegExp.matcher(userInputEmail);
		boolean EmailResult=matchResult.matches();
		return EmailResult;
	}
	
	@Test
	public static boolean PhonenumberValidation(String userInputPhonenum)
	{
		Pattern PhonenumRegExp=Pattern.compile("^[91+][[:space:]][0-9]$");
		Matcher matchResult=PhonenumRegExp.matcher(userInputPhonenum);
		boolean PhonenumResult=matchResult.matches();
		return PhonenumResult;
	}
	@Test
	public static boolean PasswordR1Validation(String userInputPasswordR1)
	{
		Pattern PasswordR1RegExp=Pattern.compile("^[a-zA-Z0-9]{8,}$");
		Matcher matchResult=PasswordR1RegExp.matcher(userInputPasswordR1);
		boolean PasswordR1Result=matchResult.matches();
		return PasswordR1Result;
	}
	public static boolean PasswordR2Validation(String userInputPasswordR2)
	{
		Pattern PasswordR2RegExp=Pattern.compile("^(?=.*[A-Z])[a-zA-Z0-9]{8,}$A");
		Matcher matchResult=PasswordR2RegExp.matcher(userInputPasswordR2);
		boolean PasswordR2Result=matchResult.matches();
		return PasswordR2Result;
	}
	public static boolean PasswordR3Validation(String userInputPasswordR3)
	{
		Pattern PasswordR3RegExp=Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
		Matcher matchResult=PasswordR3RegExp.matcher(userInputPasswordR3);
		boolean PasswordR3Result=matchResult.matches();
		return PasswordR3Result;
	}
	public static boolean PasswordR4Validation(String userInputPasswordR4)
	{
		Pattern PasswordR4RegExp=Pattern.compile("^(?=*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
		Matcher matchResult=PasswordR4RegExp.matcher(userInputPasswordR4);
		boolean PasswordR4Result=matchResult.matches();
		return PasswordR4Result;
	}
	public static boolean EmailSamplesValidation(String userInputEmailSamples)
	{
		Pattern EmailSamplesRegExp=Pattern.compile("^^([a-zA-a0-9\\\\.\\\\-\\\\+]+)@([a-zA-Z0-9\\\\.]{1,5})([a-zA-Z\\\\.]+){1,3}([a-zA-Z]{1,3})$([a-zA-a0-9\\\\.\\\\-\\\\+]+)@([a-zA-Z0-9\\\\.]{1,5})([a-zA-Z\\\\.]+){1,3}([a-zA-Z]{1,3})$");
		Matcher matchResult=EmailSamplesRegExp.matcher(userInputEmailSamples);
		boolean EmailSamplesResult=matchResult.matches();
		return EmailSamplesResult;
	}
}

	



