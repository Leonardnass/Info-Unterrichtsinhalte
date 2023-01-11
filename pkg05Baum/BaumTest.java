package pkg05Baum;

public class BaumTest {
    public static void testen(){
    Ding d1= new Ding("Fritz",3126);
    Ding d2= new Ding("Chris",1323);
    Ding d3= new Ding("Sepp",9123);
    Ding d4= new Ding("Toni",7546);
    Ding d5= new Ding("Eva",4879);
    Ding d6= new Ding("Isi",5582);
    Ding d7= new Ding("Jule",9467);
    Ding d8= new Ding("Franzi",8467);

    Baum b = new Baum();

    b.einfügen(d8);
    b.einfügen(d7);
    b.einfügen(d6);
    b.einfügen(d5);
    b.einfügen(d4);
    b.einfügen(d3);
    b.einfügen(d2);
    b.einfügen(d1);

    System.out.println(b.suchen(5582).zahlenwertGeben());
    
    }
}
