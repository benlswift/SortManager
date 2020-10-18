package org.Sparta.Ben.View;
import java.util.Arrays;

    public class Printer <T> {
        public void printList(int[] listOfNums){
            System.out.println(Arrays.toString(listOfNums));

        }
        public void print(T message){
            System.out.println(message);
        }
        public void printError(String message){
            System.err.println(message);
        }
    }
