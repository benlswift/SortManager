package org.Sparta.Ben.Exceptions;

import org.Sparta.Ben.View.Printer;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;


public class ChildNotFoundException extends Exception{
    public ChildNotFoundException(String message){
        super(message);
        Logger logger = LogManager.getLogger();
        Printer printer = new Printer();
        printer.printError(message);
        logger.error("Child node exception: child doesn't exist");
    }
}
