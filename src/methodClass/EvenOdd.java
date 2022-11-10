package methodClass;

public class EvenOdd {

    public int n;
    public String a;

    public String getA() {
        if (n%2==0) {
        a = " четное";
        return a;
    }
    else {
        a = " нечетное";
        return a;
    }
  }
}



