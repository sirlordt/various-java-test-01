package com.test.java.utilities;

// TODO: Auto-generated Javadoc
/**
 * The Class Utilities.
 */
public class Utilities {

    /**
     * Truncate A in first 2 positions.
     *
     * @param str the str
     * @return the string
     */
    public String truncateAInFirst2Positions(String str) {
    
    	if (str.length() <= 2)
            return str.replaceAll( "A", "" );

        String first2Chars = str.substring( 0, 2 );
        String stringMinusFirst2Chars = str.substring( 2 );

        return first2Chars.replaceAll( "A", "" ) + stringMinusFirst2Chars;
        
    }

    /**
     * Are first and last two characters the same.
     *
     * @param strTest01 the str
     * @return true, if successful
     */
    public boolean areFirstAndLastTwoCharactersTheSame(String strTest01) {

        if ( strTest01.length() <= 1 )
            return false;
        if ( strTest01.length() == 2 )
            return true;

        String first2Chars = strTest01.substring( 0, 2 );

        String last2Chars = strTest01.substring( strTest01.length() - 2 );

        return first2Chars.equals( last2Chars );
    
    }
    
}
