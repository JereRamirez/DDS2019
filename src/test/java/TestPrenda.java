import org.junit.Assert;
import org.junit.Test;

public class TestPrenda {
    @Test
    public void validarCargaDePrenda() {
        Prenda testPrenda = new Prenda("TORSO", "remera", "rojo", 10, 30);

        Assert.assertTrue(testPrenda.getColorPrenda() == "rojo");
    }
}
