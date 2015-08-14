package hotel;

import java.util.Arrays;

public class Hotel {

    Huesped[][] pasajeros;

    public Hotel(int pisos, int habitaciones) {
        pasajeros = new Huesped[pisos][habitaciones];
    }

    public void setHuesped(Huesped pasajero) {
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if (pasajeros[i][j] == null) {
                    pasajeros[i][j] = pasajero;
                    return;
                }
            }
        }
    }

    public String huespedMayorImporte(int ciudadDeOrigen) {
        String nombre = new String();
        float mayor = 0;
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if (pasajeros[i][j] != null && pasajeros[i][j].getCiudad() == ciudadDeOrigen
                        && pasajeros[i][j].getImporte() > mayor) {
                    mayor = pasajeros[i][j].getImporte();
                    nombre = pasajeros[i][j].getNombre();
                }
            }

        }
        return nombre;
    }

    public float importeTotalPorServicio(int tipoDeServicio) {
        float total = 0;
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if (pasajeros[i][j] != null && pasajeros[i][j].getTipoServicio() == tipoDeServicio) {
                    total += pasajeros[i][j].getImporte();
                }
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if (pasajeros[i][j] != null) {
                    str.append("Piso[").append(i+1).append("]");
                    str.append("-Habitacion[").append(j+1).append("]-");
                    str.append(pasajeros[i][j].toString()).append("\n");
                }

            }
        }
        return str.toString();
    }

}
