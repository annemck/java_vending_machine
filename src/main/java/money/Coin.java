package money;

public class Coin {

    private CoinType coin;

    public Coin(CoinType coin) {
        this.coin = coin;
    }

    public double getValue() {
        return coin.getValue();
    }

    public boolean getValidity(){
        return coin.getValidity();
    }
}
