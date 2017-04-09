package com.test.java.script.engine;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.test.java.entity.TblOperator;
import com.test.java.entity.TblPerson;

public class App {

	public static void main( String[] args ) {
		
		TblPerson tblPerson = new TblPerson();
		tblPerson.setId( "18" );
		tblPerson.setFirstName( "tomas" );
		tblPerson.setLastName( "moreno" );

		TblOperator tblOperator = new TblOperator();
		tblOperator.setId( "118" );
		tblOperator.setName( "test01" );
		tblOperator.setPassword( "test01" );
		
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine scriptEngine = scriptEngineManager.getEngineByName( "javascript" );		
        
		String strJavaScriptSingle = "function evalRow( rowEntityPerson ) { return rowEntityPerson.getFirstName() == 'tomas' && rowEntityPerson.getId() == '18'; }";		
		String strJavaScriptMulti = "function evalRow( rowEntityPerson, rowEntityOperator ) { return rowEntityPerson.getFirstName() == 'tomas' && rowEntityOperator.getName() == 'test01'; }";		
		
		try {

			scriptEngine.eval( strJavaScriptSingle );

			Invocable invocable = (Invocable) scriptEngine;
			
			Boolean bResult = (Boolean) invocable.invokeFunction( "evalRow", tblPerson );
			
		    System.out.println( "Single: " + bResult );

			scriptEngine.eval( strJavaScriptMulti );
			
			bResult = (Boolean) invocable.invokeFunction( "evalRow", tblPerson, tblOperator );

		    System.out.println( "Multi: " + bResult );
			    
		}
		catch ( Exception ex ) {
			
			ex.printStackTrace();
			
		}
		
	}

}
