package Practice_1.Task_6;

public class Hasnumber {



    Hasnumber(){

    }

    public boolean getHasnumber( int[] array){

        for (int i =0; i< array.length-2;i++){
            if (array[i]==array[i+1]-5 &&
                    array[i]==array[i+2]+1){
                return true;
            }
        }return false;
    }


}
