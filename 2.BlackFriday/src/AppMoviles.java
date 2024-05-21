import java.util.ArrayList;
import java.util.Scanner;

public class AppMoviles {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        ArrayList<Moviles> tienda = new ArrayList<>();

        tienda.add(new Moviles("iPhone", "15 Pro Max", 1309.00));
        tienda.add(new Moviles("Samsung", "Galaxy S22 Ultra", 1249.99));
        tienda.add(new Moviles("Google", "Pixel 6 Pro", 899.99));
        tienda.add(new Moviles("Xiaomi", "Mi 11 Ultra", 1199.99));
        tienda.add(new Moviles("OnePlus", "10 Pro", 969.99));
        tienda.add(new Moviles("Oppo", "Find X5 Pro", 1099.99));
        int opcion = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println();
            System.out.println("Que quieres hacer?");
            System.out.println();
            System.out.println("1.Mostrar precios\n2.Aplicar descuento blackFriday\n3.Quitar descuento actual.\n0.Salir");
            System.out.print("Opcion: ");
            opcion = MetodosMoviles.validarInt(scan);
            System.out.println();

            switch (opcion) {
                case 1:
                    MetodosMoviles.mostrarMoviles(tienda);
                    break;
                case 2:
                    MetodosMoviles.aplicarDescuento(scan);
                    break;
                case 3:
                    MetodosMoviles.quitarDescuento(scan);
                    break;
                case 0:
                    salir=true;
                    break;

                default:
                    System.out.println("No es una opción valida. Vuelve a probar.");
                    break;
            }
        }

       

    }
}

// En tu tienda online de teléfonos móviles y decides ofrecer un 20% de
// descuento en todos tus productos.
// Instancia algunos móviles para probar.
// El descuento se aplica en todos, (static) así que debes poder mostrar el
// precio antiguo y el precio con descuento.
// +EXTRA: posibilidad de anular el descuento a todos los productos después del
// Black Friday, mediante método a tal propósito.