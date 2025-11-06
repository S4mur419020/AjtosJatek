package main;

import nezet.JatekNezet;
import modell.JatekModell;
import vezerlo.AjtoJatekVezerlo;
public class Ajtos_Jatek {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() ->{
            JatekNezet nezet=new JatekNezet();
            JatekModell modell=new JatekModell();
            new AjtoJatekVezerlo(modell, nezet);
            nezet.setVisible(true);
        });
    }
    
}
