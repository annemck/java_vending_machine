package vendingMachine;

import money.Coin;
import money.CoinReturn;
import products.Product;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Drawer> drawers;
    private ArrayList<Coin> enteredCoins;
    private CoinReturn coinReturn;

    public VendingMachine(ArrayList<Drawer> drawers) {
        this.drawers = drawers;
        this.coinReturn = new CoinReturn();
        this.enteredCoins = new ArrayList<Coin>();
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public void addCoin(Coin coin) {
        if (coin.getValidity()) {
            this.enteredCoins.add(coin);
        } else {
            this.coinReturn.addCoin(coin);
        }
    }

    public double getCoinAmount() {
        double total = 0;
        for (Coin coin : this.enteredCoins){
            total += coin.getValue();
        }
        return total;
    }

    public double getCoinReturnAmount() {
        return this.coinReturn.getCoinAmount();
    }

    public void buyProduct(Code code) {
        for (Drawer drawer : this.drawers) {
            if (drawer.getCode() == code) {
                Product product = drawer.returnProduct();
                if (this.getCoinAmount() >= product.getPrice()) {
                    this.vend(product);
                }
            }
        }
    }

    private Product vend(Product product){
        if (this.getCoinAmount() > product.getPrice()){

        }
        this.enteredCoins.clear();
        return product;
    }
}
