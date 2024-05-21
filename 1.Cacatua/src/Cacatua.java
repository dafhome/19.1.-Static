import java.util.Scanner;

public class Cacatua {
    private static int cantidadMinimaCacahuete = 100;
    private static final String nombre = "Juana";
    private static final String FRASE = "La cacatua "+nombre+" dice: ¡Cacatúa cacahuetes! y lo mínimo para que se calle son "+cantidadMinimaCacahuete+" cacahuetes.";
    private static final String PREGUNTA = "Que comida quieres darle a la cacatua? ";
    private static final String SEPARADOR = "------------------------------------------------------";
    public static String getAlimento (Scanner scan) {
        Method.imprimir(FRASE, 1, 1);
        Method.imprimir(SEPARADOR, 1, 0);
        Method.imprimir(PREGUNTA, 0, 1);
        String respuesta = scan.nextLine();
        System.out.println();
        return respuesta;
    }

    public static void restaCacahuete (){
        cantidadMinimaCacahuete--;
    }

    public static int getCacahuete (){
        return cantidadMinimaCacahuete;
    }
    public static String getNombre (){
        return nombre;
    }

    static void dormirse() {
        Method.imprimir(
                "Se ha dormido: zzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZzzzZZ",
                1, 1);
    }
}
