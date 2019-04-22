import java.util.*;

public class GuardaRopas {
    private LinkedList<Prenda> listaPrendas;
    private Sugerencia unaSugerencia;

    public GuardaRopas(){
        this.listaPrendas = new LinkedList<Prenda>();
        this.unaSugerencia = new Sugerencia();
    }

    public void addPrenda(Prenda nuevaPrenda){
        this.listaPrendas.add(nuevaPrenda);
    }

    public Prenda getPrenda(int index){
        return this.listaPrendas.get(index);
    }

    public Sugerencia sugerirCombinacion(int temperatura){
        LinkedList<Prenda> sugerencia = new LinkedList<Prenda>();
        ListIterator<Prenda> listAux = this.listaPrendas.listIterator();
        Prenda prendaAux;

        while(listAux.hasNext()){
            prendaAux = listAux.next();

            if((prendaAux.getMenorTemperaturaPrenda() < temperatura) && (prendaAux.getMayorTemperaturaPrenda() >= temperatura)){
                //al no necesitar controlar que no haya repetidos, no agrego otro control, sino deberia ir en esta parte
                switch (prendaAux.getTipoPrenda()){
                    case PIES:{
                        unaSugerencia.agregarPies(prendaAux);
                        break;
                    }
                    case PIERNAS:{
                        unaSugerencia.agregarPiernas(prendaAux);
                        break;
                    }
                    case TORSO:{
                        unaSugerencia.agregarTorso(prendaAux);
                        break;
                    }
                    case OPCIONALES:{
                        unaSugerencia.agregarOpcional(prendaAux);
                        break;
                    }
                }
            }
        }
        return unaSugerencia;
    }
}
