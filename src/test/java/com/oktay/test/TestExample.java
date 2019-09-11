package com.oktay.test;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.Test;

/*
 *  Created by oktayuyar on 2019-09-11
 */
public class TestExample {

    final static Logger logger = Logger.getLogger(TestExample.class);

    @Test
    public void checkName(){
        logger.info("Test Example");
        Assert.assertTrue( "True : ", true);
    }
}
