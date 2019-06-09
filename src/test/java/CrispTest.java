import org.junit.Before;
import org.junit.Test;
import products.Crisp;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class CrispTest {

    private Crisp crisps;

    @Before
    public void setUp(){
        this.crisps = new Crisp("French Fries", "Walkers", "Salt and Vinegar", 0.50);
    }

    @Test
    public void crispsHaveName() {
        assertEquals("French Fries", crisps.getName());
    }

    @Test
    public void crispsHaveBrand() {
        assertEquals("Walkers", crisps.getBrand());
    }

    @Test
    public void crispsHaveFlavour() {
        assertEquals("Salt and Vinegar", crisps.getFlavour());
    }

    @Test
    public void crispsHavePrice() {
        assertEquals(0.50, crisps.getPrice(), 0.00);
    }

}
