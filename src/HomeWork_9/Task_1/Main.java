package HomeWork_9.Task_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();

        heavyBoxes.add(new HeavyBox("Tom",20));
        heavyBoxes.add(new HeavyBox("Alice",15));
        heavyBoxes.add(new  HeavyBox("Kate",2));

        //heavyBoxes.forEach(heavyBox-> System.out.println(heavyBox.getOwner()+" "+ heavyBox.getWeight()));
        heavyBoxes.forEach(System.out::println);
        System.out.println();

        heavyBoxes.get(0).setWeight(heavyBoxes.get(0).getWeight()+1);

        heavyBoxes.remove(heavyBoxes.size()-1);

        Object [] heavyBoxesArray = heavyBoxes.toArray();
        for (Object h : heavyBoxesArray){
            System.out.println(h);
        }
        System.out.println();

        heavyBoxes.clear();

        System.out.println(heavyBoxes);

    }
}
