package cuponDescuento;

public class cupon {

    public String codigo;
    public double porcentajeDescuento;

    // Atributos con acceso por defecto
    String descripcion;
    boolean activo;


    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        String estado = activo ? "Activo" : "Inactivo";
        System.out.println("Estado: " + estado);
    }

    public void activar() {
        if (activo == false) {
            activo = true;
            System.out.println("El cupón " + codigo + " ha sido activado.");
        } else {
            System.out.println("El cupón " + codigo + " ya estaba activo.");
        }
    }

    void desactivar() {
        if (activo == true) {
            activo = false;
            System.out.println("El cupón " + codigo + " ha sido desactivado.");
        } else {
            System.out.println("El cupón " + codigo + " ya estaba inactivo.");
        }
    }

    void mostrarDescuento() {
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
    }


    void mostrarResumen() {
        System.out.println("Cupón " + codigo + " - Descuento " + (int)porcentajeDescuento + "%");
    }

}
