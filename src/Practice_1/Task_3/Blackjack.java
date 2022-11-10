package Practice_1.Task_3;

public class Blackjack {
    private int sum = 21;

    Blackjack(){

    }

    public int getBlackjack (int a, int b){
        if (a>sum){
            a=0;
        } if (b>sum) {
            b=0;
        }
        return Math.max(a, b);
    }
}
