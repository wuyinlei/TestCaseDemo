package com.example.testcodedemo;

import junit.framework.TestCase;

/**
 * Created by wuyin on 2016/4/26.
 */
public class DiverTest extends TestCase {
    Divide mDivide;

    @Override
    protected void setUp() throws Exception {
        mDivide = new DivideImpl();
    }

    @Override
    protected void tearDown() throws Exception {
        mDivide = null;
    }

    public void testDivide(){
        assertEquals(1.0f,mDivide.divide(1.1f,1.1f));
    }
}
