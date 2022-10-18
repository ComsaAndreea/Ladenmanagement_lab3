package Einkaufen;

import java.util.ArrayList;

public class Produkt {
    private double preis;
    private int anzTage;

    public Produkt(double preis, int anzTage) {
        this.preis = preis;
        this.anzTage = anzTage;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getAnzTage() {
        return anzTage;
    }

    public void setAnzTage(int anzTage) {
        this.anzTage = anzTage;
    }
}
