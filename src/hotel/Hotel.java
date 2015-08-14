
package hotel;

public class Hotel {
    Huesped[][] pasajeros;

    public Hotel(int piso, int habitacion) {
        pasajeros = new Huesped[habitacion][habitacion];
    }
    
    public void setHuesped(Huesped pasajero){
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if(pasajeros[i][j] == null){
                    pasajeros[i][j] = pasajero;
                    return;
                }
            }
        }
    }

    public String huespedMayorImporte(){
        String nombre = new String();
        float mayor = 0;
        for (int i = 0; i < pasajeros.length; i++) {
            for (int j = 0; j < pasajeros[i].length; j++) {
                if(pasajeros[i][j] != null && pasajeros[i][j].getImporte() > mayor){
                    mayor = pasajeros[i][j].getImporte();
                    nombre = pasajeros[i][j].getNombre();
                }
            }
            
        }
        return nombre;
    }
    
}
