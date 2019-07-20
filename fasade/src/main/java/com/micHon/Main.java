package com.micHon;

import com.micHon.inBox.InBoxFacade;

public class Main {

    public static void main(String[] args) {

        InBoxFacade inBoxFacade = new InBoxFacade();
        inBoxFacade.collectPackage();
    }
}
