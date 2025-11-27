
public class Vehiculo {

    private String marca;
    private String modelo;
    private double velocidad;
    private double combustible;

    public Vehiculo(String marca, String modelo, double velocidad, double combustible) {

        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.combustible = combustible;

    }

    public void mostrarDatos() {

        System.out.println("La marca es: " + marca + " el modelo es: " + modelo + " su velocidad es de: "
                + velocidad + " y su capacidad de combustible es: " + combustible);
    }

    public double calcularConsumo(double distancia) {
        double totalConsumo = distancia / combustible;
        //System.out.println("El total del consumo es: " + totalConsumo); <- Esto solo es para metodos que no retornen valores.
        return totalConsumo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
}
