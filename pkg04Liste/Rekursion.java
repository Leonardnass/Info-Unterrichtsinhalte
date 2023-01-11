package pkg04Liste;

public class Rekursion {

    double betrag;

    public Rekursion(){
        betrag = 1000;
    }
    public int ggT(int a, int b){
        if(a>b){
            return ggT(a-b, b);
        }
        else 
        if(a<b){
            return ggT(a, b-a);
        } 
        else{
            return a;
        }
    }

    public double guthaben(int dauer){
        if (dauer <= 1){
            return betrag * 1.015;
        }
        else {
            return guthaben(dauer - 1) + guthaben(dauer - 1) * 0.015;
        }
    }
}
