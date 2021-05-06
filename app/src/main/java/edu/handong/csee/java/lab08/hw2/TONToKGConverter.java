package edu.handong.csee.java.lab08.hw2;

/**
 * this is converter that changes ton to kilogram
 */

public class TONToKGConverter implements Convertible {

    private double ton;
    private double result;

    /**
     * set the value to ton
     */
    @Override
    public void setFromValue(double fromValue) {

        ton = fromValue;
    }

    /**
     * return the result
     */
    @Override
    public double getConvertedValue() {

        return result;
    }

    /**
     * convert the ton to kilogram
     */
    @Override
    public void convert() {
        
        result = ton*1000;
    }
    
}
