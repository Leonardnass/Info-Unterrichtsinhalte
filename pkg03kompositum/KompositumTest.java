package pkg03kompositum;

public class KompositumTest {
    public static void testen(){
        Element E1=new Element("A",5);
        Element E2=new Element("B",9);
        Element E3=new Element("C",3);
        Element E4=new Element("D",13);
        Element E5=new Element("E",21);
        Element E6=new Element("F",2);

        Liste L = new Liste();
        L.hintenEinfuegen(E6);
        L.hintenEinfuegen(E5);
        L.hintenEinfuegen(E4);
        L.hintenEinfuegen(E3);
        L.hintenEinfuegen(E2);

        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.laengeGeben());


       L.sortiertEinfuegen(E5);
       L.sortiertEinfuegen(E3);
       L.sortiertEinfuegen(E4);
       L.sortiertEinfuegen(E1);
       L.sortiertEinfuegen(E6);

        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.laengeGeben());



/*       
        L.entfernen(E3);
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());

        L.entfernen(E2);
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());
*/

/*
        L.vorneEntfernen();
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());

        L.hintenEntfernen();
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());

        L.hintenEntfernen();
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());

        L.hintenEntfernen();
        L.listeAusgeben();
        System.out.println("aktuelle Länge: "+L.anzahlGeben());
 */
    }
}
