package test_$;

import com.digital.test.Calculator;
import com.digital.test.SomeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.*;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void addTwoNumsTest(){
      //  System.out.println(Calculator.add(2, 2 ));
        assertEquals(Calculator.add(2, 2), 4);
        System.out.println("1");
        assertEquals(Calculator.add(2, 2), 3);
        System.out.println("2");
        assertEquals(Calculator.add(2, 3), 5);

    }

    @Test
    public void testSoftAssert() {
        softAssert.assertEquals(Calculator.add(2, 2), 4);
        System.out.println("1");
        softAssert.assertEquals(Calculator.add(2, 2), 3);
        System.out.println("2");
        softAssert.assertEquals(Calculator.add(2, 2), 5);
        softAssert.assertAll();
    }

    @Test
    public void testAssertTrue() {
       assertTrue(SomeClass.isFunny(true));
       assertTrue(false);
    }

    @Test
    public void test123(){
        Object obj = new Object();
        obj = null;
        assertNotNull(obj);
    }
}
