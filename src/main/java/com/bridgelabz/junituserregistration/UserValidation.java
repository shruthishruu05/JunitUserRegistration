package com.bridgelabz.junituserregistration;

public class UserValidation {
	public boolean validateName(String name) throws ExceptionUserValidation {

		try {
			if (name.length() == 0) {
				throw new ExceptionUserValidation("Enter Valid Name, the name entered is empty!!.");
			}
			String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
			return name.matches(nameRegex);
			
		} 
		catch (NullPointerException e) {
			throw new ExceptionUserValidation("Enter Valid Name, the name entered is null!!.");
		}
	}
	

	public boolean validateEmail(String email) throws ExceptionUserValidation {

		try {
			if (email.length() == 0) {
				throw new ExceptionUserValidation("Please Enter Valid Email Address as it is empty");
			}
			String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			return email.matches(emailRegex);
		} 
		catch (NullPointerException e) {
			throw new ExceptionUserValidation("Please Enter Valid Email Address as it is null");

		}
	}

	public boolean validateMobileNumber(String mobileNumber) throws ExceptionUserValidation {

		try {
			if (mobileNumber.length() == 0) {
				throw new ExceptionUserValidation("Please Enter Valid Mobile Number as it is empty");			
			}
			String mobileNumberRegex = "^[0-9]{1,2}\\s{1}[0-9]{10}$";
			return mobileNumber.matches(mobileNumberRegex);
		} 
		catch (NullPointerException e) {
			throw new ExceptionUserValidation("Please Enter Valid Mobile Number as it is null");
		}
	}

	public boolean validatePassword(String password) throws ExceptionUserValidation {

		try {
			if (password.length() == 0) {
				throw new ExceptionUserValidation("Please Enter Valid Password ,the password entered is empty ");
			}
			String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
			return password.matches(passwordRegex);

		} catch (NullPointerException e) {
			throw new ExceptionUserValidation("Please Enter Valid Password, the password entered is null.");
		}	
	}
	

}
