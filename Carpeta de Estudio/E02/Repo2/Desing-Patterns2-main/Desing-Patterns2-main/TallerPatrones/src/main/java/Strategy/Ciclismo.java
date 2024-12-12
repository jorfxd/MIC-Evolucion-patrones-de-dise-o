package Strategy;

public class Ciclismo implements TransporteStrategy {

    @Override
    public void distribuir() {
        System.out.println("Se ha transportado por via ciclismo");
    }
    
}
