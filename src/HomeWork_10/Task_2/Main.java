package HomeWork_10.Task_2;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try
             (BufferedWriter bw = new BufferedWriter(new FileWriter("Hello.txt",false)); // true для добавления записи
             BufferedReader br_2 = new BufferedReader(new FileReader("Hello_2.txt"));
              BufferedReader br_3 = new BufferedReader(new FileReader("Hello_3.txt"));
              BufferedReader result = new BufferedReader(new FileReader("Hello.txt"))){

            String s;
            while ((s= br_2.readLine())!=null){
                bw.append(s).append("\n");
            }
            while ((s= br_3.readLine())!=null){
                bw.append(s).append("\n");
            }
            bw.flush();

            while ((s= result.readLine())!=null){
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}
