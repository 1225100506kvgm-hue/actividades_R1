/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Cuenta recursivamente las vocales de una cadena
 */

public class ContarVocales {

    public static int contar(String s) {
        return contar(s, 0);
    }

    private static int contar(String s, int i) {
        if (i == s.length()) {              
            return 0;
        }
        int actual = esVocal(s.charAt(i)) ? 1 : 0;
        return actual + contar(s, i + 1);   
    }

    private static boolean esVocal(char c) {
        return "aeiouáéíóúü".indexOf(Character.toLowerCase(c)) != -1;
    }

    public static void main(String[] args) {
        String[] pruebas = {"murcielago", "xyz", "AEIOU", "", "Dolores Hidalgo"};
        for (String p : pruebas) {
            System.out.println("\"" + p + "\" -> " + contar(p));
        }
    }
}