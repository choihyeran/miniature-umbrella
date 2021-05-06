package edu.handong.csee.java.hw2.converters;

/**
 * this is converter that changes ton to gram
 */

public class TONToGConverter implements Convertible {

    private double ton;
    private double result;

    /**
     * setFromValue is to set the value to ton
     */
    @Override
    public void setFromValue(double fromValue) {
        
        ton = fromValue;
    }

    /**
     * getConvertedValue is to return the result
     */
    @Override
    public double getConvertedValue() {

        return result;
    }

    /**
     * convert the ton to gram
     */
    @Override
    public void convert() {

        result = ton*1000000;
    }
    
}
