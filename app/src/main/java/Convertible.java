package edu.handong.csee.java.hw2.converters;

/**
 * this is interface aovut convertible that function about set the value and get the converted value finally convert
 */
public interface Convertible {

    /**
     * unction that setting the value
     * @param fromValue
     */
    public void setFromValue(double fromValue);

    /**
     * function that getting the converted value
     * @return
     */
    public double getConvertedValue();

    /**
     * function that convert the value
     */
    public void convert();

}