
public class Auto extends Vehiculo {

    public Auto(String marca, String modelo, double velocidad) {
        super(marca, modelo, velocidad, velocidad);
    }

    @Override
    public double calcularConsumo(double distancia) {
        double totalConsumo = distancia / getCombustible();
        return totalConsumo;
    }

}
