
package hotel;

public class Huesped {
    private String nombre;
    private int ciudad;
    private int diasHospedaje;
    private float importe;
    private int tipoServicio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCiudad() {
        return ciudad;
    }

    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }

    public int getDiasHospedaje() {
        return diasHospedaje;
    }

    public void setDiasHospedaje(int diasHospedaje) {
        this.diasHospedaje = diasHospedaje;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(int tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    @Override
    public String toString() {
        return "Huesped{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", diasHospedaje=" + diasHospedaje + ", importe=" + importe + ", tipoServicio=" + tipoServicio + '}';
    }
    
    
}
