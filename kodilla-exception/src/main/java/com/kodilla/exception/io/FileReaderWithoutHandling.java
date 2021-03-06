package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void raedFile() throws IOException{
        //Klasa ClassLoader jes odpowiedzialna za odnalezienie klas i plików wewnątrz naszej aplikacji
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("file/names.txt").getFile());

        System.out.println(file.getPath());
        //Path path = Paths.get("file/names.txt"); //file.getPath()
        Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
        fileLines.forEach(System.out::println);
    }
}

