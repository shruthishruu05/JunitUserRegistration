package com.bridgelabz.junituserregistration;
import org.junit.Assert ;
import org.junit.Test;
import com.bridgelabz.junituserregistration.UserValidation;

public class UserValidationTest {
	@Test 
	 public void givenFirstName_WhenProper_ShouldReturnTrue() throws ExceptionUserValidation
	{
	        UserValidation validator=new UserValidation();
	        boolean result=validator.validateName.validate("Shruthi");
	        Assert.assertEquals(true, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenShort_ShouldReturnFalse()throws ExceptionUserValidation 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("sh");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenStartWithSpecialChars_ShouldReturnFalse()throws ExceptionUserValidation 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("#Shruthi");
	         Assert.assertEquals(false, result);
	    }
	    @Test
		public void givenFirstName_WhenNull_ShouldReturnFalse()
	    {
			
			UserValidation userValidator = new UserValidation();
			try
			{
				userValidator.validateName.validate(null);
			}
			catch(ExceptionUserValidation e)
			{
				Assert.assertEquals("ENTER A NAME",e.getMessage());
			}
			
		}
		
	    @Test
		public void givenFirstName_WhenEmpty_ShouldReturnFalse(){
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateName.validate("");
			}
			catch(ExceptionUserValidation e)
			{
				Assert.assertEquals("ENTER A NAME",e.getMessage());
			}
			
		}
	    
	    @Test
	    public void givenFirstName_WhenStartWithSmallLetter_ShouldReturnFalse()throws ExceptionUserValidation 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("shruthi");
	         Assert.assertEquals(false, result);
	    }
	    
	    @Test
	    public void givenFirstName_WhenLongAndStartWithCapital_ShouldReturnTrue()throws ExceptionUserValidation 
	    {
	    	 UserValidation validator=new UserValidation();
	         boolean result=validator.validateName.validate("Shruhcvdjvjvxcv");
	         Assert.assertEquals(true, result);
	    }
	    
	    @Test 
	    public void givenLastName_WhenProper_ShouldReturnTrue()throws ExceptionUserValidation 
	    {
	           UserValidation validator=new UserValidation();
	           boolean result=validator.validateName.validate("Gowda");
	           Assert.assertEquals(true, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenShort_ShouldReturnFalse()throws ExceptionUserValidation 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("gow");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSpecialChars_ShouldReturnFalse()throws ExceptionUserValidation 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("%Shruthi");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenStartWithSmallLetter_ShouldReturnFalse()throws ExceptionUserValidation
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("gowda");
	            Assert.assertEquals(false, result);
	       }
	       
	       @Test
	       public void givenLastName_WhenLongAndStartWithCapital_ShouldReturnTrue()throws ExceptionUserValidation 
	       {
	       	 UserValidation validator=new UserValidation();
	            boolean result=validator.validateName.validate("Gowda");
	            Assert.assertEquals(true, result);
	       }
	       @Test
	   	public void givenLastName_WhenNull_ShouldReturnFalse() {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		try 
	   		{
	   			userValidator.validateName.validate(null);
	   		}
	   		catch(ExceptionUserValidation e)
	   		{
	   			Assert.assertEquals("ENTER A NAME",e.getMessage());
	   		}
	       }
	       @Test
	   	public void givenEmailAddress_WhenProper_ShouldReturnTrue()throws ExceptionUserValidation 
	       {
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmailID.validate("abc-55@gmail.com");
	   		Assert.assertEquals(true, result);
	   	}
	   	@Test
	   	public void givenEmailAddress_WhenNotProper_ShouldReturnFalse()throws ExceptionUserValidation 
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateEmailID.validate("abc%%*@gmail.com");
	   		Assert.assertEquals(false ,result);
	   		
	   	}
	   	@Test
		public void givenEmail_WhenMisplaced_Symbol_ShouldReturnFalse()throws ExceptionUserValidation 
	   	{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abcbl.co@.co");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMisplaced_dot_ShouldReturnFalse()throws ExceptionUserValidation 
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abc.xyz@cg.in.");
			Assert.assertEquals(false, result);
		}
		@Test
		public void givenEmail_WhenMissedMandatoryPart_abc_ShouldReturnFalse() throws ExceptionUserValidation
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("shruthi.xyz@bl.co.in");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmail_WhenMissedMandatoryPart_bl_ShouldReturnFalse()throws ExceptionUserValidation 
		{
			UserValidation validator = new UserValidation();
			boolean result = validator.validateEmailID.validate("abc.xyz@vi.co.in");
			Assert.assertEquals(false, result);
		}

		@Test
		public void givenEmailAddress_WhenEmpty_ShouldReturnFalse(){
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateEmailID.validate("");
			}
			catch(ExceptionUserValidation e)
			{
				Assert.assertEquals("ENTER EMAIL ID",e.getMessage());
			}
			
		}
	   	@Test
	   	public void givenMobileNumber_WhenProper_ShouldReturnTrue()throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("91 9538169967");
	   		Assert.assertEquals(true, result);
	   	}
	   	
	   	@Test
	   	public void givenMobileNumber_WhenNoSpace_ShouldReturnFalse() throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("919538169967");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenMobileNumber_WhenNumberLessThanTenDigits_ShouldReturnFalse()throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validateMobileNumber.validate("91 636473773");
	   		Assert.assertEquals(false ,result);
	   	}
	   	@Test
		public void givenMobileNumber_WhenEmpty_ShouldReturnFalse() throws ExceptionUserValidation{
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validateMobileNumber.validate("");
			}
			catch(ExceptionUserValidation e)
			{
				Assert.assertEquals("ENTER MOBILE NUMBER",e.getMessage());
			}
			
		}
	   	
	   	@Test
	   	public void givenPassword_WhenProper_ShouldReturnTrue() throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("Shruthi@1974");
	   		Assert.assertEquals(true, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenLessThanEightCharcters_ShouldReturnFalse() throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("Shruthim");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenNoUpperCaseCharacter_ShouldReturnFalse()throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("shruthi1919");
	   		Assert.assertEquals(false, result);
	   	}
	   	
	   	@Test
	   	public void givenPassword_WhenNoNumericalNumber_ShouldReturnFalse()throws ExceptionUserValidation
	   	{
	   		
	   		UserValidation userValidator = new UserValidation();
	   		boolean result = userValidator.validatePassword.validate("shruhtim");
	   		Assert.assertEquals(false, result);
	   	}
	   	@Test
		public void givenPassword_WhenEmpty_ShouldReturnFalse() throws ExceptionUserValidation
	   	{
			
			UserValidation userValidator = new UserValidation();
			try 
			{
				userValidator.validatePassword.validate("");
			}
			catch(ExceptionUserValidation e)
			{
				Assert.assertEquals("Please Enter Valid Password. EMPTY Password Entered.",e.getMessage());
			}
			
		}

}