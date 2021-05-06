package edu.handong.csee.java.hw2.converters;

/**
 * this is converter that changes kilometer to mile
 */

public class KMToMILEConverter implements Convertible {

    private double kilometer;
    private double result;

    /**
     * set the value to kilometer
     */
    @Override
    public void setFromValue(double fromValue) {
        
        kilometer = fromValue;
    }

    /**
     * return the result 
     */
    @Override
    public double getConvertedValue() {

        return result;
    }

    /**
     * convert the kilometer to mile
     */
    @Override
    public void convert() {
        
        result = kilometer/1.6;
    }
    
}
