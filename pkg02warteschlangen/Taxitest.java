package pkg02warteschlangen;

public class Taxitest {
    public static void testen() {
        Taxi taxiA=new Taxi("Britta","M-T-1",123);
        Taxi taxiB=new Taxi("Hans","M-T-2",456);
        Taxi taxiC=new Taxi("Peter","M-T-3",789);
        Taxi taxiD=new Taxi("Willi","M-T-4",147);
        Taxi taxiE=new Taxi("Hubert","M-T-5",258);
        Taxi taxiF=new Taxi("Paula","M-T-6",369);
        Taxi taxiG=new Taxi("Eva","M-T-7",159);
        Taxi taxiH=new Taxi("Otto","M-T-8",753);
        Taxi taxiI=new Taxi("Iris","M-T-9",179);
        Taxi taxiJ=new Taxi("Norbert","M-T-10",931);
		
	    TaxiWarteschlange warteschlange=new TaxiWarteschlange();
        
        warteschlange.hintenAnstellen(taxiA);
        warteschlange.hintenAnstellen(taxiB);
        warteschlange.fahrerlisteAusgeben();

        for(int i=0;i <5; i++){
            warteschlange.abfahren();
        }

        warteschlange.hintenAnstellen(taxiC);
        warteschlange.hintenAnstellen(taxiD);
        warteschlange.hintenAnstellen(taxiE);
        warteschlange.hintenAnstellen(taxiF);
        warteschlange.fahrerlisteAusgeben();

        warteschlange.abfahren();

        warteschlange.hintenAnstellen(taxiG);
        warteschlange.hintenAnstellen(taxiH);
        warteschlange.hintenAnstellen(taxiI);
        warteschlange.hintenAnstellen(taxiJ);
        warteschlange.fahrerlisteAusgeben();
    }
}
