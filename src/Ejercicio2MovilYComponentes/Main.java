package Ejercicio2MovilYComponentes;
/*
Ejercicio 2: Móvil y Componentes
Desarrolla un sistema para modelar un teléfono móvil con varios componentes.
La clase Móvil debe contener objetos de tipo Pantalla, Batería y Procesador.
Cada componente debe ser parte integral del móvil y no puede existir sin él.
La Pantalla tiene un tamaño, la Batería tiene una capacidad en mAh, y el Procesador tiene una velocidad en GHz.
El Móvil debe permitir mostrar los detalles de todos sus componentes.
Objetivos:
Implementa la relación que corresponde entre Móvil y los componentes Pantalla, Batería, y Procesador.
Permite configurar un móvil con sus componentes.
Crea un método que muestre los detalles completos del móvil y sus componentes.
 */
public class Main {

        public static void main(String[] args) {

            Movil movil = new Movil();

            System.out.println("Samsung S20 FE");
            movil.setPantalla(new Pantalla(6.5));
            movil.setBateria(new Bateria(4370));
            movil.setProcesador(new Procesador(2.8));
            movil.mostrarDetalles();

            System.out.println("-----------------");

            System.out.println("Samsung S21");
            movil.setPantalla(new Pantalla(7));
            movil.setBateria(new Bateria(4500));
            movil.setProcesador(new Procesador(3.2));
            movil.mostrarDetalles();
        }

}
