/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {
    public static void main(String[] args) {
        
        double media;
        double desviacion;
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        media = mediaAritmetica(informacion);
        desviacion = obtenerDesviacion(informacion, media);
        
        System.out.printf("El valor de la media es: %.2f\n"
                + "El valor de la desviación estándar es: %.2f\n"
                , media
                , desviacion);
    }

    public static double mediaAritmetica(int[] a) {
        int suma = 0;
        int media;
        
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        media = suma / a.length;
        return media;
    }

    public static double obtenerDesviacion(int[] a, double b) {
        double suma = 0;
        double desviacion;
        
        for (int i = 0; i < a.length; i++) {
            suma = suma + Math.pow((a[i]-b), 2);
        }
        desviacion = suma / a.length;
        return desviacion;
    }
    
}
