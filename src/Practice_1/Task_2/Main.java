package Practice_1.Task_2;


import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        DeleteIdenticalValues identicalValues = new DeleteIdenticalValues();
        
        int arraySum = 0;

        int[] numberArray =  {4,5,8,2,4,8,1,4,4,4,8,8,8,6,7,0,2,12};


        System.out.println(Arrays.toString(numberArray));

        System.out.println(identicalValues.getSum(numberArray));
    }
}
