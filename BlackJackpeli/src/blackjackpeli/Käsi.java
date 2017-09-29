
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
public Object getPelaajanKortit() {
    Object kortti = pelaajankäsi.get(0);
    return kortti;
}
public static void selvitäSumma(){
    
}

}
