package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        //FileReaderWithoutHandling fileReaderWithoutHandling= new FileReaderWithoutHandling();
        //fileReaderWithoutHandling.raedFile();
        FileReader fileReader = new FileReader();
        try{
            fileReader.raedFile();
        }catch (FileReaderException e){
            System.out.println("Problem z odczytaniem pliku");
        }
    }
}
