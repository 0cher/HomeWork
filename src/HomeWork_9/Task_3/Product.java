package HomeWork_9.Task_3;

import java.util.Map;

public class Product {
  private String name;
    private int amountOfGoods;

    public Product() {
    }

    public Product(String name, int amountOfGoods) {
        this.name = name;
        this.amountOfGoods = amountOfGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfGoods() {
        return amountOfGoods;
    }

    public void setAmountOfGoods(int amountOfGoods) {
        this.amountOfGoods = amountOfGoods;
    }

    @Override
    public String toString() {
        return "Product: {" +
                "name='" + name + '\'' +
                ", amountOfGoods=" + amountOfGoods +
                '}';
    }
    public static void getItem (Map<Integer, Product> productMap) {
        for (Map.Entry<Integer, Product> item : productMap.entrySet()){
            System.out.printf("Ключ: %s, продукт: %s, количество %d\n",item.getKey(),
                    item.getValue().getName(), item.getValue().getAmountOfGoods());
        }
    }
}
