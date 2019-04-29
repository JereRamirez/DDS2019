import java.util.LinkedList;

public class Sugerencia {
    private LinkedList<Prenda> prendasTorso;
    private LinkedList<Prenda> prendasPiernas;
    private LinkedList<Prenda> prendasPies;
    private LinkedList<Prenda> prendasOpcionales;

    public Sugerencia(){
        this.prendasTorso = new LinkedList<Prenda>();
        this.prendasPiernas = new LinkedList<Prenda>();
        this.prendasPies = new LinkedList<Prenda>();
        this.prendasOpcionales = new LinkedList<Prenda>();
    }

    public void agregarPies(Prenda prendaPies){
        this.prendasPies.add(prendaPies);
    }

    public void agregarPiernas(Prenda prendaPiernas){
        this.prendasPiernas.add(prendaPiernas);
    }

    public void agregarTorso(Prenda prendaTorso){
        this.prendasTorso.add(prendaTorso);
    }

    public void agregarOpcional(Prenda prendaOpcional){
        this.prendasOpcionales.add(prendaOpcional);
    }

    public LinkedList<Prenda> getPrendasTorso(){
        return prendasTorso;
    }

    public LinkedList<Prenda> getPrendasPiernas(){
        return  prendasPiernas;
    }

    public LinkedList<Prenda> getPrendasPies(){
        return prendasPies;
    }

    public LinkedList<Prenda> getPrendasOpcionales(){
        return prendasOpcionales;
    }

    public void unaSugerencia(){
        Prenda torso = this.getPrendasTorso().getFirst();
        Prenda piernas = this.getPrendasPiernas().getFirst();
        Prenda pies = this.getPrendasPies().getFirst();
        Prenda opcional = this.getPrendasOpcionales().getFirst();

        System.out.println("Una posible combinación seria: " );
        System.out.println("[ " + torso.getNombrePrenda() + " " + torso.getColorPrenda() + " , " + piernas.getNombrePrenda() + " " + piernas.getColorPrenda() + " , " + pies.getNombrePrenda() + " " + pies.getColorPrenda() + " y " + opcional.getNombrePrenda() + " " + opcional.getColorPrenda() + " ]");
    }
}
