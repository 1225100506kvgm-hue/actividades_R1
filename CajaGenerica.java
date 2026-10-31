/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Clase parametrizada que guarda un elemento de cualquier
 * tipo T, con operaciones para guardar, obtener y vaciar.
 */

public class CajaGenerica<T> {

    private T contenido;

    public CajaGenerica() {
        this.contenido = null;
    }

    public CajaGenerica(T contenido) {
        this.contenido = contenido;
    }

    public void guardar(T contenido) {
        this.contenido = contenido;
    }

    public T obtener() {
        return contenido;
    }

    public boolean estaVacia() {
        return contenido == null;
    }

    public void vaciar() {
        contenido = null;
    }

    @Override
    public String toString() {
        return estaVacia() ? "Caja vacía" : "Caja con: " + contenido;
    }

    public static void main(String[] args) {
        CajaGenerica<Integer> cajaInt = new CajaGenerica<>(42);
        CajaGenerica<String> cajaTexto = new CajaGenerica<>("Hola");
        CajaGenerica<Double> cajaVacia = new CajaGenerica<>();   

        System.out.println(cajaInt);
        System.out.println(cajaTexto);
        System.out.println(cajaVacia);

        cajaVacia.guardar(3.14);
        System.out.println(cajaVacia);
        cajaVacia.vaciar();
        System.out.println(cajaVacia.estaVacia());
    }
}