package a2253332359_practica10;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio1 {
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String mostrarmenu() throws IOException {
        String opc;
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del círculo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("s.- Salir");
        System.out.println("Elige una opción: ");
        opc = lectura.readLine();
        return opc;
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
        do {
            opcion = mostrarmenu();
            switch (opcion) {
                case "c":
                case "C":
                    double radio = pedirdato("Ingresa el radio del círculo: ");
                    double areaCirculo = calcularareacirculo(radio);
                    System.out.println("El área del círculo es: " + areaCirculo);
                    break;
                case "t":
                case "T":
                    double base = pedirdato("Ingresa la base del triángulo: ");
                    double altura = pedirdato("Ingresa la altura del triángulo: ");
                    double areaTriangulo = calcularareatriangulo(base, altura);
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case "s":
                case "S":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (!(opcion.equals("s") || opcion.equals("S")));
    }
}