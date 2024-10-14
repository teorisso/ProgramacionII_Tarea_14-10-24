package Ejercicio1EdificioYPisos;
/*
Ejercicio 1: Edificio y Pisos
Crea un sistema que modele un edificio con varios pisos.
La clase Edificio debe contener varios objetos de tipo Piso.
Un Piso no puede existir sin estar asociado a un Edificio.
Cada Piso tiene un número y una cantidad de departamentos.
El Edificio debe permitir agregar pisos y mostrar los detalles completos del edificio con todos sus pisos.
Objetivos:
Implementa la relación que corresponde entre Edificio y Piso.
Crea un método para agregar pisos a un edificio.
Muestra la lista completa de los pisos de un edificio con sus detalles.

 */
public class Main {

    public static void main(String[] args) {
        Edificio edificio = new Edificio();
        edificio.agregarPiso(new Piso(1, 4));
        edificio.agregarPiso(new Piso(2, 4));
        edificio.agregarPiso(new Piso(3, 4));
        edificio.mostrarDetalles();
    }
}
