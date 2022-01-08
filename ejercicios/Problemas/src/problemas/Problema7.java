/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema7 {

public static void main(String[] args) {
        String[] ciudades = {};
        ciudades = obtenerArreglo();
    }

    public static String[] obtenerArreglo() {
        Scanner entrada = new Scanner(System.in);
        int cantidad;
        
        System.out.println("Escribir el numero de elementos que quiera ingresar: ");
        cantidad = entrada.nextInt();
        
        
        String[] datos = new String[cantidad];
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingrese una ciudad del Ecuador: ");
            datos[i] = entrada.nextLine();
        }
        return datos;
    }
    public static void caracteres(String []a) {
        int cantidad = 0;
        String cadena = "";
        for (int i = 0; i < a.length; i++) {
        if (cantidad == 4 || cantidad == 5){
        cadena = String.format("%s %s", cadena, a[i]);
        }
        }
    
        
    }
}
