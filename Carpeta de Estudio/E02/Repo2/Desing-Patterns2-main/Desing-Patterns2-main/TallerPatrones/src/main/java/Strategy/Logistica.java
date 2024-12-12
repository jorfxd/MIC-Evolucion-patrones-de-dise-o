package Strategy;

public class Logistica {
    
    private TransporteStrategy strategy;
    
    public void setStrategy(TransporteStrategy s) {
        this.strategy = s;
    }
    
    public void startDistribuir() {
        strategy.distribuir();
    }
}
