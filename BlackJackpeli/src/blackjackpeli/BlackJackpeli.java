
package blackjackpeli;
import java.util.*;
public class BlackJackpeli {
    public static void main(String[] args) {
        Korttipakka pakka = new Korttipakka();
              Scanner pena = new Scanner(System.in);
        
        System.out.println("Haluatko kortin");
        String vast = pena.nextLine();
        if(vast.equals("joo")){
            getKortit();
        }else if(vast.equals("ei")){


            System.out.println("ei sit");
        }
        
        
    }
}