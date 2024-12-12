package Strategy;

public class Aereo implements TransporteStrategy {

    @Override
    public void distribuir() {
        System.out.println("Se ha transportado por avion");
    }
            
}
