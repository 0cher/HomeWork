package methodClass;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraySum12345 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

// получаем из каждого числа
// строку и соединяем строки
        String str = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

// преобразовываем строку в число
        int num = Integer.parseInt(str);

        System.out.println(num);
    }

}
