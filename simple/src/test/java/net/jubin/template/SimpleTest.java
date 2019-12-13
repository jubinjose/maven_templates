package net.jubin.template;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
 
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class SimpleTest {

    private static SimpleMath simpleMath;

    @BeforeClass
    public static void init() {
        simpleMath = new SimpleMath();
    }
 
    @Before
    public void beforeEachTest() {
        System.out.println("This is executed before each Test");
        simpleMath.setMyVal(2);
    }
 
    @After
    public void afterEachTest() {
        System.out.println("This is exceuted after each Test");
    }

    @Test
    public void square_works_ok() {
        simpleMath.square();
        assertTrue(simpleMath.getMyVal() == 4);
    }

    @Test
    public void triple_works_ok() {
        simpleMath.triple();
        assertTrue(simpleMath.getMyVal() == 8);
    }
}