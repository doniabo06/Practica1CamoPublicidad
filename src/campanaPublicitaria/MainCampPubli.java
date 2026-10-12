package campanaPublicitaria;

public class MainCampPubli {
    static void main() {

        campania cam1 = new campania();
        campania cam2 = new campania();
        campania cam3 = new campania();

        // Campaña 1
        cam1.nombre = "Campaña NIKE";
        cam1.presupuesto = 1500;
        cam1.plataforma = "Instagram";
        cam1.activa = false;


        // Campaña 2
        cam2.nombre = "Campaña Adidas";
        cam2.presupuesto = 1400;
        cam2.plataforma = "TikTok";
        cam2.activa = false;


        // Campaña 3
        cam3.nombre = "Campaña Puma";
        cam3.presupuesto = 1000;
        cam3.plataforma = "Facebook";
        cam3.activa = false;

        // Mostrar antes del cambio
        cam1.mostrarInformacion();
        System.out.println();
        cam2.mostrarInformacion();
        System.out.println();
        cam3.mostrarInformacion();
        System.out.println();



        // Cambiar estado de una campaña
        cam1.activar();

        // Mostrar producto despues del cambio

        cam1.mostrarInformacion();
        System.out.println();
        cam2.mostrarInformacion();
        System.out.println();
        cam3.mostrarInformacion();

    }

}

  /*
  ¿Por qué activar una campaña no modifica las demá?
  No se modifica porque al usar new se genera un espacio independiente
  en la memoria, lo que hace que cada objeto tenga su propia compia de
  los atributos. asi que cuado se llama al metodo en un objeto espcifico
  unicamente cambia es objeto el resto sigue sien lo mismo.
   */