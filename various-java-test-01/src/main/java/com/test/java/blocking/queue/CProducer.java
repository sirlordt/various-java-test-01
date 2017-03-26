package com.test.java.blocking.queue;

import java.util.concurrent.BlockingQueue;

public class CProducer implements Runnable {

     private BlockingQueue<CMessage> queue;
    
    public CProducer( BlockingQueue<CMessage> q ){
        
    	this.queue = q;
    	
    }
    
    @Override
    public void run() {
        
    	//produce messages
        for( int i = 0; i < 100; i++ ){
        
        	CMessage msg = new CMessage( "" + i );
            
        	try {
        		
                Thread.sleep( i );
                
                queue.put( msg );
                
                System.out.println( "Produced " + msg.getMsg() );
                
            } 
        	catch ( InterruptedException e ) {
                
        		e.printStackTrace();
        		
            }
        	
        }
        
        //adding exit message
        CMessage msg = new CMessage( "exit" );
        
        try {
        
        	queue.put( msg );
        } 
        catch ( InterruptedException e ) {
        
        	e.printStackTrace();
        
        }
        
    }
    
}
