package blackjackpeli;
import java.util.*;
public class BlackJackpeli {
    public static void main(String[] args) {
        Korttipakka pakka = new Korttipakka();
        Scanner pena = new Scanner(System.in);
        System.out.println("haluatko pelata?");
            String vast1 = pena.nextLine();
            if(vast1.equals("joo")){
                while(true){
                    System.out.println("Haluatko kortin?");
                    String vast = pena.nextLine();
                    if(vast.equals("joo")){
                    }
                    else if(vast.equals("ei")){
                        System.out.println("ei sit");
                    }
                }
            }
        else{System.out.println("haist vittu sit. >:C");}
    }
}