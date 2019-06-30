package com.micHon;

import com.micHon.message.Message;
import com.micHon.officer.*;

public class Main {

    public static void main(String[] args) {

        Message message = new Message("Attack", 40, OfficerRank.GENERAL);

        Officer sergant = new Sergant();
        Officer captain = new Captain();
        Officer general = new General();

        sergant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergant.processMessage(message);
    }
}
