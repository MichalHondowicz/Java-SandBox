package com.micHon.officer;

import com.micHon.message.Message;

public class Sergant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Smith";

    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGANT) && message.getCode() == CODE) {
            System.out.println(NAME + " received message " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
