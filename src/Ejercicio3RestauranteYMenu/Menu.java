package Ejercicio3RestauranteYMenu;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Plato> platos;

        public Menu() {
            this.platos = new ArrayList<>();
        }

        public void agregarPlato(String nombre, double precio) {
            platos.add(new Plato(nombre, precio));
        }

        public void mostrarMenu() {
            for (Plato plato : platos) {
                System.out.println(plato.getNombre() + " - " + plato.getPrecio());
            }
        }
}
