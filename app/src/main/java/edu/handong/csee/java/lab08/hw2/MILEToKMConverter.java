package edu.handong.csee.java.lab08.hw2;

/**
 * this is converter that changes mile to kilometer
 */

public class MILEToKMConverter implements Convertible {

    private double mile;
    private double result;

    /**
     * setFromValue is to set the value to mile
     */
    @Override
    public void setFromValue(double fromValue) {

        mile = fromValue;
    }

    /**
     * getConvertedValue is to return the result
     */
    @Override
    public double getConvertedValue() {

        return result;
    }

    /**
     * convert is to convert the mile to kilometer
     */
    @Override
    public void convert() {
        
        result = mile/1.6;
    }
    
}
