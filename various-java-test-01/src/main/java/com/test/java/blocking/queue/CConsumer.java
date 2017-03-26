package com.test.java.blocking.queue;

import java.util.concurrent.BlockingQueue;

public class CConsumer implements Runnable {

    private BlockingQueue<CMessage> queue;
    
    public CConsumer( BlockingQueue<CMessage> q ){
    
    	this.queue = q;
    	
    }

    @Override
    public void run() {
        
    	try{
    		
            CMessage msg;
            
            //consuming messages until exit message is received
            while ( ( msg = queue.take() ) != null ) { //.getMsg() != "exit"
            
            	if ( msg.getMsg().equalsIgnoreCase( "exit" ) ) {
            		
            		break;
            		
            	}
            	
            	System.out.println( "Consumed " + msg.getMsg() );
            
            }
            
        }
    	catch( InterruptedException e ) {
            
    		e.printStackTrace();
    		
        }
    	
    }
    
}
