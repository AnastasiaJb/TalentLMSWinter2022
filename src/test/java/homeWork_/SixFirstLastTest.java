package homeWork_;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.digital.homeWork.SixFirstLast.firstLast6;

public class SixFirstLastTest {


    SoftAssert softAssert = new SoftAssert();


    @Test
    public void testFirstLast6() {
        int[] nums1 = {1, 2, 6};
        softAssert.assertTrue(firstLast6(nums1));

        int[] nums2 = {2, 4, 6, 8};
        softAssert.assertTrue(firstLast6(nums2));

        int[] nums3 = {6, 4, 6, 6};
        softAssert.assertFalse(firstLast6(nums3));

        softAssert.assertAll();


    }
}
