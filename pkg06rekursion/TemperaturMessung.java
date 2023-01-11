package pkg01grundlagen;

public class TemperaturMessung {
    private float[] temperatur;
    
    public TemperaturMessung() {
        temperatur = new float[365];
    }
    public void zufallswerte() {
        for (int i = 0; i < temperatur.length; i++) {
            temperatur[i] = (float)(Math.random()*60 - 20);
        }
    }
    /**
     * @return die hoechste Temperatur innerhalb der Liste
     */
    public float maxTemp(){
        float maxTemp = -40;
        for (int i = 0; i < temperatur.length; i++) {
            if (temperatur[i]>maxTemp) maxTemp=temperatur[i];
        }
        return maxTemp;
    }
}
