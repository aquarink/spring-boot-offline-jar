package com.pebri.helper;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
 
public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {
 
    @Override
    public void initialize(IsValidHobby isValidHobby) { 
    	
    }
 
    @Override
    public boolean isValid(String personHobby, ConstraintValidatorContext ctx) {
        
    	if(personHobby == null) {
    		
            return false;
        }
        
    	if (personHobby.matches("Music|Football|Cricket|Hockey")) {
    		
    		return true;
    	} else {
    		
    		return false;
    	}
    }
 
}