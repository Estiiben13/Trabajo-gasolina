
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ha cuantos carros le va a verificar el rendimiento? --> Ingrese la cantidad: ");

        int numeroVehiculos = sc.nextInt();
        sc.nextLine();

        Vehiculo[] misCoches = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < numeroVehiculos; i++) {
            System.out.println("\nVehículo " + (i + 1));
            System.out.println("Escriba #1 si es Auto o #2 si es Moto");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Marca: ");
            String marca = sc.nextLine();
            System.out.println("Modelo");
            String modelo = sc.nextLine();
            System.out.println("Velocidad maxima");
            double velocidad = sc.nextInt();
            System.out.println("Combustible");
            double combustible = sc.nextInt();

            if (tipo == 1) {
                misCoches[i] = new Auto(marca, modelo, velocidad, combustible);
            } else {
                misCoches[i] = new Moto(marca, modelo, velocidad, combustible);
            }
        }
        for (int i = 0; i < misCoches.length; i++) {
            misCoches[i].mostrarDatos();
        }

    }
}
