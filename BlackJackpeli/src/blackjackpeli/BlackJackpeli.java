package blackjackpeli;
import java.util.*;
public class BlackJackpeli {
    public static void main(String[] args) {
        int pisteet;
        Käsi pkasi = new Käsi();
        emanta ekasi = new emanta();
        Korttipakka pakka = new Korttipakka();
        Scanner pena = new Scanner(System.in);
        System.out.println("haluatko pelata?");
            String vast1 = pena.nextLine();
            if(vast1.equals("joo")){
                 
                while(true){
                    int summa;
                    System.out.println("Haluatko kortin?");
                    String vast = pena.nextLine();
                    if(vast.equals("joo")){
                        pakka.sekoita();
                        String jaettavakortti = pakka.getKortit().get(0);
                        pakka.remkortti(jaettavakortti);
                        pkasi.otaKortti(jaettavakortti);
                        String pelaajanpakka = pkasi.getPelaajanKortit();
                        System.out.println(pelaajanpakka);
                        summa = pkasi.selvitäSumma();
                        System.out.println( summa);
                        pisteet = summa;
                        if(summa > 21){
                            System.out.println("hävisit. Parempi onnni ensi kerralla");
                            break;
                        }
                    }
                    else if(vast.equals("ei")){
                        
                        System.out.println("ei sit");
                        System.out.println("nyt on sitten emännän vuoro:");
                        System.out.println("emäntä sai seuraavat kortit: ");
                        int esumma = 0;
                        while(esumma <= 17){
                            String jaettavakortti = pakka.getKortit().get(0);
                            pakka.sekoita();
                            pakka.remkortti(jaettavakortti);
                            ekasi.otaKortti(jaettavakortti);
                            esumma = ekasi.selvitäSumma();
                            String ekortti = ekasi.getEmannanKortit();
                            System.out.println(ekortti);
                        }
                        System.out.println("ja niiden yhteisarvo on: ");
                        System.out.println(esumma);
                        break;
                    }
                }
            }
            else{
                System.out.println("ei sitte");
        }
    }
}
