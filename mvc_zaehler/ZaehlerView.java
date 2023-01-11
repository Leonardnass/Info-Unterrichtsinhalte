package mvc_zaehler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.ArrayList;


public class ZaehlerView implements ZaehlerBeobachter, ActionListener
{
    private JFrame fenster;
    private JLabel zahlLabel;
    private JButton plusButton;
    private JButton minusButton;
    private JButton enableDisableplusButton;
    private JButton enableDisableminusButton;

    private ZaehlerModel model;

    private ZaehlerViewController controller;


    public ZaehlerView(ZaehlerModel nModel, ZaehlerViewController c){
        model = nModel;
        controller = c;
        model.registrieren(this);
        erstelleUI();
        aktualisieren();
    }


    public void zahlGeaendert(){
        aktualisieren();
    }
    private void aktualisieren(){
        zahlLabel.setText(""+model.gibZahl());
        fenster.pack();
    }

    public void setzeplusEnabled(boolean enabled){
        plusButton.setEnabled(enabled);
    }
    public void setzeminusEnabled(boolean enabled){
        minusButton.setEnabled(enabled);
    }

    private void erstelleUI(){
        fenster = new JFrame("Zähler");
        fenster.setLayout(new FlowLayout());
        fenster.add(zahlLabel = new JLabel());
        // +
        plusButton = new JButton("+1");
        plusButton.addActionListener(this);
        fenster.add(plusButton);
        minusButton = new JButton("-1");
        minusButton.addActionListener(this);
        fenster.add(minusButton);
        // Enable - Disable
        enableDisableplusButton = new JButton("En / Dis plus");
        enableDisableplusButton.addActionListener(this);
        fenster.add(enableDisableplusButton);
        enableDisableminusButton = new JButton("En / Dis minus");
        enableDisableminusButton.addActionListener(this);
        fenster.add(enableDisableminusButton);

        // Enable - Disable

        fenster.pack();
    }

    public void zeigen(){
        fenster.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == plusButton){
            controller.plusButtonGedrueckt();
        }
        else if (e.getSource() == minusButton){
            controller.minusButtonGedrueckt();
        }
        else if(e.getSource() == enableDisableplusButton){
            controller.enableDisableplusButtonGedrueckt();
        }
        else if (e.getSource() == enableDisableminusButton){
            controller.enableDisableminusButtonGedrueckt();
        }
    }
}