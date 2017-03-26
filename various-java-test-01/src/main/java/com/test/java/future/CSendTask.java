package com.test.java.future;

import java.util.Random;
import java.util.concurrent.Callable;

import com.test.java.blocking.queue.CMessage;

public class CSendTask implements Callable<Integer> {
	
	Object subscriber = null;

	CMessage messageToSend = null;
	
	int intWorkingFor = 0;
	
	public CSendTask( Object subscriber, CMessage messageToSend ) {
		
		this.subscriber = subscriber;
		
		this.messageToSend = messageToSend;
		
		Random randomGenerator = new Random();
		
		intWorkingFor = randomGenerator.nextInt( 30 );
		
	}
	
	@Override
	public Integer call() throws Exception {

		System.out.println( "***************************************************" );
		System.out.println( "* Working for " + Integer.toString( intWorkingFor ) + " seconds" );
		System.out.println( "* " + messageToSend.getMsg() );
		System.out.println( "***************************************************" );
	
		int intCount = 0;
		
		while ( intCount < intWorkingFor ) {

			System.out.println( intCount );
			Thread.sleep( 1000 );

			intCount += 1;
			
		};
		
		return 1;
		
	}

}
