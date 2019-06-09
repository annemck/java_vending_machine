import org.junit.Before;
import org.junit.Test;
import products.Drink;
import products.Product;
import vendingMachine.Code;
import vendingMachine.Drawer;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DrawerTest {

    private Drawer drawer;
    private Product product;
    private ArrayList<Product> products;

    @Before
    public void setup(){
        this.product = new Drink("Irn Bru", "Barrs", 1.00);
        this.products = new ArrayList<Product>();
        products.add(product);
        this.drawer = new Drawer(Code.A2, products);
    }

    @Test
    public void drawerHasCode() {
        assertEquals(Code.A2, drawer.getCode());
    }

    @Test
    public void drawerHasProducts() {
        assertEquals(1, drawer.getProductNumbers());
    }

    @Test
    public void canAddProductToDrawer() {
        drawer.addProduct(product);
        assertEquals(2, drawer.getProductNumbers());
    }

    @Test
    public void canReturnProductFromDrawer() {
        assertEquals(product, drawer.returnProduct());
        assertEquals(0, drawer.getProductNumbers());
        }
    }
