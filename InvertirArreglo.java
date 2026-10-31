/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Invierte un arreglo de enteros "in place" intercambiando
 * elementos simétricos con dos índices.
 */

import java.util.Arrays;

public class InvertirArreglo {

    public static void invertir(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[][] pruebas = {
            {1, 2, 3, 4, 5}, 
            {1, 2, 3, 4},    
            {7},               
            {}                 
        };
        for (int[] arr : pruebas) {
            String antes = Arrays.toString(arr);
            invertir(arr);
            System.out.println(antes + " -> " + Arrays.toString(arr));
        }
    }
}