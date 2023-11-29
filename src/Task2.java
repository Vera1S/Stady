import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    //1. Создать класс Rondom
    //2. Создать коллекцию лист
    //2.5 Создать переменную count=0
    //3. Создать цикл j < 100 раз (добавить рондомные числа в лист add)
    //4. Создать цикл i < c.size(); i++
    //	5. Условие сравни 0 < c.get(i)
    //		6. count++
    //7. Верни count or sout
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> c = new ArrayList<>();
        int count = 0;
        for (int j = 0; j < 100; j++) {
            c.add(random.nextInt());
        }
        for (int i = 0; i < c.size(); i++) {
            if (0 < c.get(i)){
                count++;
            }

        }
        System.out.println(count);
    }
}
