package HomeWork_10.Task_2;

import java.io.*;
import java.nio.file.Path;
public class Main {
    static void saveFile(Path read, Path write, boolean bool) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(write.toFile(),bool)); // true для добавления записи
             BufferedReader br = new BufferedReader(new FileReader(read.toFile()))){
            String s;
            while ((s= br.readLine())!=null){
                bw.append(s).append('\n');
            }
            bw.flush();

        }catch (Exception e){
            e.printStackTrace();}
    }
    static StringBuilder readFile (Path read){
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader result = new BufferedReader(new FileReader(read.toFile()))) {
            String str;
            while ((str = result.readLine())!=null){
               // System.out.println(str);
                stringBuilder.append(str).append('\n');
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return stringBuilder;
    }
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        File addFile = new  File("Hello.txt").toPath().toFile();
        saveFile(new File("Hello_2.txt").toPath(), addFile.toPath(),false);
        saveFile(new File("Hello_3.txt").toPath(), addFile.toPath(),true);
        //readFile(addFile.toPath());
        System.out.println(readFile(addFile.toPath()));
        System.out.println(System.currentTimeMillis() - startTime);

//        try
//             (
//                     BufferedWriter bw = new BufferedWriter(new FileWriter("Hello.txt",false)); // true для добавления записи
//             BufferedReader br_2 = new BufferedReader(new FileReader("Hello_2.txt"));
//              BufferedReader br_3 = new BufferedReader(new FileReader("Hello_3.txt"));
//              BufferedReader result = new BufferedReader(new FileReader("Hello.txt"))){
//
//            String s;
//            while ((s= br_2.readLine())!=null){
//                bw.append(s).append("\n");
//            }
//            while ((s= br_3.readLine())!=null){
//                bw.append(s).append("\n");
//            }
//            bw.flush();
//
//            while ((s= result.readLine())!=null){
//                System.out.println(s);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
