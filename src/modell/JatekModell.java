package modell;

public class JatekModell {
    private String ajto;
    private String felirat;
    private boolean rejtValamit;
    
    
    public JatekModell(){
        this("Ismeretlen Ajtó","Nincs felirat",false);
    }
    
    public JatekModell(String nev) {
        this(nev, "Nincs felirat", false);
    }

    public JatekModell(String ajto, String felirat, boolean rejtValamit) {
        this.ajto = ajto;
        this.felirat = felirat;
        this.rejtValamit = rejtValamit;
    }

    public String getAjto() {
        return ajto;
    }

    public String getFelirat() {
        return felirat;
    }

    public boolean isRejtValamit() {
        return rejtValamit;
    }
    
    public void setAjto(String ajto) {
        if (ajto == null || ajto.isBlank()) {
            throw new IllegalArgumentException("Az ajtó neve nem lehet üres vagy null!");
        }
        this.ajto = ajto;
    }
    
    public void setFelirat(String felirat) {
        if (felirat == null || felirat.isBlank()) {
            throw new IllegalArgumentException("Az ajtó felirata nem lehet üres vagy null érték!");
        }
        this.felirat = felirat;
    }
    public void setRejtValamit(boolean rejtValamit){
        this.rejtValamit=rejtValamit;
    }
     
    @Override
    public String toString(){
        return ajto+ "ajtó - \""+felirat +"\""
                + (rejtValamit ? "[A nyeremény itt van]" : ""); 
    }
     
    
    
}
