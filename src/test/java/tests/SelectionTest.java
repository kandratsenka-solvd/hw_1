package tests;

import org.testng.annotations.Test;
import utils.SelectionSort;

import java.util.Arrays;

public class SelectionTest {

    @Test
    public static void testSelectionAlgorithm() {
        int[] arr = {3, -58, 100, -11, 0 , 999, 1};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}