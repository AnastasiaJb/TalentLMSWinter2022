package homeWork_;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.digital.homeWork.HelloWorld.surroundWithTag;
import static org.testng.Assert.*;

public class HelloWorldTest {

    SoftAssert softAssert = new SoftAssert();


        @Test
        public void testSurroundWithTag() {
            String tag = "b";
            String word = "Hello, world!";
            String expectedResult = "<" + tag + ">" + word + "</" + tag + ">";
            String expectedResult1 = "<" + word + ">" + tag + "</" + word + ">";
            String actualResult = surroundWithTag(tag, word);
            softAssert.assertEquals(expectedResult, actualResult);
            softAssert.assertEquals(expectedResult1, actualResult);
            softAssert.assertAll();

        }
    }


