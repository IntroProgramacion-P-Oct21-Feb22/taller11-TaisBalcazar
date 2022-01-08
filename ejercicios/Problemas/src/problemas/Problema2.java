/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author TaisBalcazar
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;

        System.out.println("Ingrese la base");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura");
        altura = entrada.nextDouble();

        System.out.println("Ingrese 1 para obtener el area del cuadrado.\n"
                + "Ingrese 2 para obtener el area de un triangulo. \n"
                + "Ingrese 3 para obtener el area del rectangulo.");

        int tipo = entrada.nextInt();
        if (tipo == 1) {
            obtenerAreaCuadrado(base, altura);
        } else {
            if (tipo == 2) {
                obtenerAreaTriangulo(base, altura);
            } else {
                if (tipo == 3) {
                    obtenerAreaRectangulo(base, altura);
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
        }

    }

    public static void obtenerAreaCuadrado(double base, double altura) {

        double area;

        area = base * altura;
        System.out.printf("El del cuadrado es: %.2f\n", area);
    }

    public static void obtenerAreaTriangulo(double base, double altura) {

        double area;

        area = (base * altura) / 2;
        System.out.printf("El del triangulo es: %.2f\n", area);
    }

    public static void obtenerAreaRectangulo(double base, double altura) {

        double area;

        area = base * altura;
        System.out.printf("El del rectangulo es: %.2f\n", area);
    }
}
