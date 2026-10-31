/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Convierte un entero decimal no negativo a binario de forma recursiva.
 */

public class DecimalABinario {

    public static String aBinario(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Solo se aceptan números no negativos");
        }
        if (n < 2) {                       
            return String.valueOf(n);
        }

        return aBinario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int[] pruebas = {10, 1, 255, 0, 2};
        for (int n : pruebas) {
            System.out.println(n + " -> " + aBinario(n));
        }
    }
}