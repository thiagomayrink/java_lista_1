package com.lista_1.domain.services;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.logging.Level;

public class Tools {
    static Logger logger = Logger.getLogger(Tools.class.getName());
    private Level defaultLogLevel = Level.INFO;
    int number;

    public String findDuplicates(String[] firstArray, String[] secondArray) {
        String result = "";
        String[] largerArray;
        String[] smallerArray;

        if(firstArray.length > secondArray.length){
            largerArray = firstArray;
            smallerArray = secondArray;
        } else {
            largerArray = secondArray;
            smallerArray = firstArray;
        }

        Arrays.sort(largerArray);

        for(int i = 0; i < smallerArray.length; i++) {
            int index = Arrays.binarySearch(largerArray, smallerArray[i]);
            if(index >= 0) result += largerArray[index] + " ";
        }
        
        logger.log(this.defaultLogLevel, result);
        return result;
    }
}
