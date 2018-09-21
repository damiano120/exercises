package exercises7;

import java.io.IOException;

public interface Serializable {

    public void saveOrder(Order order, String fileName) throws IOException;

    public Order loadOrder(String fileName) throws IOException;
}
