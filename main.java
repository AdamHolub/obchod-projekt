package com.company;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Výtejte v obchodu");

        String[] seznam = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};
        int nvm = -1;
        int vysledek = 0;

        //  maso
        int jehneci = 200;
        int hovezi = 250;
        int veprove = 190;

        //  pečivo
        int chleba = 45;
        int rohlik = 2;
        int houska = 10;

        //  ovoce
        int jablko = 15;
        int hruska = 16;
        int broskev = 19;


        for (int i = 0; i > -1; i++) {

            System.out.println("1)  Maso");
            System.out.println("2)  Pečivo");
            System.out.println("3)  Ovoce");
            System.out.println("4)  Přejít k platbě");

            int vyber = scanner.nextInt();


            if (vyber == 1) {                                                              //výběr 1
                System.out.println("1)  Jehněčí - " + jehneci + " Kč");
                System.out.println("2)  Hovězí - " + hovezi + " Kč");
                System.out.println("3)  Vepřové - " + veprove + " Kč");

                int maso = scanner.nextInt();

                if (maso == 1) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetjehneci = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetjehneci * jehneci;
                    nvm++;

                    seznam[nvm] = "Jehněčí - " + pocetjehneci + "x" + "\n";

                } else if (maso == 2) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocethovezi = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocethovezi * hovezi;
                    nvm++;

                    seznam[nvm] = "Hovězí - " + pocethovezi + "x" + "\n";

                } else if (maso == 3) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetveprove = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetveprove * veprove;
                    nvm++;

                    seznam[nvm] = "Vepřové - " + pocetveprove + "x" + "\n";

                } else {
                    System.out.println("Zvolená akce neexistuje!!");
                }

            } else if (vyber == 2) {                                                     //výběr 2
                System.out.println("1)  Chleba - " + chleba + " Kč");
                System.out.println("2)  Rohlik - " + rohlik + " Kč");
                System.out.println("3)  Houska - " + houska + " Kč");

                int pecivo = scanner.nextInt();

                if (pecivo == 1) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetRohlik = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetRohlik * rohlik;
                    nvm++;

                    seznam[nvm] = "Rohlík - " + pocetRohlik + "x" + "\n";

                } else if (pecivo == 2) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetChleba = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetChleba * chleba;
                    nvm++;

                    seznam[nvm] = "Chleba - " + pocetChleba + "x" + "\n";

                } else if (pecivo == 3) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocethouska = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocethouska * houska;
                    nvm++;

                    seznam[nvm] = "Houska - " + pocethouska + "x" + "\n";

                } else {
                    System.out.println("Zvolená akce neexistuje!!");
                }
            } else if (vyber == 3) {                                                 //výběr 3

                System.out.println("1)  Jablko - " + jablko + " Kč");
                System.out.println("2)  Hruška - " + hruska + " Kč");
                System.out.println("3)  Broskev - " + broskev + " Kč");

                int ovoce = scanner.nextInt();

                if (ovoce == 1) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetjablko = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetjablko * jablko;
                    nvm++;

                    seznam[nvm] = "Jablko - " + pocetjablko + "x" + "\n";

                } else if (ovoce == 2) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocethruska = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocethruska * hruska;
                    nvm++;

                    seznam[nvm] = "Hruška - " + pocethruska + "x" + "\n";

                } else if (ovoce == 3) {
                    System.out.println("Kolik těchto položek chcete?");
                    int pocetbroskev = scanner.nextInt();
                    System.out.println("Přidáno do košíku");
                    vysledek += pocetbroskev * broskev;
                    nvm++;

                    seznam[nvm] = "Broskev - " + pocetbroskev + "x" + "\n";

                } else {
                    System.out.println("Zvolená akce neexistuje!!");
                }
            }  else if (vyber == 4) {                                               //výběr 4

                break;

            } else {
                System.out.println("Zvolená akce neexistuje!");
            }
        }
        System.out.println("Celková částka je : " + vysledek + " Kč");
        for (String s: seznam) {
            System.out.print(s);
        }
    }
}
