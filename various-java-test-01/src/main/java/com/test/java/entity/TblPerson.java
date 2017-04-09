package com.test.java.entity;

import java.io.Serializable;

public class TblPerson implements Serializable {

	private static final long serialVersionUID = 4578033842438679768L;

	protected String strId;
	protected String strFirstName;
	protected String strLastName;
	
	public String getId() {
	
		return strId;
	
	}
	
	public void setId( String strId ) {
	
		this.strId = strId;
	
	}
	
	public String getFirstName() {
	
		return strFirstName;
	
	}
	
	public void setFirstName( String strFirstName ) {
	
		this.strFirstName = strFirstName;
	
	}
	
	public String getLastName() {
	
		return strLastName;
	
	}
	
	public void setLastName( String strLastName ) {
	
		this.strLastName = strLastName;
	
	}
	
}
