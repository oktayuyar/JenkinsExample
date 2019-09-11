package com.oktay.main;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/*
 *  Created by oktayuyar on 2019-09-11
 */
public class Math {

    final static Logger logger = Logger.getLogger(Math.class);


    public static int addition(int number1, int number2) {
        int result = number1 + number2;
        logger.info(number1 + " + " + number2 + " = " + result);
        return  result;
    }

    public static int subtraction(int number1, int number2) {
        int result = number1 - number2;
        logger.info(number1 + " - " + number2 + " = " + result);
        return result;
    }

}
