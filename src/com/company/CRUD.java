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


        EletInsurance uj = new EletInsurance(Ugyfel.lista.get(sorszam()).getId());
        System.out.println("Küzd fogyatékossággal?(igen/nem)");
        if (be.nextLine().equals("igen")){
            uj.setFogyatekos(true);
        }else{
            uj.setFogyatekos(false);
        }
        System.out.println("Hány éves az akire kötik?(igen/nem)");
        uj.setEletkor(be.nextInt());
        be.nextLine();

        System.out.println("Van krónikus betegsége?(igen/nem)");
        if (be.nextLine().equals("igen")){
            uj.setKronikus(true);
        }else {
            uj.setKronikus(false);
        }

        System.out.println("Van halálos betegsége?(igen/nem)");
        if (be.nextLine().equals("igen")){
            uj.setHalalos(true);
        }else{
            uj.setHalalos(false);
        }

        System.out.println("Egyéni vagy családi?");
        if (be.nextLine().equals("egyéni")){
            uj.setEcs(true);
        }else{
            uj.setEcs(false);
        }
        EletInsurance.lista.add(uj);



    }

    public void addLakas(){

        LakasInsurance uj = new LakasInsurance(sorszam());

        System.out.println("Kérem a ház címét:");
        uj.setBizt_address(be.nextLine());
        System.out.println("Kérem az ingatlan típusát:");
        uj.setIngatlantype();

        System.out.println("Kérem adja meg a melléképületek számát:");
        uj.setMellek_buildings(be.nextInt());
        be.nextLine();

        System.out.println("Lakott területen található?");
        if (be.nextLine().equals("nem")){
            uj.setLakott_area(false);
        }
        uj.setLakott_area(true);

        LakasInsurance.lista.add(uj);
    }

    public void addAuto(){
        AutoInsurance uj = new AutoInsurance(sorszam());

        System.out.println("3500 kg alatt van?");
        if (be.nextLine().equals("igen")){
            uj.setTonna(false);
        }else {
            uj.setTonna(true);
        }

        System.out.println("Kérem a rendszámot:");
        uj.setRendszam(be.nextLine());
        System.out.println("Kérem adja meg a gyártás évet:");
        uj.setGyartasiev(be.nextLine());
        System.out.println("Kérem adja meg a teljesítményt:");
        uj.setTeljesitmeny(be.nextInt());
        be.nextLine();

        AutoInsurance.lista.add(uj);
    }


public int sorszam(){
    for (int i = 0; i < Ugyfel.lista.size(); i++) {
        System.out.println((i+1)+"." + Ugyfel.lista.get(i).getNev()
                + "\t"+ Ugyfel.lista.get(i).getLakcim()
                + "\t"+ Ugyfel.lista.get(i).getEmail()

        );
    }
    int elem;
    System.out.println("Kérem adja meg a személy sorszámát:");
    elem = be.nextInt();
    be.nextLine();

    return elem;

}

}
