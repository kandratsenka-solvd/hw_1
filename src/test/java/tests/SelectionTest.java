package tests;

import org.testng.annotations.Test;
import utils.SelectionSortUtil;

import java.util.Arrays;

public class SelectionTest {

    @Test
    public static void testSelectionAlgorithm() {
        int[] intArray = {3, -58, 100, -11, 0, 1, 999, 1};
        SelectionSortUtil.sortIntArray(intArray);
        System.out.println(Arrays.toString(intArray));
    }
}