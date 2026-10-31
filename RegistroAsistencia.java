/**
 * Autor: Katya Valentina Grifaldo Martínez
 * Fecha: 30/10/2026
 * Descripción: Registro de asistencia parametrizado. T es el tipo de
 * identificador del alumno (nombre, matrícula, etc.).
 * No permite registrar dos veces al mismo alumno.
 */

import java.util.ArrayList;

public class RegistroAsistencia<T> {

    private ArrayList<T> presentes = new ArrayList<>();

    public boolean registrar(T alumno) {
        if (alumno == null || presentes.contains(alumno)) {
            return false;                   
        }
        presentes.add(alumno);
        return true;
    }

    public boolean asistio(T alumno) {
        return presentes.contains(alumno);
    }

    public int total() {
        return presentes.size();
    }

    @Override
    public String toString() {
        return "Asistentes (" + total() + "): " + presentes;
    }

    public static void main(String[] args) {
        RegistroAsistencia<String> porNombre = new RegistroAsistencia<>();
        porNombre.registrar("Ana");
        porNombre.registrar("Luis");
        System.out.println(porNombre);
        System.out.println("Duplicado: " + porNombre.registrar("Ana")); 
        System.out.println("¿Asistió Luis? " + porNombre.asistio("Luis"));

        RegistroAsistencia<Integer> porMatricula = new RegistroAsistencia<>();
        porMatricula.registrar(1001);
        porMatricula.registrar(1002);
        System.out.println(porMatricula);

        RegistroAsistencia<String> vacio = new RegistroAsistencia<>();   
        System.out.println(vacio);
    }
}