package Practice_1.Task_4;

public class FrontTimes {


    FrontTimes(){

    }
    public void getFront(String str, int Char,int repeat){

    for (int j=0;j<repeat;j++){
        for (int i =0; i<Char;i++)
            System.out.print(str.charAt(i));
        }
    }
}
