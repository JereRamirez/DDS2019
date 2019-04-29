import org.junit.Assert;
import org.junit.Test;

public class TestGuardaRopas {
    @Test
    public void validarNoMostrarPrendaIncorrecta() {
        Prenda testTorso = new Prenda("TORSO", "remera", "rojo", 10, 30);
        Prenda testTorsoMal = new Prenda("TORSO", "musculosa", "rojo", 25, 35);
        Prenda testPierna = new Prenda("PIERNAS", "pantalon", "negro", 0, 20);
        Prenda testPie = new Prenda("PIES", "zapatos", "negro", 0, 25);
        Prenda testOpcional = new Prenda("OPCIONALES", "gorra", "blanca y negra", 10, 30);

        GuardaRopas testGuardaRopas = new GuardaRopas();

        testGuardaRopas.addPrenda(testTorsoMal);
        testGuardaRopas.addPrenda(testTorso);
        testGuardaRopas.addPrenda(testPierna);
        testGuardaRopas.addPrenda(testPie);
        testGuardaRopas.addPrenda(testOpcional);

        Sugerencia testSugerencia = testGuardaRopas.sugerirCombinacion(18);


        Assert.assertFalse( testSugerencia.getPrendasTorso().contains(testTorsoMal) );
    }

    @Test
    public void validarCantidadDeSugerenciasCorrectas() {
        Prenda testTorso1 = new Prenda("TORSO", "remera", "rojo", 10, 30);
        Prenda testTorso2 = new Prenda("TORSO", "musculosa", "azul", 20, 35);
        Prenda testTorso3 = new Prenda("TORSO", "camisa", "negra", 0, 25);
        Prenda testPierna = new Prenda("PIERNAS", "pantalon", "negro", 0, 25);
        Prenda testPie = new Prenda("PIES", "zapatos", "negro", 0, 25);
        Prenda testOpcional = new Prenda("OPCIONALES", "gorra", "blanca y negra", 10, 30);

        GuardaRopas testGuardaRopas = new GuardaRopas();

        testGuardaRopas.addPrenda(testTorso1);
        testGuardaRopas.addPrenda(testTorso2);
        testGuardaRopas.addPrenda(testTorso3);
        testGuardaRopas.addPrenda(testPierna);
        testGuardaRopas.addPrenda(testPie);
        testGuardaRopas.addPrenda(testOpcional);

        Sugerencia testSugerencia = testGuardaRopas.sugerirCombinacion(23);


        Assert.assertTrue( testSugerencia.getPrendasTorso().size() > 2 );
    }
}
