package com.micHon.buliderClassic;

public class Car {

    private String wheels;
    private String body;
    private String engine;
    private String windows;

    public String getWheels() {
        return wheels;
    }

    public String getBody() {
        return body;
    }

    public String getEngine() {
        return engine;
    }

    public String getWindows() {
        return windows;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels='" + wheels + '\'' +
                ", body='" + body + '\'' +
                ", engine='" + engine + '\'' +
                ", windows='" + windows + '\'' +
                '}';
    }
}
