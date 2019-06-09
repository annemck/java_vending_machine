package money;

import java.util.ArrayList;

public class CoinReturn {

    private ArrayList<Coin> coins;

    public CoinReturn() {
        this.coins = new ArrayList<Coin>();
    }

    public double getCoinAmount() {
        double total = 0;
        for (Coin coin : coins){
            total += coin.getValue();
        }
        return total;
    }

    public void addCoin(Coin coin) {
        this.coins.add(coin);
    }
}
