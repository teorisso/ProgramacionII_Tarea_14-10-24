package Ejercicio3RestauranteYMenu;
import java.util.ArrayList;
import java.util.List;

/*
Ejercicio 3: Restaurante y Menú
Crea un sistema de gestión para un restaurante y su menú.
La clase Restaurante debe contener un objeto de tipo Menú.
Un Menú no puede existir sin estar asociado a un Restaurante.
El Menú debe tener una lista de Platos, y cada plato debe tener un nombre y un precio.
El Restaurante debe permitir agregar platos al menú y mostrar los detalles del menú completo.
Objetivos:
Implementa la relación considere entre Restaurante y Menú.
Permite agregar platos al menú del restaurante.
Crea un método para mostrar el menú con todos los platos y sus precios.

 */
public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("El Perro");

        System.out.println("Menu de " + restaurante.getNombre());
        restaurante.agregarPlato(new Plato("Pizza Margarita", 5000));
        restaurante.agregarPlato(new Plato("Hamburguesa", 7000));
        restaurante.agregarPlato(new Plato("Birra", 3000));
        restaurante.mostrarMenu();
    }
}
