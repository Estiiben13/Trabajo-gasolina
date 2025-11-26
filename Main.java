import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ha cuantos carros le va a verificar el rendimiento? --> Ingrese la cantidad: ");

        int numeroVehiculos = sc.nextInt();

        Vehiculo[] coches = new Vehiculo[numeroVehiculos];

        Vehiculo rojo = new Auto();
        Vehiculo azul = new Auto();
        Vehiculo verde = new Moto();
        Vehiculo amarillo = new Moto();

        coches[0] = rojo;
        coches[1] = azul;
        coches[2] = verde;
        coches[3] = amarillo;

        double consumoRojo = coches[0].calcularConsumo();
        double consumoAzul = coches[1].calcularConsumo();
        double consumoVerde = coches[2].calcularConsumo();
        double consumoAmarillo = coches[3].calcularConsumo();

        System.out.println("El consumo del coche rojo es: " + consumoRojo);
        System.out.println("El consumo del coche rojo es: " + consumoAzul);
        System.out.println("El consumo del coche rojo es: " + consumoVerde);
        System.out.println("El consumo del coche rojo es: " + consumoAmarillo);

    }

}
