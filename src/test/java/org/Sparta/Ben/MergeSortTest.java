package org.Sparta.Ben;
import org.Sparta.Ben.SortPrograms.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {
	
    int[] arrayOfElement = {4,6,2,7,3,9};
    MergeSort mergeSort = new MergeSort();

    @Test
    void getSortedArrayTest(){
        Assertions.assertEquals(Arrays.toString(new int[]{2, 3, 4, 6, 7, 9}), Arrays.toString(mergeSort.sortArray(arrayOfElement)));

    }
}
