package org.Sparta.Ben.View;

import org.Sparta.Ben.GenerateInputArray;
import org.Sparta.Ben.Manager.SortFactory;
import org.Sparta.Ben.SortPrograms.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Starter {
    Printer printer = new Printer();
    GenerateInputArray generateInputArray = new GenerateInputArray();
    Logger logger = LogManager.getLogger();
    private int[] arrayToSort;
    private int sizeOfArray;

    public void startSort() {
        String sortType;
        int arraySize;
        long startTime;
        long endTime;
        long elapsedTime;
        try {
            SortFactory sortFactory = new SortFactory();
            SortSelector sortSelector = new SortSelector();
            sortType = sortSelector.sortSelector();
            sizeOfArray = sortSelector.arraySize();
            arrayToSort = generateInputArray.generateArray(sizeOfArray);
            Sorter sort = sortFactory.getSort(sortType);
            startTime = System.nanoTime();
            printer.printList(sort.sortArray(arrayToSort));
            endTime = System.nanoTime();
            elapsedTime = endTime - startTime;
            printer.print("Sorted in " + elapsedTime + " nanoseconds");
        } catch (Exception e){
            logger.error(e.getMessage());
        }

    }

}
