
package blackjackpeli;
import java.util.*;
public class Käsi {
    private Korttipakka pakkakortti;
    private ArrayList pelaajankäsi = new ArrayList();

public void k(){
    pakkakortti = new Korttipakka();
}
public void otaKortti(String kortti){
    String jaettavakortti = pakkakortti.getkortti(kortti);
}
public String getPelaajanKortit() {
    String kortti = pelaajankäsi.get(0).toString();
    return kortti;
}
public void selvitäSumma(){
  int sum = 0;

//for(String kortti:pelaajankäsi.toString()){
  for(int i = 0;i<=pelaajankäsi.size();i++){
      System.out.println("moi");

}

}
}
