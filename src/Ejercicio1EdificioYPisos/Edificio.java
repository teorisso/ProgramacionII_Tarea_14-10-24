package Ejercicio1EdificioYPisos;

public class Edificio {
    private Piso[] pisos = new Piso[0];

    public void agregarPiso(Piso piso) {
        Piso[] temp = new Piso[pisos.length + 1];
        for (int i = 0; i < pisos.length; i++) {
            temp[i] = pisos[i];
        }
        temp[temp.length - 1] = piso;
        pisos = temp;
    }

    public void mostrarDetalles() {
        for (Piso piso : pisos) {
            System.out.println("Piso: " + piso.getNumero() + " - Departamentos: " + piso.getDepartamentos());
        }
    }
}
