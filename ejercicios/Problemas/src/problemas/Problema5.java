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
public class Problema5 {
    public static void main(String[] args) {
        
        int suma;
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        
        suma = suma(informacion);
        System.out.printf("La suma total del arreglo es:\n%d\n", suma);
    }
    
    public static int suma(int[][] a) {
        int suma = 0;
        
        for (int fila = 0; fila < a.length; fila++) {
            for (int col = 0; col < a[0].length; col++) {
                suma = suma + a[fila][col];        
            }
        }
        return suma;
    }

}

