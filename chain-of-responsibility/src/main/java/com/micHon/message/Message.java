package com.micHon.message;

import com.micHon.officer.OfficerRank;

public class Message {

    private String content;
    private int code;
    private OfficerRank officerRank;

    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }

    public String getContent() {
        return content;
    }

    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }
}
