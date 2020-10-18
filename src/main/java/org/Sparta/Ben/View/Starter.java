package org.Sparta.Ben.View;

import org.Sparta.Ben.Manager.SortFactory;
import org.Sparta.Ben.SortPrograms.Sorter;
import java.util.Random;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Starter {
    Printer printer = new Printer();
    private int[] arrayToSort;
    private int sizeOfArray;
    Logger logger = LogManager.getLogger();
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
            arrayToSort = generateArray(sizeOfArray);
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

    public int[] generateArray(int size){
        Random random = new Random();
        try {
            arrayToSort = new int[size];
            for (int i = 0; i < size; i++) {
                arrayToSort[i] = random.nextInt(10);
            }
            printer.print("Array before sort:");
            printer.printList(arrayToSort);
        } catch (IllegalArgumentException e){
            printer.printError("An invalid number has been entered");
            logger.error(e.getMessage());
        }
        catch (NullPointerException e){
            printer.printError("An error has been encountered");
            logger.error(e.getMessage());
        }
        catch (Exception e){
            printer.printError("An error has been encountered");
            logger.error(e.getMessage());
        }

         return arrayToSort;
    }

}
