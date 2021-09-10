package com.bridgelabz.junituserregistration;
import org.junit.Assert ;
import org.junit.Test;
public class UserValidationTest 
{
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("John");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenFirstName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("john");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenFirstName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Jo");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateName("Matt");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenLastName_WhenFirstLetterIsSmall_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("matt");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenLastName_WhenLesserThanThreeCharacters_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateName("Ma");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEmail("John@gmail.com");
		Assert.assertTrue(isValid);
		
	}
	
	@Test
	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateEmail("jo@3$%%^@mail.com");
		Assert.assertFalse(isNotValid);
		
	}
	
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber("91 9110884694");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("91854669743");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber("91 4654");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validatePassword("John@1223");
		Assert.assertTrue(isValid);
	}
	
	@Test
	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("ssdf");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("asdad#f");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("aa$##dfw");
		Assert.assertFalse(isNotValid);
	}
	
	@Test
	public void givenPassword_WhenMoreThanOneSpecialCharacter_ShouldReturnFalse() {
		
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword("asj@#$#d");
		Assert.assertFalse(isNotValid);
	}


}