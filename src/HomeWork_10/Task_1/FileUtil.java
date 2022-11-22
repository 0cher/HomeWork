package HomeWork_10.Task_1;

import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
public class FileUtil {

     static boolean saveReadersList(Map<Integer, Reader> readers, Path s) {
        try (ObjectOutputStream reader = new ObjectOutputStream(new FileOutputStream(s.toFile()))){
            reader.writeObject(readers);
            System.out.println("Data saved ");

        }catch (Exception e){
            e.printStackTrace();}
        return true;
    }
    static Map<Integer, Reader> restoreReadersList (Path s) {
        Map<Integer, Reader> readers = new HashMap<>();
        try (ObjectInputStream reader = new ObjectInputStream(new FileInputStream(s.toFile()))){

            readers = (Map<Integer, Reader>) reader.readObject();
            System.out.println("Restored");

        } catch (Exception e){
            e.printStackTrace();
        }
        return readers;
    }
}
