package com.infoshareacademy.zadanie_domowe;

public class Uczen {

    private String imie;
    private String nazwisko;
    private int[] oceny = new int[3];

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int[] getOceny() {
        return oceny;
    }

    public void setOceny(int[] oceny) {
        this.oceny = oceny;
    }

    void ustawOceny(){
        for (int i = 0; i < 3; i++) {
            oceny[i] = (int) (Math.random() * 5 + 1);
        }
    }

    public double srednia(){
        double suma = 0;

        for (int i=0; i< oceny.length; i++){
            suma += oceny[i];
        }

        return suma / oceny.length;
    }

    public int najwyzsza(){
        int najwyzsza = 0;

        for (int ocena : oceny){
            if (ocena > najwyzsza){
                najwyzsza = ocena;
            }
        }
        return najwyzsza;
    }

    public int najnizsza(){
        int najnizsza = Integer.MAX_VALUE;

        for (int ocena : oceny){
            if (ocena < najnizsza){
                najnizsza = ocena;
            }
        }
        return najnizsza;
    }


}
