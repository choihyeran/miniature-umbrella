package edu.handong.csee.java.hw2;

import edu.handong.csee.java.hw2.converters.*;

/**
 * this is allconverter that changes kilometer to meter and mile, ton to kilogram and gram
 */
public class AllConverter extends IntegratedConverter {

    private double fromValue;
    private String originalMeasure;

    /**
     * setFromValue is to set the fromvalue
     * @param fromValue
     * @return
     */
    public AllConverter setFromValue(double fromValue) {

        this.fromValue = fromValue;
        return this;
    }

    /**
     * setOringinalMeasure is to set the originalmeasuser
     * @param originalMeasure
     * @return
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        
        this.originalMeasure = originalMeasure;
        return this;
    }


    /**
     * convert and printout the results if other strings are inputed then prinout the warning string
     */
    public void convertAndPrintOut() {

        if(this.originalMeasure.equals("KM")) {
            // KM to M and KM to MILE

            KMToMConverter kmToM = new KMToMConverter();
            kmToM.setFromValue(fromValue);
            kmToM.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + kmToM.getConvertedValue() + " " + "M");

            KMToMILEConverter kmToMILE = new KMToMILEConverter();
            kmToMILE.setFromValue(fromValue);
            kmToMILE.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + kmToMILE.getConvertedValue() + " " + "MILE");
        }
        else if(this.originalMeasure.equals("TON")) {
            // TON to KG and TON to G

            TONToKGConverter tonToKG = new TONToKGConverter();
            tonToKG.setFromValue(fromValue);
            tonToKG.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + tonToKG.getConvertedValue() + " " + "KG");

            TONToGConverter tonToG = new TONToGConverter();
            tonToG.setFromValue(fromValue);
            tonToG.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + tonToG.getConvertedValue() + " " + "G");

        }
        else {
            // if another string inputed at the originalMeasure system.out.println this string

            System.out.println("AllConverter cannot support the measure!");
        }
    }
}