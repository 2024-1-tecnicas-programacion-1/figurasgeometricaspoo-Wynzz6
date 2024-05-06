
package com.mycompany.figurasgeometricaspoo;
    import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = scanner.nextLine();

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipo = scanner.nextInt();

        FiguraGeometrica figura;

        switch (tipo) {
            case 1 -> {
                System.out.println("Ingrese el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                figura = new Circulo(nombre, color, radioCirculo);
            }
            case 2 -> {
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1Rectangulo = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2Rectangulo = scanner.nextDouble();
                figura = new Rectangulo(nombre, color, lado1Rectangulo, lado2Rectangulo);
            }
            case 3 -> {
                System.out.println("Ingrese el valor de la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                figura = new Triangulo(nombre, color, baseTriangulo, alturaTriangulo);
            }
            default -> {
                System.out.println("La opción no válida.");
                return;
            }
        }

        System.out.println("Área de la figura: " + figura.obtenerArea());
        System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
    }
}

