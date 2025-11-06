package modell;

import java.util.ArrayList;
import java.util.List;

public class AjtoJatekModell {
    
    private List<JatekModell> ajtoLista;
    
    private void ajtoBeallit(){
        if(ajtoLista == null){
           ajtoLista = new ArrayList<>();
        }
        ajtoLista.add(new JatekModell("Ajtó 1","33,3% esély",true));
        ajtoLista.add(new JatekModell("Ajto 2","33,3% esély",false));
        ajtoLista.add(new JatekModell("Ajto 3","33,3% esély",false));
    }
    public AjtoJatekModell(){
        ajtoLista =new ArrayList<>();
        ajtoBeallit();
    }
    public void ujrakezd(){
        ajtoLista =new ArrayList<>();
        ajtoBeallit();
    }
    public List<JatekModell> getAjtoLista(){
        return ajtoLista;
    }
    public JatekModell getAjto(String valsztottAjto){
        for(JatekModell ajto : ajtoLista){
            if(ajto.getAjto().contains(valsztottAjto)){
                return ajto;
            }   
        }
        return null;
    }
}
