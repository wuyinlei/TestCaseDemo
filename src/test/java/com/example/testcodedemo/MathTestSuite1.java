package com.example.testcodedemo;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by wuyin on 2016/4/26.
 */
/**
 * 第二种实现方式是使用注解方式
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AdderTest.class,
        DiverTest.class,
})
//此时MathTestSuite1成了一个空类，测试类被添加到注解中了，运行结果是一样的
public class MathTestSuite1 {

}
