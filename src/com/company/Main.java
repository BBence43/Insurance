package com.company;

import com.company.managgers.Administration;
import com.company.managgers.XMLHandler;

import java.util.Scanner;

public class Main {
//asd
    public static void main(String[] args) {
	// write your code here
        //UwU
        XMLHandler xml = new XMLHandler();
        xml.FileChecker();
        Administration administration = new Administration();
        //Ugyfel uj = new Ugyfel(1,"Lakatos","asd","asd","asd","asd");
        //Ugyfel uj1 = new Ugyfel(2,"Lakatos","asd","asd","asd","asd");
        //Ugyfel uj2 = new Ugyfel(3,"Lakatos","asd","asd","asd","asd");
        //System.out.println(uj.getAnyja_neve());
        //System.out.println(Ugyfel.lista.size());
        Scanner beker = new Scanner(System.in);

        //Dominik holnapi feladatai
        //listázás, választható hogy mit
        //ügyfél törlés, + vele együtt lévő biztosítások
        //ügyfél módosítása

        int menupont = -1;
        while(menupont != 0){
            Menupontok();
            menupont = beker.nextInt();
            switch (menupont){
                case 1: administration.addUgyfel();  break;
                case 2: administration.Insurance(); break;
                case 3: break;
                case 4: break;
                case 5: break;
                default:
                    System.out.println("Viszlát!"); break;
            }

        }

    }

    public static void Menupontok(){
        System.out.println("Biztosítás");
        System.out.println("--------------------");
        System.out.println("1. Új ügyfél");
        System.out.println("2. Új biztosítás");
        System.out.println("3. Biztosítás módosítás");
        System.out.println("4. Ügyfél törlése");
        System.out.println("5. Adatok listázása");
        System.out.println("0. Kilépés");
    }
}
