
package blackjackpeli;
import java.util.*;
public class emanta {
      private ArrayList <Kortti> emannankäsi = new ArrayList();



public void otaKortti(Kortti kortti){
     this. emannankäsi.add(kortti);
        for(int i = 0;i< emannankäsi.size();i++){
            kortti =  emannankäsi.get(i);
            if(kortti.equals(kortti)){
            //     emannankäsi.remove(i);
}
}
}

public Kortti getEmannanKortit() {
    Kortti kortti = emannankäsi.get(emannankäsi.size()-1);
    return kortti;
}
public int selvitäSumma(){
  int sum = 0;
//for(String kortti:emannankäsi.toString()){
  for(int i = 0;i< emannankäsi.size();i++){
      String tar = emannankäsi.get(i).toString();
      String intiksi = "";
      for(int ii = 0; ii < tar.length(); ii++){
          if(tar.charAt(ii) == '0' || tar.charAt(ii) == '1' || tar.charAt(ii) == '2' || tar.charAt(ii) == '3' || tar.charAt(ii) == '4' || tar.charAt(ii) == '5' || tar.charAt(ii) == '6' || tar.charAt(ii) == '7' || tar.charAt(ii) == '8' || tar.charAt(ii) == '9'){
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
}
