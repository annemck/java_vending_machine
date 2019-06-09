import org.junit.Before;
import org.junit.Test;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    private Sweet sweet;

    @Before
    public void setUp(){
        this.sweet = new Sweet("Dairy Milk", "Cadburys", 0.65);
    }

    @Test
    public void sweetHasName() {
        assertEquals("Dairy Milk", sweet.getName());
    }

    @Test
    public void sweetHasBrand() {
        assertEquals("Cadburys", sweet.getBrand());
    }

    @Test
    public void sweetHasPrice() {
        assertEquals(0.65, sweet.getPrice(), 0.00);
    }
}
