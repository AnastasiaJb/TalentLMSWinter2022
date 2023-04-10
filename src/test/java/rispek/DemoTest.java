package rispek;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTest {

    public int sum(int a, int b) {
        return a+b;
    }

    @Test (dataProvider = "numbers")
    public void testSum(int a, int b, int result){
        Assert.assertEquals(sum(a, b), result);
//        Assert.assertEquals(sum(0, 10), 10);
//        Assert.assertEquals(sum(-10, 20), 10);
    }

    @DataProvider
    public static Object [][] numbers () {
        return new Object[][] {
                {10, 20, 30},
                {0, 10, 10},
                {-10, 20, 10}  };
    }


    @Test (enabled = false)
    public void test2() {
        System.out.println("Пропуск теста");
    }

    @Test (dependsOnMethods = "testSum")
        public void test3() {
            System.out.println("зависимость от метода testSum");
        }

    @Test (timeOut = 1000)
    public void test4() {
        System.out.println("за определенное время должен пройти 1000 миллисекунд - 10 сек");
    }





//    @Test
//    public  void  testSum2 () {
//        Assert.assertEquals(sum(1, 1), 2);
//        Assert.assertEquals(sum(10, 10), 2);
//        System.out.println("#########");
//        Assert.assertEquals(sum(2, 2), 4);

    }

