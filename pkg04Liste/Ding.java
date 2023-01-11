package pkg04Liste;

public class Ding implements Element {
    public String bezeichner;

    public Ding(String b){
        bezeichner = b;
    }
    public void datenGeben(){
        System.out.println(bezeichner);
    }
    
}
