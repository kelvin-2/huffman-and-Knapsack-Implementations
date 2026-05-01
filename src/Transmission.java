public class Transmission {

    private String message;
    private double benefit;
    private double weight;
    private double valueIndex;
    private double amountTaken;

    public Transmission(String message, double benefit, double weight) {
        this.message = message;
        this.benefit = benefit;
        this.weight = weight;
        this.valueIndex = benefit / weight;
        this.amountTaken = 0.0;
    }

    public String getMessage() {
        return message;
    }

    public double getBenefit() {
        return benefit;
    }

    public double getWeight() {
        return weight;
    }

    public double getValueIndex() {
        return valueIndex;
    }

    public double getAmountTaken() {
        return amountTaken;
    }

    public void setAmountTaken(double fractionTaken) {
        this.amountTaken = fractionTaken;
    }
}