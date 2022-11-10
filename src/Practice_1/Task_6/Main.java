package Practice_1.Task_6;

public class Main {

    public static void main(String[] args) {

        Hasnumber hasnumber =new Hasnumber();

        int [] numberArray = {1,2,7,1,2,3,8};

        int [] numberArray_1 = {3,4,5,1,2,2,3};

        System.out.println(hasnumber.getHasnumber(numberArray));

        System.out.println(hasnumber.getHasnumber(numberArray_1));

    }

}
