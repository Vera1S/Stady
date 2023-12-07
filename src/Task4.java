import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
    //В списке все элементы различны. Поменяйте местами минимальный и
    // максимальный элемент этого списка.
    //(Эта задача разделяется на 3 действия:
    //Найти минимальн. значение
    //найти максим.значение
    //Поменять местами)
    //Примеры
    //входные данные
    //3 4 5 2 1
    //выходные данные
    //3 4 1 2 5

    //1. Создать класс Rondom
    //2. Создать коллекцию лист
    //3. Создать цикл j < 100 раз (добавить рондомные числа в лист add)
    //3.1 Создать переменную min = value.get(0);(после первого цикла)
    //3.2 Создать переменную max = value.get(0);
    //3.3 Создать переменную minIndex = 0;
    //3.4 Создать переменную maxIndex = 0;
    //4. Создать цикл i < value.size(); i++) и сравнить одно значение с каждым значением между собой
    //5.1 Создать условие (если value.get(i) < min значения, то min значение = value.get(i) И minIndex = i;
    //5.2 и если (value.get(i) > max значения), то max значение = value.get(i) и maxIndex = i;
    //6. Положить в ячейку с minIndex значение max значение
    //7. Положить в ячейку с maxIndex значение min значение

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> value = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            value.add(random.nextInt(101));
        }
        System.out.println(value);
        int min = value.get(0);
        int max = value.get(0);
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < value.size(); i++) {
            if (value.get(i) < min){
                min = value.get(i);
                minIndex = i;
            }
            if (value.get(i) > max){
                max = value.get(i);
                maxIndex = i;
            }
        }
        value.set(minIndex, max);
        value.set(maxIndex, min);

        System.out.println(value);
    }
}
