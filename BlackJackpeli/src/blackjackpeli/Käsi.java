package blackjackpeli;

import java.util.*;

public class Käsi {
    //   private Korttipakka pakkakortti;

    private ArrayList<Kortti> pelaajankäsi = new ArrayList();

    public void otaKortti(Kortti kortti) {
        this.pelaajankäsi.add(kortti);
        for (int i = 0; i < pelaajankäsi.size(); i++) {
            kortti = pelaajankäsi.get(i);
           // if (kortti.equals(kortti)) {
            //    pelaajankäsi.remove(i);

            //}
        }
    }



    public int selvitaSumma() {
        int sum = 0;
//for(String kortti:pelaajankäsi.toString()){
        for (int i = 0; i < pelaajankäsi.size(); i++) {
            String tar = pelaajankäsi.get(i).toString();
            String intiksi = "";
            for (int ii = 0; ii < tar.length(); ii++) {
                if (tar.charAt(ii) == '0' || tar.charAt(ii) == '1' || tar.charAt(ii) == '2' || tar.charAt(ii) == '3' || tar.charAt(ii) == '4' || tar.charAt(ii) == '5' || tar.charAt(ii) == '6' || tar.charAt(ii) == '7' || tar.charAt(ii) == '8' || tar.charAt(ii) == '9') {
                    char c = tar.charAt(ii);
                    String s = new StringBuilder().append("").append(c).toString();
                    intiksi = intiksi + s;
                }
            }
            int lisattava = Integer.parseInt(intiksi);
            sum += lisattava;
        }
        return sum;
    }
    
    public String toString(){
        return "" + this.pelaajankäsi;
    }
}
