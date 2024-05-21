public class Moviles {
    private static int descuento = 0;

    private String marca;
    private String modelo;
    private double PVP;
    public Moviles(String marca, String modelo, double PVP) {
        this.marca = marca;
        this.modelo = modelo;
        this.PVP = PVP;
    }
    public Moviles(){

    }
    public static int getDescuento() {
        return descuento;
    }
    public static void setDescuento(int descuento) {
        Moviles.descuento = descuento;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPVP() {
        return PVP;
    }
    public void setPVP(double PVP) {
        this.PVP = PVP;
    }
    @Override
    public String toString() {
        if (descuento>0) {
            return "El " + marca + " modelo "+modelo+" cuesta " + (PVP*descuento/100) + "€ con un "+descuento+"% de descuento.";    
        }
        else{
            return "El " + marca + " modelo "+modelo+" cuesta " + (PVP) + "€ sin descuentos aplicados.";    
        }
        
    }

    



    
}
