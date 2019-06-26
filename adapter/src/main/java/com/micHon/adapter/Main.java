package com.micHon.adapter;

public class Main {

    public static void main(String[] args) {

        EuroSocket euroSocket = new EuroSocket();

        UKSocket ukSocket = new UKSocket();

        EuroDevice euroRadio = () -> System.out.println("Europe!");

        UKDevice ukRadio = () -> System.out.println("London!");

        ukSocket.plugIn(ukRadio);

        UKToEuroAdapter adapter = new UKToEuroAdapter(ukRadio);

        euroSocket.plugIn(adapter);

        TwoWayAdapter twoWayAdapter = new TwoWayAdapter(ukRadio, euroRadio);

        euroSocket.plugIn(twoWayAdapter);

        ukSocket.plugIn(twoWayAdapter);

    }
}
