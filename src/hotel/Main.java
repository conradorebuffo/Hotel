
package hotel;

public class Main {

    public static void main(String[] args) {
        int pisos = 5;
        int habitaciones = 10;
        Hotel hotel = new Hotel(pisos, habitaciones);
        
        Aleatorio ale = new Aleatorio();
        
        for (int i = 0; i < pisos * habitaciones; i++) {
            Huesped hues = new Huesped();
            hues.setNombre(ale.randomStringNom());
            hues.setTipoServicio(ale.randomIntTipoServicio());
            hues.setDiasHospedaje(ale.randomIntDias());
            hues.setCiudad(ale.randomIntCiudad());
            hues.setImporte(ale.randomIntImporte());
            hotel.setHuesped(hues);
        }
        
        System.out.println(hotel.toString());
        System.out.println("Huesped Mayor importe de Rosario(1):");
        System.out.println(hotel.huespedMayorImporte(1));
        System.out.println("Ingresos de huespedes con Pension Completa (0)");
        System.out.println(hotel.importeTotalPorServicio(0));
    }

}




/*
Un hotel recibe huéspedes de distintos puntos del país. Los analistas han
identificado las siguientes clases:

Clase Huésped

      Nombre del huésped

      Ciudad de origen (0: Buenos Aires – 1:Rosario – 2:Mendoza).

      Cantidad de días que se va a hospedar.

      Importe a abonar por los días  de hospedaje.

      Tipo de servicio: (0:pensión completa – 1:media pensión – 2:solo desayuno –
                        3:solo habitación )

(realice los métodos que considere necesarios).

Clase Hotel

Que carga los datos de los huéspedes en una matriz . Las instancias de dicha clase
exhiben el comportamiento necesario para brindar la siguiente información:

      Registra los datos de los huéspedes por orden de llegada.

      Determinar el nombre del huésped que mayor importe haya abonado y que sea
      de Rosario.

      Determinar el importe total obtenido por el hotel en huéspedes con pensión
        completa.
*/