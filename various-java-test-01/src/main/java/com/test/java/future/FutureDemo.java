package com.test.java.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.test.java.blocking.queue.CMessage;

public class FutureDemo {
	
	private static final ExecutorService threadpool = Executors.newFixedThreadPool( 1 );

    public static void main(String args[]) throws InterruptedException, ExecutionException {


    	for ( int intIndex = 0; intIndex < 5; intIndex ++ ) {

        	CMessage message = new CMessage( "Message hello " + Integer.toString( intIndex ) );
        	Object subscriber = null;
    		
    		CSendTask sendTask = new CSendTask( subscriber, message );

    		System.out.println( "---------------------------------------------------" );
    		System.out.println( "Submitting Task " + Integer.toString( intIndex ) + "..." );

    		Future<Integer> future = threadpool.submit( sendTask );

    		System.out.println( "Task " + Integer.toString( intIndex ) + " is submitted" );
    		System.out.println( "---------------------------------------------------" );

    		Integer result = null; //future.get();

    		try {

    			result = future.get( 15, TimeUnit.SECONDS ); //Wait for 15 seconds only, if timeout cancel the task

    		}
    		catch ( Exception ex ) {

    			future.cancel( true ); //Timeout force to stop the task 
    			//ex.printStackTrace();

    		}

    		System.out.println( "---------------------------------------------------" );
            System.out.println( "The result for task " + Integer.toString( intIndex ) + " is " + result );
    		System.out.println( "---------------------------------------------------" );
    		
    	}
    	
    	/*
        while ( future.isDone() == false ) {
        
        	System.out.println( "Task is not completed yet..." );
            Thread.sleep( 1 ); //sleep for 1 millisecond before checking again
            
        }
        **/
        
        //System.out.println( "Task is completed, let's check result" );
        //Integer result = future.get();
        //System.out.println( "The result is: " + result );

        threadpool.shutdown();
        
    }

}
