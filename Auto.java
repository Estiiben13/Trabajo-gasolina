
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double velocidad, double combustible) {
        super(marca, modelo, velocidad, combustible);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double totalConsumo = distancia / getCombustible();
        return totalConsumo;
    }

}
