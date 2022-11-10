package HomeWork_5_2.test1;

class IntArray {

    private int[] array;

    IntArray(int[] array){
        this.array=array;
    }
    IntArray(int i){
        array= new int [i];
    }
    IntArray(){
        array= new int [10];
    }

    public void Sort(int n) {
        if (n>0){
            int temp;
            for (int i = 0; i < array.length ; i++) {
                for (int b = 0; b < array.length-1; b++) {
                    if (array[b] > array[b + 1]) {
                        temp = array[b];
                        array[b] = array[b + 1];
                        array[b + 1] = temp;

                    }
                }
            }
        }
        else {
            int temp;
            for (int i = 0; i < array.length ; i++) {
                for (int b = 0; b < array.length-1; b++) {
                    if (array[b] < array[b + 1]) {
                        temp = array[b];
                        array[b] = array[b + 1];
                        array[b + 1] = temp;
                    }
                }
            }
        }
    }
    public int Lenght (){
        return array.length;
    }
    public void Print () {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public int[] getArray (){
        return array;
    }
    public void setArray (int[] array){
        this.array=array;
    }
    public int getArray (int i){
        return array[i];
    }
    public void setArray (int b,int i){
        this.array[i]=b;
    }

}
