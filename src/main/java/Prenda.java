public class Prenda {
    public enum TipoPrenda {
        TORSO, PIERNAS, PIES, OPCIONALES;
    }

    private TipoPrenda tipoPrenda;
    private String nombrePrenda;
    private String colorPrenda;
    private int menorTemperaturaPrenda;
    private int mayorTemperaturaPrenda;
    //Al ampliar aun mas el trabajo, deberiamos agregar otros atributos como clima(lluvia, sol, etc)

    public Prenda(){
        };

    public Prenda(String tipo, String nom, String color, int tempMenor, int tempMayor){
        TipoPrenda tipoPren = TipoPrenda.valueOf(tipo);
        this.tipoPrenda = tipoPren;
        this.nombrePrenda = nom;
        this.colorPrenda = color;
        this.menorTemperaturaPrenda = tempMenor;
        this.mayorTemperaturaPrenda = tempMayor;
    }

    public Prenda.TipoPrenda getTipoPrenda(){
        TipoPrenda tipoPrenda = this.tipoPrenda;
        return tipoPrenda;
    }

    public String getNombrePrenda(){
        return this.nombrePrenda;
    }

    public String getColorPrenda(){
        return colorPrenda;
    }

    public int getMenorTemperaturaPrenda(){
        return menorTemperaturaPrenda;
    }

    public int getMayorTemperaturaPrenda(){
        return mayorTemperaturaPrenda;
    }

}
