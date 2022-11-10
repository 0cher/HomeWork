package HomeWork_4.test2;

public class Reader {
    String surname;
    String name;
    String otchestvo;
    int bilet;
    String facultet;
    String born;
    long telefon;
    Book[] spisok= new Book[10];
    Reader (){}

    void takeBook (String name,String authorName) {
        char[] n = this.name.toCharArray();
        char[] ot = this.otchestvo.toCharArray();
        boolean isFull = true;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i] == null) {
                spisok[i]=new Book();
                spisok[i].name= name;
                spisok[i].authorName= authorName;

                isFull = false;
                System.out.print(surname+" "+n [0]+". "+ot[0]+". "+"взял(а) книгу "+spisok[i].name);
                break;
            }
        }
        if (isFull){
            System.out.println("Взято максимальное количество книг.");
        }

    }
    void returnBook (String name) {
        char[] n = this.name.toCharArray();
        char[] ot = this.otchestvo.toCharArray();
        int ind = -1;
        for (int i = 0; i < spisok.length; i++) {
            if (spisok[i]!=null&&spisok[i].name.equals((name))){
                ind=i;
                break;
            }
        }
        if (ind < 0) {
            System.out.println(surname + " " + n[0] + ". " + ot[0] + ". " + " не хранит книгу " + name);

        }
        else {
            spisok[ind] = null;
            System.out.println(surname + " " + n[0] + ". " + ot[0] + ". " + " вернул(а) книгу  " + name);

        }
    }
    void printStatus (){
        char[] n = this.name.toCharArray();
        char[] ot = this.otchestvo.toCharArray();
        int knigi=0;

        for(int i=0;i<spisok.length;i++){
            if(spisok[i]!=null){
                knigi++;}
        }


        if (knigi>0) {
            System.out.print("\n"+surname + " " + n[0] + ". " + ot[0] + ". " + "взял(а) " + knigi + " книг(у/и): ");
            for (int i = 0; i < spisok.length; i++) {
                if (spisok[i] != null) {
                    System.out.print(spisok[i].name + ", ");
                }
            }
        }
        else {System.out.println(surname+" "+n[0]+". "+ot[0]+". "+" не брал(а) книг.");}



    }

}
