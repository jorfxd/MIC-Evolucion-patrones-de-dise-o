package Strategy;

public class Fluvial implements TransporteStrategy {

    @Override
    public void distribuir() {
        System.out.println("Se ha transportado por barco");
    }
    
}
