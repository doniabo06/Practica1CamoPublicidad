package tiendaOnline;

public class producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void mostrarInformacion(){
        System.out.println("El nombre del producto es: " + nombre);
        System.out.println("El precio es: $" + precio);
        System.out.println("Su categoria es: " +categoria);
        mostrarDisponibilidad();

    }

    public void cambiarDisponibilidad (boolean nuevaDisponibilidad){
        if (disponible == nuevaDisponibilidad){
            System.out.println(nombre+ " ya esta disponible");
        }
        else{
            System.out.println("Diponibilidad del producto: " +nombre + "actualizado a: "+disponible);
        }

    }

    void mostrarPrecio(){
        System.out.println("El precio de" +nombre +" es: " +precio);
    }
    void mostrarDisponibilidad(){
        String estado = disponible ? "Disponible" : "Agotado ";
        System.out.println("El estado es: " + estado);
    }
}
