package com.infoshareacademy.zadanie_domowe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CzytaniePliku {


    void odczytajPlik() throws IOException {

        ClassLoader classLoader = this.getClass().getClassLoader();

        String filePath = classLoader.getResource("plik.txt").getFile();

        File plik = new File(filePath);
        boolean czyPlikIstnieje = plik.exists();
        System.out.println(czyPlikIstnieje);


        List<String> linie = Files.readAllLines(plik.toPath());
        System.out.println(linie);

        List<Uczen> uczniowie = new ArrayList<>();
        int numer = 1;
        for (String l : linie){
            String[] liniaPodzielona = l.split(",", 3);


            Uczen uczen = new Uczen();
            uczen.setNumerUcznia(numer);
            uczen.setImie(liniaPodzielona[0]);
            uczen.setNazwisko(liniaPodzielona[1]);

            String stringOceny = liniaPodzielona[2];

            String[] oceny = stringOceny.split(",");
            for (String ocena : oceny){
                int ocenaJakoInt = Integer.parseInt(ocena);
                uczen.getOceny().add(ocenaJakoInt);
            }

            uczniowie.add(uczen);
            numer++;

        }



        System.out.println(uczniowie);


    }

}
