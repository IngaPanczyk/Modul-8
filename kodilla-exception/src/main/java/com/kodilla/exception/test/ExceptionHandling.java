package com.kodilla.exception.test;

public class ExceptionHandling extends Throwable {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(1, 1);
        } catch (ExceptionHandling e) {
            System.out.println("Exception!!!");
        }
    }
}
