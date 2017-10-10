package blackjackpeli;

public class Kortti {
    private String maa;
    private int arvo;
    
    
    

public Kortti(int arvo, String maa) {
    this.maa = maa;
    this.arvo = arvo;
      }
    public void setArvo(int karvo){
        this.arvo = karvo;
        
    }
    public int getArvo(){
        return this.arvo;
    }
      
    public String getMaa(){
        return this.maa;
        
    }
    public void setMaa(String kmaa){
       this.maa = kmaa;
    }
    
    @Override
    public String toString(){
        return "arvo:"+this.arvo+" maa: "+this.maa;
    }
    
    
}
