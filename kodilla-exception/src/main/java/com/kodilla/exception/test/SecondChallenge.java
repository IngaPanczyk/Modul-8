package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        try {
            if (x >= 2 || x < 1 || y == 1.5) {
                throw new Exception();
            }
            System.out.println("DONE");
            return "Done!";
        } catch (Exception e) {
            throw new ExceptionHandling();
        } finally {
            System.out.println("Program completed");

        }
    }
}
