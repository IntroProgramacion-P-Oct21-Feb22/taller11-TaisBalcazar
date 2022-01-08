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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[] nota = new double[4];
        String cadena = "";
        String cualitativo = "";

        for (int a = 0; a < nota.length; a++) {
            System.out.println("Ingrese las notas");
            nota[a] = entrada.nextDouble();
            cadena = String.format("%s %.2f",cadena, nota[a]);
        }

        cualitativo = obtenerNotas(nota);
        System.out.printf("El promedio de las notas: %s es %s\n"
                , cadena
                , cualitativo);

    }

    public static String obtenerNotas(double[] notas) {
        double promedio;
        double suma = 0;
        String cualitativa = "";

        for (int a = 0; a < notas.length; a++) {

            suma = suma + notas[a];
        }

        promedio = suma / notas.length;

        if (promedio >= 0 && promedio < 5) {
            cualitativa = "Regular";
        } else {
            if (promedio >= 5 && promedio < 8) {
                cualitativa = "Bueno";
            } else {
                if (promedio >= 8 && promedio < 9) {
                    cualitativa = "Muy Bueno";
                } else {
                    if (promedio >= 9 && promedio <= 10) {
                        cualitativa = "Sobresaliente";
                    }
                }
            }
        }
        return cualitativa;

    }
}
