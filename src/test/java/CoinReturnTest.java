import money.Coin;
import money.CoinReturn;
import money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinReturnTest {

    private CoinReturn coinReturn;
    private Coin coin1;
    private Coin coin2;

    @Before
    public void setUp(){
        this.coin1 = new Coin(CoinType.ONE_POUND);
        this.coin2 = new Coin(CoinType.TEN_PENCE);
        this.coinReturn = new CoinReturn();
        this.coinReturn.addCoin(coin1);
    }

    @Test
    public void canGetAmountOfCoins() {
        assertEquals(1.00, coinReturn.getCoinAmount(), 0.00);
    }

    @Test
    public void canAddCoin() {
        coinReturn.addCoin(coin2);
        assertEquals(1.10, coinReturn.getCoinAmount(), 0.00);
    }
}
