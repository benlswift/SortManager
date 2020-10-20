package org.Sparta.Ben.SortPrograms;

import org.Sparta.Ben.View.Printer;

public class BubbleSort implements Sorter {

    Printer printer = new Printer();
    public void bubbleSort(){
    }

    public int[] bubbleSort(int[] listOfNums){
        int temp =0;
        boolean sorted = false;
        printer.print("Starting Bubble Sort");
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < listOfNums.length - 1; i++) {
                if (listOfNums[i] > listOfNums[i + 1]) {
                    temp = listOfNums[i + 1];
                    listOfNums[i + 1] = listOfNums[i];
                    listOfNums[i] = temp;
                    sorted = false;
                }
            }
        }
        return listOfNums;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        return bubbleSort(arrayToSort);
    }
	
}
