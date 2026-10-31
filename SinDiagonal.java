/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Recibe una matriz y devuelve una copia con la diagonal
 * principal (i == j) reemplazada por ceros.
 */

public class SinDiagonal {

    public static int[][] sinDiagonal(int[][] m) {
        int[][] copia = new int[m.length][];
        for (int i = 0; i < m.length; i++) {
            copia[i] = new int[m[i].length];
            for (int j = 0; j < m[i].length; j++) {
                copia[i][j] = (i == j) ? 0 : m[i][j];
            }
        }
        return copia;
    }

    private static void imprimir(int[][] m) {
        for (int[] fila : m) {
            System.out.println(java.util.Arrays.toString(fila));
        }
    }

    public static void main(String[] args) {
        int[][][] pruebas = {
            {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},   
            {{1, 2}, {3, 4}},                   
            {{9}}                                
        };
        for (int[][] m : pruebas) {
            System.out.println("Original:");
            imprimir(m);
            System.out.println("Sin diagonal:");
            imprimir(sinDiagonal(m));
            System.out.println();
        }
    }
}