package com.kodilla.exception.nullpointer;

public class MessageSender {
    //Musimy dodać throws
    public void sendMessageTo(User user, String message) throws MessageNotSentException {
        if(user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            //Wyrzucamy wyjątek
            throw new MessageNotSentException("Object User was null");
        }
    }
}