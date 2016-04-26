package com.example.testcodedemo;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by wuyin on 2016/4/26.
 */
public class MathTestSuite {

    public static Test suite(){
        //TestSuite就是用来执行多个测试类的集合，使用Junit 4有两种实现方式
        //第一种是通过JUnit4TsetAdapter包装测试类，并且将JUnit4Adapter
        //对象添加到TestSuite中
        TestSuite suite = new TestSuite("com.yinlei.demo");
        suite.addTest(new JUnit4TestAdapter(AdderTest.class));
        suite.addTest(new JUnit4TestAdapter(DiverTest.class));

        return suite;
    }

}
