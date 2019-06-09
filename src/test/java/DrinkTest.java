import org.junit.Before;
import org.junit.Test;
import products.Drink;
import products.Sweet;

import static org.junit.Assert.assertEquals;

public class DrinkTest {

    private Drink drink;

    @Before
    public void setUp(){
        this.drink = new Drink("Irn Bru", "Barrs", 1.00);
    }

    @Test
    public void drinkHasName() {
        assertEquals("Irn Bru", drink.getName());
    }

    @Test
    public void drinkHasBrand() {
        assertEquals("Barrs", drink.getBrand());
    }

    @Test
    public void drinkHasPrice() {
        assertEquals(1.00, drink.getPrice(), 0.00);
    }

}
