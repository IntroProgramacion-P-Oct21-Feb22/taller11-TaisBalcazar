/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        int[] informacion = {10, 20, 30, 40, 50, 100};
        int valorBuscar = 140;
        boolean bandera = buscarDato(informacion, valorBuscar);
        if (bandera) {
            System.out.printf("El valor %d fue encontrado\n", valorBuscar);
        } else {
            System.out.printf("El valor %d no fue encontrado\n", valorBuscar);
        }

    }

    public static boolean buscarDato(int[] datos, int datoBuscar) {
        boolean valor = false;
        for (int i = 0; i < datos.length; i++) { // 0<6 v //1<6 v // 2<6 v // 3<6 v // 4<6 v // 5<6 v // 6<6 v
            if (datos[i] == datoBuscar) { //datos[0] == 140 // 10 == 140 // falso
                                          //datos[1] == 140 // 20 == 140 // falso
                                          //datos[2] == 140 // 30 == 140 // falso
                                          //datos[3] == 140 // 40 == 140 // falso
                                          //datos[4] == 140 // 50 == 140 // falso
                                          //datos[5] == 140 // 100 == 140 // falso
                valor = true;
            }
        }
        return valor;
    }

}
