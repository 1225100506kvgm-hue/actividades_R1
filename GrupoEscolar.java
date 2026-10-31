/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Grupo escolar parametrizado. T es el tipo de integrante
 */

import java.util.ArrayList;

public class GrupoEscolar<T> {

    private String nombre;
    private ArrayList<T> integrantes = new ArrayList<>();

    public GrupoEscolar(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(T integrante) {
        integrantes.add(integrante);
    }

    public boolean eliminar(T integrante) {
        return integrantes.remove(integrante);
    }

    public int tamano() {
        return integrantes.size();
    }

    public boolean estaVacio() {
        return integrantes.isEmpty();
    }

    @Override
    public String toString() {
        return "Grupo " + nombre + " (" + tamano() + "): " + integrantes;
    }

    public static void main(String[] args) {
        GrupoEscolar<String> g1 = new GrupoEscolar<>("3A");
        g1.agregar("Ana");
        g1.agregar("Luis");
        g1.agregar("María");
        System.out.println(g1);
        g1.eliminar("Luis");
        System.out.println(g1);

        GrupoEscolar<Integer> g2 = new GrupoEscolar<>("Matrículas");
        g2.agregar(1001);
        System.out.println(g2);

        GrupoEscolar<String> vacio = new GrupoEscolar<>("Nuevo");     
        System.out.println(vacio + " | ¿vacío? " + vacio.estaVacio());
        System.out.println("Eliminar inexistente: " + vacio.eliminar("Nadie"));
    }
}