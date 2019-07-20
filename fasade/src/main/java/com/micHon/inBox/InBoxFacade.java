package com.micHon.inBox;

public class InBoxFacade {

    private InBox inBox;
    private InBoxSystem inBoxSystem;

    public InBoxFacade() {
        this.inBox = new InBox();
        this.inBoxSystem = new InBoxSystem();
    }

    public void collectPackage() {

        inBox.getUserData();
        if (inBoxSystem.isUserDataValidated() && inBoxSystem.isPaymentSecured()) {
            inBox.openBox();
        }
    }
}
