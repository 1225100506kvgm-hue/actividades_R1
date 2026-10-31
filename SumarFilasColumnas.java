/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Calcula la suma de cada fila y de cada columna de una matriz.
 */

import java.util.Arrays;

public class SumarFilasColumnas {

    public static int[] sumaFilas(int[][] m) {
        int[] res = new int[m.length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                res[i] += m[i][j];
            }
        }
        return res;
    }

    public static int[] sumaColumnas(int[][] m) {
        if (m.length == 0) return new int[0];
        int[] res = new int[m[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                res[j] += m[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][][] pruebas = {
            {{1, 2, 3}, {4, 5, 6}},        
            {{5}},                         
            {{-1, 2}, {3, -4}, {0, 0}}     
        };
        for (int[][] m : pruebas) {
            System.out.println("Matriz: " + Arrays.deepToString(m));
            System.out.println("  Filas:    " + Arrays.toString(sumaFilas(m)));
            System.out.println("  Columnas: " + Arrays.toString(sumaColumnas(m)));
        }
    }
}