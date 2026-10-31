/**
 * Autor: Katya Valentina Grifaldo Martinez
 * Fecha: 30/10/2026
 * Descripción: Verifica de forma recursiva si una cadena es palíndromo,
 * ignorando mayúsculas, espacios y signos.
 */

public class Palindromo {

    public static boolean esPalindromo(String texto) {
        String limpio = texto.toLowerCase().replaceAll("[^\\p{L}\\p{N}]", "");
        return verificar(limpio, 0, limpio.length() - 1);
    }

    private static boolean verificar(String s, int izq, int der) {
        if (izq >= der) {
            return true;
        }
        if (s.charAt(izq) != s.charAt(der)) {
            return false;
        }
        return verificar(s, izq + 1, der - 1);
    }

    public static void main(String[] args) {
        String[] pruebas = {"reconocer", "casa", "Anita lava la tina", "", "a"};
        for (String p : pruebas) {
            System.out.println("\"" + p + "\" -> " + esPalindromo(p));
        }
    }
}