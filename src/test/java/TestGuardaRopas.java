import org.junit.Assert;
import org.junit.Test;

public class TestGuardaRopas {
    @Test
    public void validarCargaDePrendaEnGuardaRopas() {
        Prenda testPrenda = new Prenda("TORSO", "remera", "rojo", 10, 30);
        GuardaRopas testGuardaRopas = new GuardaRopas();
        testGuardaRopas.addPrenda(testPrenda);

        Assert.assertTrue(testGuardaRopas.getPrenda(0) == testPrenda);
    }
}
