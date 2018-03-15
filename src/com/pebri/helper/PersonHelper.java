package com.pebri.helper;

import java.beans.PropertyEditorSupport;

public class PersonHelper extends PropertyEditorSupport {

	@Override
	public void setAsText(String personName) throws IllegalArgumentException {
		
		if(personName.contains("Mr.") || personName.contains("Ms.")) {
			setValue(personName);
		} else {
			personName = "Ms."+personName;
			setValue(personName);
		}
	}
}
