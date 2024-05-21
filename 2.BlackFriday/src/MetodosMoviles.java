import java.util.ArrayList;
import java.util.Scanner;

public class MetodosMoviles {
    static void imprimir(String frase, int enter, int sleep) {
        try {
            for (int i = 0; i < frase.length(); i++) {
                System.out.print(frase.charAt(i));
                if (sleep == 1) {
                    Thread.sleep(20);
                }

            }
            if (enter == 1) {
                System.out.println(" ");
            }

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static int validarInt(Scanner scan) {
        boolean validar = false;
        int valor = 0;
        while (!validar) {

            if (scan.hasNextInt()) {
                validar = true;
                valor = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.print("Introduce un valor con formato válido:");
                scan.next();
            }

        }
        return valor;
    }


    public static void mostrarMoviles (ArrayList<Moviles> array){
        for (Moviles movil : array) {
            System.out.println(movil);
        }
        System.out.println();
    }

    public static void aplicarDescuento (Scanner scan){
        System.out.println();
        System.out.print("¿Que descuento quieres aplicar? ");
        int descuento = validarInt(scan);
        Moviles.setDescuento(descuento);
        System.out.println("Descuento de un "+descuento+"% aplicado con exito.");
        System.out.println();

    }
    public static void quitarDescuento (Scanner scan){
        System.out.println();
        System.out.print("¿Estas seguro de quitar todos los descuentos? Responde si para eliminar: ");
        String respuesta = scan.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            int descuento = 0;
            Moviles.setDescuento(descuento);
            System.out.println("Descuento eliminado con exito.");

        }
        else{
            System.out.println("Uff! Casi lo eliminamos pero no has confirmado. El descuento sigue siendo del "+Moviles.getDescuento()+"%");

        }
    }
}
