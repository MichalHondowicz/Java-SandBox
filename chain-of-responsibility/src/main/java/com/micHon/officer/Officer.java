package com.micHon.officer;

import com.micHon.message.Message;

public class Officer {

    private boolean sergant;
    private boolean captain;
    private boolean general;

    public void receiveMessage(Message message) {

        if (sergant) {
            System.out.println("Sergant received message: " + message.getContent());
        } else if (captain) {
            System.out.println("Captain received message: " + message.getContent());
        } else if (general) {
            System.out.println("General received message: " + message.getContent());
        } else {
            System.out.println("No message receiver found");
        }
    }

    public void setSergant(boolean sergant) {
        this.sergant = sergant;
    }

    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
}
