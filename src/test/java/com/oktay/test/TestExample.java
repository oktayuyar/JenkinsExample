package com.oktay.test;

import com.oktay.main.Math;
import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;

/*
 *  Created by oktayuyar on 2019-09-11
 */
public class TestExample {

    final static Logger logger = Logger.getLogger(TestExample.class);

    @Test
    public void checkAdditionMethod(){
        int result = Math.addition(5,6);
        Assert.assertEquals( "Toplama fonksiyonu sonucu doğru bulmadı!", result,11);
    }

    @Test
    public void checksubtractionMethod(){
        int result = Math.subtraction(10,5);
        Assert.assertEquals( "Çıkarma fonksiyonu sonucu doğru bulmadı!", result,5);
    }
}
