package Ejercicio2MovilYComponentes;

public class Movil {
    private Pantalla pantalla;
    private Bateria bateria;
    private Procesador procesador;

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public void mostrarDetalles() {
        System.out.println("Pantalla: " + pantalla.getTamanio() + " pulgadas");
        System.out.println("Batería: " + bateria.getCapacidad() + " mAh");
        System.out.println("Procesador: " + procesador.getVelocidad() + " GHz");
    }
}
