import money.Coin;
import money.CoinType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    private Coin coin;

    @Test
    public void canGetCoinValue() {
        this.coin = new Coin(CoinType.ONE_POUND);
        assertEquals(1.00, coin.getValue(), 0.00);
    }

    @Test
    public void coinCanBeOnePound() {
        this.coin = new Coin(CoinType.ONE_POUND);
        assertEquals(1.00, coin.getValue(), 0.00);
    }

    @Test
    public void coinCanBeFiftyPence() {
        this.coin = new Coin(CoinType.FIFTY_PENCE);
        assertEquals(0.50, coin.getValue(), 0.00);
    }

    @Test
    public void coinCanBeTwentyPence() {
        this.coin = new Coin(CoinType.TWENTY_PENCE);
        assertEquals(0.20, coin.getValue(), 0.00);
    }

    @Test
    public void coinCanBeTenPence() {
        this.coin = new Coin(CoinType.TEN_PENCE);
        assertEquals(0.10, coin.getValue(), 0.00);
    }

    @Test
    public void coinCanBeFivePence() {
        this.coin = new Coin(CoinType.FIVE_PENCE);
        assertEquals(0.05, coin.getValue(), 0.00);
    }

}
