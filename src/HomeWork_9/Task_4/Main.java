package HomeWork_9.Task_4;

import static HomeWork_9.Task_4.ArrayToMap.*;

public class Main {
    public static void main(String[] args) {

        Integer[] numbers =  {2,3,4,4,2,3,1,7};

        long startTime = System.currentTimeMillis();
        System.out.println(arrayToMap_1(numbers));
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        System.out.println(arrayToMap_2(numbers).entrySet());
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (var element : arrayToMap_3(numbers).entrySet()){
            System.out.printf("%d:%d, ",
                    element.getKey(), element.getValue());
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - startTime);

    }

}

