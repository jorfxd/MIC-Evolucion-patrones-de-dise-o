package Strategy;

public class Ferroviario implements TransporteStrategy {

    @Override
    public void distribuir() {
        System.out.println("Se ha transportado por via ferrovial");
    }
    
}
