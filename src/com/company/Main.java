package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //UwU
        int menupont = -1;
        while(menupont != 0){
            switch (menupont){
                case 1: break;
                case 2: break;
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
