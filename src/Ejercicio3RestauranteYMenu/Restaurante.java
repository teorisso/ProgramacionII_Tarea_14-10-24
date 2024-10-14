package Ejercicio3RestauranteYMenu;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private Menu menu;

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.menu = new Menu();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPlato(Plato plato) {
        menu.agregarPlato(plato.getNombre(), plato.getPrecio());
    }

    public void mostrarMenu() {
        menu.mostrarMenu();
    }
}
