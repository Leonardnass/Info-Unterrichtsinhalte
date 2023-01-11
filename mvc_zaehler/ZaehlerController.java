package mvc_zaehler;

public class ZaehlerController implements ZaehlerViewController
{
    private StandardZaehlerModel model;
    private ZaehlerView view;

    private boolean enabled;


    public ZaehlerController(){
        enabled = true;
        model = new StandardZaehlerModel();
        view = new ZaehlerView(model,this);
        view.zeigen();
    }


    /** Adapter-Methode */
    public void plusButtonGedrueckt(){
        model.zahlErhoehen();
    }
    
    public void minusButtonGedrueckt(){
        model.zahlVerringern();
    }


    public void enableDisableplusButtonGedrueckt() {
        enabled = !enabled;
        view.setzeplusEnabled(enabled);
        
    }


    public void enableDisableminusButtonGedrueckt() {
        enabled = !enabled;
        view.setzeminusEnabled(enabled);
        
    }
}

