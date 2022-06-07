package com.company;

import java.util.Scanner;

public class CRUD {
    Scanner be = new Scanner(System.in);
    public void addUgyfel(){
        Ugyfel uj = new Ugyfel();
        System.out.println("Kérem az ügyfél nevét:");
        uj.setNev(be.nextLine());
        System.out.println("Adja meg a lakcímet:");
        uj.setLakcim(be.nextLine());
        System.out.println("Adja meg az anyja nevét:");
        uj.setAnyja_neve(be.nextLine());
        System.out.println("Adja meg az emailt:");
        uj.setEmail(be.nextLine());
        System.out.println("Kérem adja meg a születési dátumot:");
        uj.setSzuldat(be.nextLine());

        System.out.println("A jelenlegi id szám:" + uj.getCounter());
        Ugyfel.lista.add(uj);
    }

    public void addEletInsurance(){
        for (int i = 0; i < Ugyfel.lista.size(); i++) {
            System.out.println(Ugyfel.lista.get(i).getNev()
                + "\t"+ Ugyfel.lista.get(i).getLakcim()
                + "\t"+ Ugyfel.lista.get(i).getEmail()

            );
        }

        System.out.println("Az ügyfél szerepel a rendszerben?(ha nem, akkor nyomjon 0-t");
        if (be.nextLine().equals("0")){
            System.out.println("Kérjük vegye fel az ügyfél adatait:");
            addUgyfel();
        }

        System.out.println("Küzd fogyatékossággal?(igen/nem");
        if (be.nextLine().equals("igen")){

        }


    }




}
