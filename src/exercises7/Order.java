package exercises7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Serializable {

    private ArrayList<Item> items = new ArrayList<>();
    private int amount;
    private int maxAmount;

    public Order() {
        this.maxAmount = 10;
    }

    public Order(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public void addItem(Item item){
        boolean trueFalse = false;
        for (int i=0; i<items.size(); i++) {
            if (items.get(i).getName() == item.getName()) {
                items.get(i).setAmount(items.get(i).getAmount() + item.getAmount());
                trueFalse = true;
                break;
            }
        }
        if (!trueFalse){
            items.add(item);
        }
    }

    public void removeItem(int index){
        items.remove(index);
    }

    public void editItem(int index){

    }

    public double calculateSum(){
        double value = 0;
        for (int i=0; i<items.size(); i++){
            value += items.get(i).calculateValue();
        }
        return value;
    }

    @Override
    public String toString(){
        String order = null;
        for (int i=0; i<items.size(); i++){
            if (order == null){
                order = items.get(i).toString() + "\n";
            } else {
                order += items.get(i).toString() + "\n";
            }
        }
        return "Zamowienie: \n" +
                order + "\n" +
                "Razem: " + calculateSum() + "zl";
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
    public Order loadOrder(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = Files.newBufferedReader(path);
            String line;
//            while ()
        } catch (IOException exc){
            exc.printStackTrace();
        } finally {
            if (bufferedReader != null){
                bufferedReader.close();
            }
        }
        return null;
    }
}
