package blackjackpeli;
public class BlackJackpeli {
    public static void main(String[] args) {
        Korttipakka pakka = new Korttipakka();
        System.out.println("this is way too basic....");
        for(int i = 1;i<=13;i++){
            pakka.addkortti("hertta", i);
            pakka.addkortti("ruutu", i);
            pakka.addkortti("risti", i);
            pakka.addkortti("pata", i);
        }
    }
}