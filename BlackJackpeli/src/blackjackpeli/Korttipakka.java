package blackjackpeli;
import java.util.*;
public class Korttipakka {
    ArrayList Korttipakka = new ArrayList();
    void addkortti(String maa, int arvo){
        String kortti = maa+arvo;
        Korttipakka.add(kortti);
    }
    void remkortti(String kortti){
        String tkortti = "";
        for(int i = 0;i<=Korttipakka.size();i++){
            tkortti = Korttipakka.get(i).toString();
            if(tkortti.equals(kortti)){
                Korttipakka.remove(i);
            }
        }
    }
    boolean checkkortti(String kortti){
        String tkortti = "";
        for(int i = 0;i<=Korttipakka.size();i++){
            tkortti = Korttipakka.get(i).toString();
            if(tkortti.equals(kortti)){
                return true;
            }
        }
        return false;
    }
}
