package campanaPublicitaria;

public class campania {

    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("El presupuesto es de: "+presupuesto);
        System.out.println("La plataforma es: " +plataforma);
        String estado = activa ? " está activa " : " está inactiva ";
        System.out.println("El estado es: " +estado);
    }

    public void activar(){
        if (activa == false) {
            activa = true;
            System.out.println("Se ha activado ");
        }
        else {
            System.out.println("Ya estaba activa ");
        }
    }

    void desactivar(){
        if (activa == true) {
            activa = false;
            System.out.println("Se ha desactivado ");
        }
        else {
            System.out.println("Ya estaba desactiva ");
        }
    }

    void mostrarPresupusto(){
        System.out.println("El presupesto de " +nombre + "es: "+presupuesto);
    }

}
