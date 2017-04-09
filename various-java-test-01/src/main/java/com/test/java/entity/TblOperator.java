package com.test.java.entity;

import java.io.Serializable;

public class TblOperator implements Serializable {

	private static final long serialVersionUID = 6300603932178593467L;

	protected String strId;
	protected String strName;
	protected String strPassword;
	
	public String getId() {
	
		return strId;
	
	}
	
	public void setId( String strId ) {
	
		this.strId = strId;
		
	}
	
	public String getName() {
	
		return strName;
		
	}
	
	public void setName( String strName ) {
	
		this.strName = strName;
		
	}
	
	public String getPassword() {
	
		return strPassword;
		
	}
	
	public void setPassword( String strPassword ) {
	
		this.strPassword = strPassword;
		
	}
	
}
