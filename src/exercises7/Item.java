package exercises7;

public class Item {

    private String name;
    private int amount;
    private double price;

    public Item(String name, int amount, double price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculateValue(){
        double value = 0;
        if (amount>4){
            value = calculateValueWithDiscount();
        } else {
            value = amount * price;
        }
        return value;
    }

    public double calculateValueWithDiscount(){
        double valueWithDiscount = 0;
        if (amount >= 5 && amount <10){
            valueWithDiscount = amount * price * 0.95;
        } else if (amount >= 10 && amount < 20){
            valueWithDiscount = amount * price * 0.9;
        } else {
            valueWithDiscount = amount * price * 0.85;
        }
        return valueWithDiscount;
    }

    public String toString(){
        return getName() + " " + getPrice() + "zl" + " " + getAmount() + "szt" + " " + calculateValue() + "zl";
    }
}
