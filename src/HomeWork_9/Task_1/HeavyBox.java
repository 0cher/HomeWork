package HomeWork_9.Task_1;

public class HeavyBox {
    String owner;
    int weight;

    public HeavyBox() {
    }
    public HeavyBox(String owner, int weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox: {" +
                "owner='" + owner + '\'' +
                ", weight=" + weight +
                '}';
    }
}
