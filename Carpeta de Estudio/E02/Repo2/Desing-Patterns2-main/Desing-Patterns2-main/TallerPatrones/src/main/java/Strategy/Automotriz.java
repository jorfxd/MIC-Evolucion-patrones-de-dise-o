package Strategy;

public class Automotriz implements TransporteStrategy {

    @Override
    public void distribuir() {
        System.out.println("Se ha transportado por automovil");
    }
    
}
