import money.Coin;
import money.CoinType;
import org.junit.Before;
import org.junit.Test;
import products.Product;
import products.Sweet;
import vendingMachine.Code;
import vendingMachine.Drawer;
import vendingMachine.VendingMachine;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private Drawer drawer;
    private Product product;
    private ArrayList<Product> products;
    private ArrayList<Drawer> drawers;
    private VendingMachine vendingMachine;

    @Before
    public void setUp(){
        this.product = new Sweet("Dairy Milk", "Cadburys", 0.65);
        this.products = new ArrayList<Product>();
        this.products.add(product);
        this.drawer = new Drawer(Code.A1, products);
        this.drawers = new ArrayList<Drawer>();
        this.drawers.add(drawer);
        this.vendingMachine = new VendingMachine(drawers);
    }

    @Test
    public void vendingMachineHasDrawers() {
        assertEquals(1, vendingMachine.getDrawers().size());
    }

    @Test
    public void canAddCoinToCoinList() {
        Coin coin = new Coin(CoinType.FIVE_PENCE);
        vendingMachine.addCoin(coin);
        assertEquals(0.05, vendingMachine.getCoinAmount(), 0.00);
    }

    @Test
    public void canCheckIfCoinIsValid() {
        Coin coin = new Coin(CoinType.ONE_PENCE);
        vendingMachine.addCoin(coin);
        assertEquals(0.00, vendingMachine.getCoinAmount(), 0.00);
        assertEquals(0.01, vendingMachine.getCoinReturnAmount(), 0.00);
    }

    @Test
    public void canBuyProduct() {
        Coin coin = new Coin(CoinType.ONE_POUND);
        vendingMachine.addCoin(coin);
        vendingMachine.buyProduct(Code.A1);
        int itemsInDrawer = vendingMachine.getDrawers().get(0).getProductNumbers();
        assertEquals(0, itemsInDrawer);
    }

    @Test
    public void canVendProduct() {
        Coin coin = new Coin(CoinType.ONE_POUND);
        vendingMachine.addCoin(coin);
        vendingMachine.buyProduct(Code.A1);
        assertEquals(0, vendingMachine.getCoinAmount(), 0.00);
    }

    @Test
    public void canAddChangeToCoinReturn() {
        Coin coin = new Coin(CoinType.FIFTY_PENCE);
        Coin coin2 = new Coin(CoinType.ONE_PENCE);
        Coin coin3 = new Coin(CoinType.TWO_PENCE);
        vendingMachine.addCoin(coin);
        vendingMachine.addCoin(coin2);
        vendingMachine.addCoin(coin3);
        assertEquals(0.03, vendingMachine.getCoinReturnAmount(), 0.00);
        assertEquals(0.50, vendingMachine.getCoinAmount(), 0.00);
    }
}
