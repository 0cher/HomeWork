package Practice_1.Task_2;

import java.util.Arrays;

public class DeleteIdenticalValues {

    private int arraySum;

    DeleteIdenticalValues(){
    }
   public int getSum (int [] array){

       for(int i=0; i< array.length-1; i++) {
           for (int j=i+1; j< array.length; j++) {
               if(array[i] == array[j]) {
                   int temp = array[i];
                   for (int a=0; a<array.length;a++){
                       if (array[a]==temp){
                           array[a]=0;}
                   }
               }
           }
       }
       for (int i : array) {
           arraySum += i;
       }
       System.out.println(Arrays.toString(array));
       return arraySum;
   }
}
