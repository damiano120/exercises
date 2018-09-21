package exercises7;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Item implements Serializable {

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

    @Override
    public String toString(){
        return getName() + " " + getPrice() + "zl" + " " + getAmount() + "szt" + " " + calculateValue() + "zl";
    }

    @Override
    public void saveOrder(Order order, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = Files.newBufferedWriter(path);
            bufferedWriter.write(order.toString());
            bufferedWriter.newLine();
        } catch (IOException exc){
            exc.printStackTrace();
        } finally {
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }

    @Override
    public Order loadOrder(String fileName) {
        return null;
    }
}
