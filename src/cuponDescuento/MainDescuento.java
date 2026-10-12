package cuponDescuento;

public class MainDescuento {
    static void main() {
        cupon cup1 = new cupon();
        cupon cup2 = new cupon();
        cupon cup3 = new cupon();

        // Asignación de datos a cup1
        cup1.codigo = "VERANO20";
        cup1.porcentajeDescuento = 20.0;
        cup1.descripcion = "Descuento de temporada de verano";
        cup1.activo = true;

        // Asignación de datos a cup2
        cup2.codigo = "BIENVENIDA10";
        cup2.porcentajeDescuento = 10.0;
        cup2.descripcion = "Descuento por primera compra";
        cup2.activo = false;

        // Asignación de datos a cup3
        cup3.codigo = "BLACKFRIDAY50";
        cup3.porcentajeDescuento = 50.0;
        cup3.descripcion = "Descuento especial fin de año";
        cup3.activo = false;

        // Mostrar información de los cupones
        cup1.mostrarInformacion();
        cup2.mostrarInformacion();
        cup3.mostrarInformacion();

        // Prueba sugerida: cambiar el estado de cup1 y cup2
        cup1.desactivar();
        cup2.activar();

        // Comprobación de métodos con acceso por defecto (y desafío)
        cup1.mostrarDescuento();
        cup1.mostrarResumen();
    }
}
