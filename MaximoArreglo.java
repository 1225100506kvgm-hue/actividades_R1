/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Encuentra recursivamente el valor máximo de un arreglo de enteros.
 */

public class MaximoArreglo {

    public static int maximo(int[] a) {
        if (a.length == 0) {
            throw new IllegalArgumentException("El arreglo está vacío");
        }
        return maximo(a, a.length);
    }

    private static int maximo(int[] a, int n) {
        if (n == 1) {                       
            return a[0];
        }

        return Math.max(a[n - 1], maximo(a, n - 1));
    }

    public static void main(String[] args) {
        int[][] pruebas = {{3, 9, 2, 7}, {5}, {-4, -1, -8}, {}};
        for (int[] p : pruebas) {
            try {
                System.out.println(java.util.Arrays.toString(p) + " -> " + maximo(p));
            } catch (IllegalArgumentException e) {
                System.out.println(java.util.Arrays.toString(p) + " -> Error: " + e.getMessage());
            }
        }
    }
}