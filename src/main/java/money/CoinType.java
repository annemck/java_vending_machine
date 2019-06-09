package money;

public enum CoinType {

    TWO_POUND(2.00, false),
    ONE_POUND(1.00, true),
    FIFTY_PENCE(0.50, true),
    TWENTY_PENCE(0.20, true),
    TEN_PENCE(0.10, true),
    FIVE_PENCE(0.05, true),
    TWO_PENCE(0.02, false),
    ONE_PENCE(0.01, false);

    private double value;
    private boolean valid;

    CoinType(double value, boolean valid) {
        this.value = value;
        this.valid = valid;
    }

    public double getValue(){
        return this.value;
    }

    public boolean getValidity(){
        return this.valid;
    }

}
