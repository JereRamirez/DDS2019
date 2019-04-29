import java.util.*;

public class GuardaRopas {
    private LinkedList<Prenda> listaPrendas;

    public GuardaRopas(){
        this.listaPrendas = new LinkedList<Prenda>();
        }

    public void addPrenda(Prenda nuevaPrenda){
        this.listaPrendas.add(nuevaPrenda);
    }

    public Prenda getPrenda(int index){
        return this.listaPrendas.get(index);
    }

    public Sugerencia sugerirCombinacion(int temperatura){
        Sugerencia sugeridas = new Sugerencia();
        ListIterator<Prenda> listAux = this.listaPrendas.listIterator();
        Prenda prendaAux;

        while(listAux.hasNext()){
            prendaAux = listAux.next();

            if((prendaAux.getMenorTemperaturaPrenda() < temperatura) && (prendaAux.getMayorTemperaturaPrenda() >= temperatura)){
                //al no necesitar controlar que no haya repetidos, no agrego otro control, sino deberia ir en esta parte
                switch (prendaAux.getTipoPrenda()){
                    case PIES:{
                        sugeridas.agregarPies(prendaAux);
                        break;
                    }
                    case PIERNAS:{
                        sugeridas.agregarPiernas(prendaAux);
                        break;
                    }
                    case TORSO:{
                        sugeridas.agregarTorso(prendaAux);
                        break;
                    }
                    case OPCIONALES:{
                        sugeridas.agregarOpcional(prendaAux);
                        break;
                    }
                }
            }
        }
        sugeridas.unaSugerencia();
        return sugeridas;
    }
}
