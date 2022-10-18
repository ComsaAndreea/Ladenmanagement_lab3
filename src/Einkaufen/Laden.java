package Einkaufen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Laden {
    private ArrayList<Produkt> produkte;

    public Laden(ArrayList<Produkt> produkte) {
        this.produkte = produkte;
    }

    public ArrayList<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(ArrayList<Produkt> produkte) {
        this.produkte = produkte;
    }

    public ArrayList<Produkt> rabatt(){
        ArrayList<Produkt> prodList = new ArrayList<>(produkte);
        for(Produkt i:prodList){
            if(i.getAnzTage()<=10){
                i.setPreis(i.getPreis());
            }
            if(i.getAnzTage()>10 && i.getAnzTage()<=20){
                i.setPreis(i.getPreis()*0.9);
            }
            if(i.getAnzTage()>20){
                i.setPreis(i.getPreis()*0.8);
            }
        }
        return prodList;
    }

    public ArrayList<Produkt> hoherAls100(){
        ArrayList<Produkt> prodList = new ArrayList<>();
        for(Produkt i:produkte){
            if(i.getPreis()>100){
                prodList.add(i);
            }
        }
        return prodList;
    }

    public ArrayList<Produkt> nachRabattSortieren(){
        ArrayList<Produkt> prodList = new ArrayList<>(rabatt());
        prodList.sort(Comparator.comparing(Produkt::getPreis));
        return prodList;
    }

    public Produkt teuerste(){
        Produkt teuer = produkte.get(0);
        for(Produkt i:produkte){
            if(i.getPreis()>teuer.getPreis()){
                teuer = i;
            }
        }
        return teuer;
    }

    public Produkt gunstigste(){
        Produkt gunstig = produkte.get(0);
        for(Produkt i:produkte){
            if(i.getPreis()<gunstig.getPreis()){
                gunstig = i;
            }
        }
        return gunstig;
    }

}
