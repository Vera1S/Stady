import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    //1. Создать класс Rondom
    //2. Создать коллекцию лист
    //2.1 Создат пустую коллекцию для сохранения временных переменых
    //3. Создать цикл j < 100 раз (добавить рондомные числа в лист add)
    //4. Создать цикл i = emptyList.size-1; i >= 0; i-- (начинать с конца коллекции и вставлять в новый лист с начала)
    //	5. Создать временную переменую "temp" = emptyList.get(i)
    //	6. Добавить временную переменную и положить во вр.списое п.2.1
    //7. Вывести список 2.1
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            emptyList.add(random.nextInt());
        }
        for (int i = emptyList.size()-1; i >= 0; i--) {
            int temp = emptyList.get(i);
            newList.add(temp);
        }
        System.out.println(emptyList);
        System.out.println(newList);
    }
}
