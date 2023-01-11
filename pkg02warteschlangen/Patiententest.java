package pkg02warteschlangen;

public class Patiententest {
    public static void testen(){
        Patient p1 = new Patient("Sepp","Ahornweg 2","12.3.1992","AOK");
        Patient p2 = new Patient("John","Hauptstraße 27","23.11.1988","AOK");
        Patient p3 = new Patient("Tilo","Mozartstr. 4","2.5.2000","BKK");
        Patient p4 = new Patient("Maja","Schillerstr. 2","21.6.1966","Barmer");
        Patient p5 = new Patient("Nina","Zugspitzstr. 87","17.9.1955","BKK");
        Patient p6 = new Patient("Maxi","Sportweg 9","29.11.1970","Barmer");
        Patient p7 = new Patient("Lisa","Schulstr. 1","16.1.1978","AOK");
        
        PatientenWarteschlange s = new PatientenWarteschlange();
        
        s.hintenAnstellen(p1);
        s.hintenAnstellen(p2);
        s.hintenAnstellen(p3);
        s.hintenAnstellen(p4);
        s.hintenAnstellen(p5);
        
        System.out.println(s.anzahlGeben());
        for (String x: s.namenlisteGeben()) {
            System.out.println(x);
        }
        
        System.out.println("Nächster Patient: "+s.erstenAufrufen().gibName());
        
        s.hintenAnstellen(p6);
        
        System.out.println(s.anzahlGeben());
        
        s.hintenAnstellen(p7);
        
        System.out.println(s.anzahlGeben());
        for (String x: s.namenlisteGeben()) {
            System.out.println(x);
        }
    }
}