package HomeWork_9.Task_3;

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
}
