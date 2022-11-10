package Practice_1.Task_5;

public class Main {
    public static void main(String[] args) {

        Sequence sequence = new Sequence();

        int [] numberArray = {1,4,2,1,2,3,8};

        int [] numberArray_1 = {3,4,5,1,2,2,3};

        System.out.println(sequence.getSequence(1,numberArray));

        System.out.println(sequence.getSequence(3,numberArray_1));
    }
}
