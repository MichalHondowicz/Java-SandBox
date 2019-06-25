package com.micHon.adapter;

public class Main {

    public static void main(String[] args) {

        EuroSocket euroSocket = new EuroSocket();

        UKSocket ukSocket = new UKSocket();

        UKDevice ukRadio = new UKDevice() {
            public void powerOn() {
                System.out.println("London!");
            }
        };

        ukSocket.plugIn(ukRadio);

        UKToEuroAdapter adapter = new UKToEuroAdapter(ukRadio);

        euroSocket.plugIn(adapter);
    }
}
