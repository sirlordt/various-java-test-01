package com.test.java.blocking.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

	public static void main(String[] args) {
        
		//Creating BlockingQueue of size 10
        BlockingQueue<CMessage> queue = new ArrayBlockingQueue<CMessage>( 10 );
        
        CProducer producer = new CProducer( queue );
        CConsumer consumer = new CConsumer( queue );
        
        //starting producer to produce messages in queue
        new Thread( producer ).start();
        //starting consumer to consume messages from queue
        new Thread( consumer ).start();
        
        System.out.println( "Producer and Consumer has been started" );
		
    }
	
}
