import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    //1. Создать класс Rondom
    //2. Создать коллекцию лист
    //2.1 Создат пустую коллекцию для сохранения временных переменых
    //3. Создать цикл j < 100 раз (добавить рондомные числа в лист add)
    //4. Создать цикл i = k.size-1; i >= 0; i--
    //	5. Создать временную переменую = k.get(i)
    //	6. Добавить временную переменную и положить во вр.списое п.2.1
    //7. Вывести список 2.1
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> k = new ArrayList<>();
        List<Integer> h = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            k.add(random.nextInt());
        }
        for (int i = k.size()-1; i >= 0; i--) {
            int temp = k.get(i);
            h.add(temp);
        }
        System.out.println(k);
        System.out.println(h);
    }
}
