package com.micHon;

import com.micHon.message.Message;
import com.micHon.officer.Officer;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Attack");
        Officer officer = new Officer();
//        officer.setCaptain(true);
        officer.setSergant(true);
        officer.receiveMessage(message);
    }
}
