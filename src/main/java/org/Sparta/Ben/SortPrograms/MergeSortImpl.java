/**
 *
 * @author Ben Swift
 *
 */

package org.Sparta.Ben.SortPrograms;

import org.Sparta.Ben.View.Printer;

public class MergeSortImpl implements Sorter {
	
    Printer printer = new Printer();

    public void mergeSortImpl(){
    }
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return getSortedArray(arrayToSort);
    }
    public int[] getSortedArray(int[] arrayToSort){
        printer.print("Starting Merge Sort");
        mergeSort(arrayToSort);
        return arrayToSort;
    }

    public void mergeSort(int[] inputArray) {
        //split in half recursively
        //until we have individual items
        //compare element pairs -> put into temp arrays
        //merge into ordered temp arrays
        //
        int lengthOfInputArray = inputArray.length;
        if (lengthOfInputArray < 2) {
            return;
        }

        int middleOfInputArray = lengthOfInputArray / 2;
        int array2Length = lengthOfInputArray - middleOfInputArray;
        int[] array1 = new int[middleOfInputArray];
        int[] array2 = new int[array2Length];


        for (int i = 0; i < middleOfInputArray; i++) {
            array1[i] = inputArray[i];
        }
        for (int j = middleOfInputArray; j < lengthOfInputArray; j++) {
            array2[j - middleOfInputArray] = inputArray[j];
        }

        mergeSort(array1);
        mergeSort(array2);
        merge(inputArray, array1, array2);
    }

    public static void merge(int[] outputArray, int[] array1, int[] array2)
    {
        int outputArrayPosition = 0;
        int array2Position = 0;
        int array1Position = 0;
        int array1Length = array1.length;
        int array2Length = array2.length;
        while (array1Position < array1Length && array2Position < array2Length)
        {
            if (array1[array1Position] < array2[array2Position]) {
                outputArray[outputArrayPosition++] = array1[array1Position++];
            }
            else {
                outputArray[outputArrayPosition++] = array2[array2Position++];
            }
        }
        while (array1Position < array1Length) {
            outputArray[outputArrayPosition++] = array1[array1Position++];
        }
        while (array2Position < array2Length) {
            outputArray[outputArrayPosition++] = array2[array2Position++];
        }

    }


}
