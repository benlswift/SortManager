package org.Sparta.Ben.View;

import org.Sparta.Ben.SortPrograms.BinaryTreeImpl;
import org.Sparta.Ben.SortPrograms.BubbleSort;
import org.Sparta.Ben.SortPrograms.MergeSortImpl;

import java.util.Scanner;

public class SortSelector {
    private String enterArray;
    Scanner scanner = new Scanner(System.in);
    public String sortSelector(){
        int sortType;
        do {
            System.out.println("Please Select Sort Type");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Merge Sort");
            System.out.println("3. Binary Tree");
            sortType = scanner.nextInt();
        } while (sortType != 1 && sortType != 2 && sortType != 3);

        return convertToSortType(sortType);

    }

    public int arraySize() {
        int arraySize = 0;
        do {
            System.out.println("Please Enter Number of Elements to Sort");
            arraySize = scanner.nextInt();
        } while (arraySize < 1);

        return arraySize;
    }

    private String convertToSortType(int inputNumber) {
        String sortType = "";

        switch(inputNumber){
            case 1:
                sortType = "Bubble";
                break;
            case 2:
                sortType = "Merge";
                break;
            case 3:
                sortType = "Binary Tree";
                break;
        }

        return sortType;

    }

}
