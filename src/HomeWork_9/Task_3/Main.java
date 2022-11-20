package HomeWork_9.Task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

      Map<Integer, Product> productMap = new HashMap<>();

      productMap.put(1, new Product("Стол",2));
      productMap.put(2, new Product("Стул",4));
      productMap.put(3, new Product("Диван",1));

        for (Map.Entry<Integer, Product> item : productMap.entrySet()){
            System.out.printf("Ключ: %s, продукт: %s, количество %d\n",item.getKey(),
                    item.getValue().getName(), item.getValue().getAmountOfGoods());
        }

    }
}
