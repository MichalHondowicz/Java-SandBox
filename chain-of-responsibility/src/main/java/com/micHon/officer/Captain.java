package com.micHon.officer;

import com.micHon.message.Message;

public class Captain extends Officer {

    private static final int CODE = 20;
    private static final String NAME = "Jones";

    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPTAIN) && message.getCode() == CODE) {
            System.out.println(NAME + " received message " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
