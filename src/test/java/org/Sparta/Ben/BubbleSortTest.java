package org.Sparta.Ben;
import org.Sparta.Ben.Exceptions.ChildNotFoundException;
import org.Sparta.Ben.SortPrograms.BinaryTreeImpl;
import org.Sparta.Ben.SortPrograms.BubbleSort;
import org.Sparta.Ben.SortPrograms.MergeSort;
import org.Sparta.Ben.SortPrograms.MergeSortImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSortTest {
    int[] arrayOfElement = {4,6,2,7,3,9};
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    void sortArrayTest(){
        Assertions.assertEquals(Arrays.toString(new int[]{2, 3, 4, 6, 7, 9}), Arrays.toString(bubbleSort.sortArray(arrayOfElement)));

    }
}
