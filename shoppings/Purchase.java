public class Purchase implements Comparable<Purchase> {
    private String desc;
    private double value;

    public Purchase(String desc, double value) {
        this.desc = desc;
        this.value = value;
    }

    //Getters

    public String getDesc() {
        return desc;
    }

    public double getValue() {
        return value;
    }

    // Methods

    @Override
    public String toString() {
        return "Purchase{" +
                "desc='" + desc + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Purchase otherPurchase) {
        return Double.valueOf(this.value).compareTo(Double.valueOf(otherPurchase.value));
    }
}