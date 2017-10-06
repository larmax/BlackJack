package blackjackpeli;
import java.util.*;
public class Korttipakka {
    private ArrayList<Kortti> Korttipakka = new ArrayList();
    public void addkortti(Kortti lkorttii){
        Kortti kortti = lkorttii;
        Korttipakka.add(kortti);
    }
    
    public void otaKortti(Kortti kortti){
        Kortti tkortti;
        for(int i = 0;i<Korttipakka.size();i++){
            tkortti = Korttipakka.get(i);
            if(tkortti.equals(kortti)){
                Korttipakka.remove(i);
            }
        }
    
    }
    public void sekoita(){
        Collections.shuffle(Korttipakka);
    }
    public ArrayList palauta(){
        return Korttipakka;
    }
    public Korttipakka(int pakkamaara){
        
        for(int i = 0;i<pakkamaara; i++){
        for(int ii = 1;ii<=13;ii++){
            this.addkortti(new Kortti(ii, "hertta"));
            this.addkortti(new Kortti(ii, "ruutu"));
         this.addkortti(new Kortti(ii, "risti"));
        this.addkortti(new Kortti(ii, "pata"));
           
        
        }
    
    }
    }
    public List<Kortti> getKortit() {
        return Korttipakka;
    }
}