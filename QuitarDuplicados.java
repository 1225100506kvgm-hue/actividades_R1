/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Devuelve un nuevo arreglo sin elementos repetidos,
 * conservando el orden de la primera aparición.
 */
import java.util.Arrays;

public class QuitarDuplicados {

    public static int[] quitarDuplicados(int[] a) {
        int[] temp = new int[a.length];
        int tamano = 0;
        for (int valor : a) {
            if (!contiene(temp, tamano, valor)) {
                temp[tamano++] = valor;
            }
        }
        return Arrays.copyOf(temp, tamano);   
    }

    private static boolean contiene(int[] arr, int tamano, int valor) {
        for (int i = 0; i < tamano; i++) {
            if (arr[i] == valor) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] pruebas = {{1, 2, 2, 3, 1}, {4, 4, 4}, {1, 2, 3}, {}};
        for (int[] p : pruebas) {
            System.out.println(Arrays.toString(p) + " -> " + Arrays.toString(quitarDuplicados(p)));
        }
    }
}