package com.lista_1.domain.services;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Calculate {
    static Logger logger = Logger.getLogger(Calculate.class.getName());
    private Level defaultLogLevel = Level.INFO;
    int number;

    public String isEven(int number) {
        String result;
        final int remainder = number % 2;

        if (remainder == 0) result = String.format("%d é par", number);
        else result = String.format("%d é ímpar", number);
        
        logger.log(this.defaultLogLevel, result);
        return result;
    }

    public String multiplicationTable(int number) {
        String result = "";
        result += "Tabela de multiplicação por: " + number + "\n";
        for(int count = 0; count <= 10; count++) {
            result += number + " x " + count + " = " + number*count + "\n";
        }
        
        logger.log(this.defaultLogLevel, result);
        return result;
    }

    public String fibonacci(int size) {
        int n1 = 0;
        int n2 = 1;
        String result = "";
        for (int count = size; count > 0; count--) {
            result += (n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        
        logger.log(this.defaultLogLevel, result);
        return result;
    }

    public String numbersPiramid(int size) {
        String result = "";
        for(int count = 0; count <= size; count++) {
            for(int digitsInLine = 1; digitsInLine <= count; digitsInLine++){
                result += Integer.toString(count);
            }
            result += "\n";
        }
        
        logger.log(this.defaultLogLevel, result);
        return result;
    }

    public int getNumber() {
		return this.number;
	}

    public void setNumber(int number) {
		this.number = number;
    }
}
