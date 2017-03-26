package com.test.java.utilities;

import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class UtilitiesTest.
 */
public class UtilitiesTest {

	/**
	 * Test truncate A in first 2 positions 01.
	 */
	@Test
	public void testTruncateAInFirst2Positions_01() {
		
		Utilities utilities = new Utilities();
		
		assertEquals( "CD", utilities.truncateAInFirst2Positions( "AACD" ) );

		//fail("Not yet implemented");
		
	}

	/**
	 * Test truncate A in first 2 positions 02.
	 */
	@Test
	public void testTruncateAInFirst2Positions_02() {
		
		Utilities utilities = new Utilities();
		
		assertEquals( "CD", utilities.truncateAInFirst2Positions( "ACD" ) );
		
		//fail("Not yet implemented");
		
	}
	
	/**
	 * Test are first and last two characters the same.
	 */
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame() {
		
		//fail("Not yet implemented");
		
	}

}
