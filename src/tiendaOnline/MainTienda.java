package tiendaOnline;

public class MainTienda {
    static void main() {
        producto pr1 = new producto();
        producto pr2 = new producto();
        producto pr3 = new producto();

        // Asignación de datos a pr1
        pr1.nombre = "Audífonos Bluetooth";
        pr1.precio = 32.50;
        pr1.categoria = "Tecnología";
        pr1.disponible = true;

        // Asignación de datos a pr2
        pr2.nombre = "Teclado Mecánico";
        pr2.precio = 65.00;
        pr2.categoria = "Accesorios";
        pr2.disponible = true;

        // Asignación de datos a pr3
        pr3.nombre = "Mouse Gamer";
        pr3.precio = 25.00;
        pr3.categoria = "Accesorios";
        pr3.disponible = false;

        // Mostrar información de los productos
        pr1.mostrarInformacion();
        pr2.mostrarInformacion();
        pr3.mostrarInformacion();

        // Prueba sugerida: cambiar disponibilidad de pr1
        pr1.cambiarDisponibilidad(false);

        // Comprobación de métodos con acceso por defecto
        pr1.mostrarPrecio();
        pr1.mostrarDisponibilidad();
    }
}
