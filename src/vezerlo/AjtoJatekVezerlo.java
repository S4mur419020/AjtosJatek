package vezerlo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modell.JatekModell;
import nezet.JatekNezet;


public class AjtoJatekVezerlo {
    private JatekModell modell;
    private final JatekNezet nezet;

    public AjtoJatekVezerlo(JatekModell modell, JatekNezet nezet){
        
        if (modell == null) {
            this.modell = new JatekModell();
        } else {
            this.modell = modell;
        }

        this.nezet = nezet;
        init();
    }
    private void init(){
        nezet.getUjjatek().addActionListener(e -> ujraindit());
        
        nezet.getAjto1().addActionListener(new AjtoValaszto());
        nezet.getAjto2().addActionListener(new AjtoValaszto());
        nezet.getAjto3().addActionListener(new AjtoValaszto());
        
        ujraindit();
    }
    private void ujraindit(){
        int valamiIndex=(int) (Math.random()*3);
        switch (valamiIndex){
            case 0 -> modell.setAjto("Ajto 1");
            case 1 -> modell.setAjto("Ajto 2");
            case 2 -> modell.setAjto("Ajto 3");
        }
        modell.setRejtValamit(true);
        modell.setFelirat("Én rejtem a nyereményt.");
        
        nezet.getButtonGroup1().clearSelection();
        nezet.mutat("Válaszd ki melyik ajtó mögött van a nyeremény");
    }
    private class AjtoValaszto implements ActionListener{
         @Override
        public void actionPerformed(ActionEvent e) {
            String valasztott = "";
            if (nezet.getAjto1().isSelected()) {
                valasztott = "Ajto 1";
            } else if (nezet.getAjto2().isSelected()) {
                valasztott = "Ajto 2";
            } else if (nezet.getAjto3().isSelected()) {
                valasztott = "Ajto 3";
            }
            
            String uzenet;
            if (valasztott.equals(modell.getAjto())) {
                uzenet = "🎉 Gratulálok! A(z) " + valasztott + " ajtó mögött volt a nyeremény!";
            } else {
                uzenet = "😢 Sajnos nem talált! A nyeremény a " + modell.getAjto()+ " ajtó mögött volt.";
            }

            nezet.mutat(uzenet);
        }
    }
}
