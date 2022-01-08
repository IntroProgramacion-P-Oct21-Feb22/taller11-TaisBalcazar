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
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombre;
        String cedula;
        int opcion;

        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su cedula");
        cedula = entrada.nextLine();
        System.out.println("Ingrese 1 para calcular el valor de la planilla de luz o "
                + "Ingrese 2 para calcular el predio del inmueble");
        opcion = entrada.nextInt();

        if (opcion == 1) {
            calcularValorLuz(nombre, cedula);
        } else {
            if (opcion == 2) {
                calcularPredio(nombre, cedula);
            } else {
                System.out.println("Opcion incorrecta");
            }

        }
    }

    public static void calcularValorLuz(String a, String b) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valor_kilovatio;
        double numero_kilovatio;
        double multiplicacion;
        String cadena = "";

        System.out.println("Ingrese el valor del kilovatio");
        valor_kilovatio = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilovatios consumidos");
        numero_kilovatio = entrada.nextDouble();

        multiplicacion = (valor_kilovatio * numero_kilovatio);

        cadena = String.format("%s\nCliente %s con cédula %s, debe cancelar el "
                + "valor de $%.2f\n",
                cadena,
                a,
                b,
                multiplicacion);
        System.out.printf("%s", cadena);

    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double valor_inmueble;
        String cadena = "";
        double p;

        System.out.println("Ingrese el valor del inmueble");
        valor_inmueble = entrada.nextDouble();

        p = (valor_inmueble * 0.02);

        cadena = String.format("%s\nCliente %s con cédula %s,tiene que pagar de "
                + "predio de  $%.2f",
                cadena,
                a,
                b,
                p);
        System.out.printf("%s", cadena);

    }
}
