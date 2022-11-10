package Practice_1.Task_1;

public class MakeBricks {

    private final int bricksSmall =1;
    private final int bricksBig = 5;
    MakeBricks (){
    }
    boolean getMakeBricks (int a, int b, int sum){
        if ((bricksSmall *a)+(bricksBig*b)>=sum){
            return true;
        }else return  false;
    }
    public int getBricksQuantityBig(int a, int b, int sum) {
        int i;
        i = sum/bricksBig;
        return i;
    }
    public int getBricksQuantitySmall(int a, int b, int sum) {
        int i;
        i = sum%bricksBig;
        return i;
    }
}
