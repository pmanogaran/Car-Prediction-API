package com.example.caridentifier;

public class Car {
    private String marke;
    private String modell;

    public Car() {
    }

    public Car(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }
}
