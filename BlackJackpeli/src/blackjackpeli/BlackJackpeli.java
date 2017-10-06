package blackjackpeli;

import java.util.*;

public class BlackJackpeli {

    public static void main(String[] args) {
        int pisteet;
        Käsi pkasi = new Käsi();
        emanta ekasi = new emanta();

        Scanner pena = new Scanner(System.in);
         System.out.println("haluatko pelata?");
        String vast1 = pena.nextLine();
        System.out.println("Monta pakkaa haluat peliin?");
        int vast2 = pena.nextInt();
        Korttipakka pakka = new Korttipakka(vast2);
        if (vast1.equals("kylla")) {

            while (true) {            
                System.out.println("Haluatko kortin?");
                int summa;
                String vast = pena.nextLine();
                if (vast.equals("joo")) {
                    pakka.sekoita();
                    Kortti jaettavakortti = pakka.getKortit().get(0);
                    //  pakka.remkortti(jaettavakortti);
                    pkasi.otaKortti(jaettavakortti);
                    System.out.println(pkasi);
                    summa = pkasi.selvitaSumma();
                    System.out.println(summa);
                    pisteet = summa;
                    if (summa > 21) {
                        System.out.println("hävisit. Parempi onnni ensi kerralla");
                        break;
                    }
                } else if (vast.equals("ei")) {

               
              
                    int esumma = 0;
                    while (esumma <= 17) {
                        Kortti jaettavakortti = pakka.getKortit().get(0);
                        pakka.sekoita();
                        //  pakka.remkortti(jaettavakortti);
                        ekasi.otaKortti(jaettavakortti);
                        esumma = ekasi.selvitäSumma();
                        Kortti ekortti = ekasi.getEmannanKortit();
                    
                        System.out.println(ekortti);
                    
                    }
                    System.out.println("ja niiden yhteisarvo on: ");
                       System.out.println("nyt on sitten emännän vuoro:");
                    System.out.println("emäntä sai seuraavat kortit: "+esumma);
                    int psumma = pkasi.selvitaSumma();
                    if (esumma > 21 || psumma > esumma) {
                        System.out.println("voitit! :D");
                    } else if (esumma <= 21 && esumma > psumma) {
                        System.out.println("emäntä voittaa!");
                    }
                    break;
                }
            }
        } else {
            System.out.println("ei sitte");
        }
    }
}
