package a2253332359_practica10;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio2 {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
    }

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularareatriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) throws IOException {
        String opcion;
        double radio, base, altura;
        do {
            mostrarmenu();
            opcion = lectura.readLine();
            opcion = opcion.toUpperCase();
            switch (opcion) {
                case "C":
                    radio = pedirdato("Ingresa el radio del círculo: ");
                    System.out.println("El área del círculo es: " + calcularareacirculo(radio));
                    break;
                case "T":
                    base = pedirdato("Ingresa la base del triángulo: ");
                    altura = pedirdato("Ingresa la altura del triángulo: ");
                    System.out.println("El área del triángulo es: " + calcularareatriangulo(base, altura));
                    break;
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!(opcion.equals("s") || opcion.equals("S")));
    }
}