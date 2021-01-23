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
		Pattern emailRegExp=Pattern.compile("^[a-zA-Z]{3}\\.[a-zA-Z]{1}@[a-zA-Z]{2}\\.([a-zA-Z]{2}\\.[a-zA-Z]{1,}$");
		Matcher matchResult=emailRegExp.matcher(userInputEmail);
		boolean lastNameResult=matchResult.matches();
		return lastNameResult;
	

}


	



