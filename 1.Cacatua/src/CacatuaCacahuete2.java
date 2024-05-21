import java.util.Scanner;

public class CacatuaCacahuete2 {

    
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        String comida;
        System.out.println();
        Method.imprimir("Que hambre tiene tu cacatua "+Cacatua.getNombre()+"! Vamos a preguntarle si quiere comer:", 1, 1);
        
        System.out.println();
        boolean cacahuete = false;
        
        int cant = 0;
        while (!cacahuete) {

            System.out.println();
            if (Cacatua.getCacahuete()==0) {
                Cacatua.dormirse();
                cacahuete = true;
            }
            else{
                comida = Cacatua.getAlimento(scan);

                if (comida.equalsIgnoreCase("cacahuete") || comida.equalsIgnoreCase("cacahuetes")) {
                    System.out.println();
                    Method.imprimir("Cuantos cacahuetes quieres darle a "+Cacatua.getNombre()+"? ", 0, 1);
                    cant = Method.validarInt(scan);
                    if (cant>0) {
                        for(int i = 0; i<cant; i++){
                            Cacatua.restaCacahuete();
                        }
                    }
                    else{
                        
                        Method.imprimir("Ooooh! No le has dado ningún cacahuete!", 1, 1);
                    }
                    System.out.println();
                    Method.imprimir("Quedan "+Cacatua.getCacahuete()+" cacahuetes para que se duerma "+Cacatua.getNombre()+".", 1, 1);
                }
    
            }
            
        }

        scan.close();
    }





    
}
