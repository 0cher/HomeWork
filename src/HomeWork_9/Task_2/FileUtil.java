package HomeWork_9.Task_2;

import java.io.*;

import java.util.Map;

public class FileUtil {

    public static boolean saveReadersList(Map<Integer,Reader> readers) {

        try (ObjectOutputStream reader = new ObjectOutputStream(new FileOutputStream(
                "C:\\Users\\Aleksejs\\IdeaProjects\\HomeWork\\src\\HomeWork_9\\Task_2\\person.dat"))){

            reader.writeObject(readers);

            System.out.println("Test End");

        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    static Map<Integer, Reader> restoreReadersList (Map<Integer, Reader> readers){

        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(
                "C:\\Users\\Aleksejs\\IdeaProjects\\HomeWork\\src\\HomeWork_9\\Task_2\\person.dat"))){

            readers = (Map<Integer, Reader>) reader.readObject();
            System.out.println("Test");


        }catch (Exception e){
            e.printStackTrace();
        }

        return readers;
    }

}
