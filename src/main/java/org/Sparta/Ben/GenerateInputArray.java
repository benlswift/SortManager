package org.Sparta.Ben;

import org.Sparta.Ben.View.Printer;

import java.util.Random;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class GenerateInputArray {
    public int[] generateArray(int size){
        Printer printer = new Printer();
        Logger logger = LogManager.getLogger();
        int [] arrayToSort = new int[size];
        Random random = new Random();
        try {
            for (int i = 0; i < size; i++) {
                arrayToSort[i] = random.nextInt(100);
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
