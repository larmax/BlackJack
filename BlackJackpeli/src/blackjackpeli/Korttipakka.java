package blackjackpeli;
import java.util.*;
public class Korttipakka {
    ArrayList Korttipakka = new ArrayList();
    void addkortti(String maa, int arvo){
        String kortti = maa+arvo;
        Korttipakka.add(kortti);
    }
}
