package com.kodilla.exception.test;

public class ExceptionHandling extends Throwable {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("Exception!!!");
        } finally {
            System.out.println("Program zakończony!");
        }
    }
}
