package blackjackpeli;
import java.util.*;
public class Korttipakka {
    private ArrayList Korttipakka = new ArrayList();
    public void addkortti(String maa, int arvo){
        String kortti = maa+arvo;
        Korttipakka.add(kortti);
    }
    public void remkortti(String kortti){
        String tkortti = "";
        for(int i = 0;i<=Korttipakka.size();i++){
            tkortti = Korttipakka.get(i).toString();
            if(tkortti.equals(kortti)){
                Korttipakka.remove(i);
            }
        }
    }
    public boolean checkkortti(String kortti){
        String tkortti = "";
        for(int i = 0;i<=Korttipakka.size();i++){
            tkortti = Korttipakka.get(i).toString();
            if(tkortti.equals(kortti)){
                return true;
            }
        }
        return false;
    }
    public String getkortti(String kortti){
        String tkortti = "";
        for(int i = 0;i<=Korttipakka.size();i++){
            tkortti = Korttipakka.get(i).toString();
            if(tkortti.equals(kortti)){
                return tkortti;
            }
        }
        return "";
    }
}
