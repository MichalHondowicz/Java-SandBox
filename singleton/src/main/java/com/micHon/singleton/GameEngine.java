package com.micHon.singleton;

import java.io.Serializable;

public class GameEngine implements Serializable {

    private static final long serialVersionUID = 23232222232L;

    private int hp = 100;
    private String playerName = "";

    private static GameEngine instance;

    private GameEngine() {

    }

    public void run() {
        while (true) {

        }
    }

    public static GameEngine getInstance() {

        if (instance == null) {
            synchronized (GameEngine.class) {
                if (instance == null) {
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    //serialization safe now
    protected Object readResolve(){
        return getInstance();
    }
}
