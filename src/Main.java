import Einkaufen.Laden;
import Einkaufen.Produkt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printProd(ArrayList<Produkt> p){
        int ct=1;
        for(Produkt i:p){
            System.out.println("Produkt "+ct+": "+i.getPreis()+" lei, "+i.getAnzTage()+" Tage");
            ct++;
        }
    }

    public static void main(String[] args) {
        Produkt p1 = new Produkt(5.50,9);
        Produkt p2 = new Produkt(2.85,17);
        Produkt p3 = new Produkt(6.12,41);
        Produkt p4 = new Produkt(9.00,25);
        Produkt p5 = new Produkt(1000.10,1);
        Produkt p6 = new Produkt(800.20,4);
        Produkt p7 = new Produkt(20.17,15);
        Produkt p8 = new Produkt(502.80,21);

        ArrayList<Produkt> prodList = new ArrayList<>(
                Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8)
        );

        Laden laden = new Laden(prodList);
        System.out.println("Normale Liste:");
        printProd(laden.getProdukte());
        System.out.println("Liste mit Rabatt:");
        //printProd(laden.rabatt());
        System.out.println("Hoher als 100:");
        printProd(laden.hoherAls100());
        System.out.println("Sortiert nach Rabattpreis:");
        //printProd(laden.nachRabattSortieren());
        System.out.println("Teuerste:");
        Produkt pt = laden.teuerste();
        System.out.println("Produkt "+pt.getPreis()+" lei, "+pt.getAnzTage()+" Tage");
        System.out.println("Teuerste:");
        Produkt pg = laden.gunstigste();
        System.out.println("Produkt "+pg.getPreis()+" lei, "+pg.getAnzTage()+" Tage");

    }

}