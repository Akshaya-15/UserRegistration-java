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
}


	



