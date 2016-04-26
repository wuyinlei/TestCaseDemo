package com.example.testcodedemo;

import junit.framework.TestCase;

/**
 * Created by wuyin on 2016/4/26.
 */
public class AdderTest extends TestCase {

    //要测试的接口对象
    Adder mAdder;

    /**
     * 测试前的初始化工作
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        mAdder = new AdderImpl();
    }

    /**
     * 测试完成后垃圾回收工作
     * @throws Exception
     */
    @Override
    protected void tearDown() throws Exception {
        mAdder = null;
    }

    /**
     * 测试函数必须是以test开头的，权限修饰符是public的
     */
    public void testAdd(){

        /**
         * assertEquals的作用是判断两个值或者对象是否相等，该函数含有两个参数
         * 参数1是预期的值，参数2是计算得到的值，通过判断两个值是否相等得出的结
         * 果，如果相等那么测试通过，否则测试失败
         */
        assertEquals(0,mAdder.add(0,0));
        assertEquals(1,mAdder.add(0,1));
        assertEquals(3,mAdder.add(2,1));
        assertEquals(0,mAdder.add(-1,1));
        assertEquals(Integer.MAX_VALUE + 1,mAdder.add(1,Integer.MAX_VALUE));


        /**
         * assertFalse和assertTrue 顾名思义就是分别验证真假，他只有一个boolean类型的参数，当参数和
         * assert后面的true或者false则表示通过，否则表示失败，
         */
        assertFalse(false);
        assertTrue(true);

        /**
         * 和上面的两个雷士，这assertNull和assertNotNUll也只有一个参数，不过这个参数是Object类型
         * 它用于对对象判空或者非空，例如，当assertNull（null），则测试失败，因为值为null，
         * 如果是assertNull（"hello"），那么测试通过
         */
        assertNull(null);
        assertNotNull(null);

        /**
         * assertSame与assertNotSame
         * assertSame用于判断两个对象是否是同一个对象，assertNotSame则是判断两个对象不是同一个
         * 对象，和assertEquals不同的是，assertSame强调的是两个对象为同一个对象，二assertEquals
         * 只需要两个对象相等即可，即调用equals函数时候返回true
         */
        assertSame(null,null);
        assertNotSame(null,null,null);

        /**
         * failNotEquals在api16以上使用，该函数有三个参数，第一个参数为失败的时候的提示信息
         * 第二个参数是期望值，第三个为实际值，当连个对象不相等的时候抛出参数1的错误信息，否则
         * 测试通过
         */
       // failNotEquals(null,null,null);

        /**
         * 下面这两个方法也是在API16以上使用
         *failNotSame和failNotEquals参数一致，不同的是failNotSame两个对象不是同一个对象
         * 时间抛出参数1的错误信息，否则通过测试
         */

        //failNotSame("",null,null);
        //failSame("");

        /**
         * fail(Sring)和fail（）
         * fail(String)直接抛出当前测试用例参数1中的错误信息，而fail则会给出默认的错误信息
         */
        fail("hello");
        
    }
}
