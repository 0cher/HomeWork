package Practice_1.Task_5;

public class Sequence {


    Sequence(){
    }

    public boolean getSequence(int firstNUmber, int[] array){

        for (int i =0; i< array.length-2;i++){
            if (array[i]==firstNUmber&&array[i]==array[i+1]-1 &&
                    array[i+1]==array[i+2]-1){
                return true;
            }
        }return false;
    }
}
