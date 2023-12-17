import java.util.Scanner;

public class Task8 {
    //Найти периметр прямоугольника
    //Формула Р = а + а + b + b;
    // P = a * 2 + b * 2;
    // P = (a + b) * 2
    //
    //Напишите функцию, которая позволит найти периметр прямоугольника, зная его ширину (width) и длину (length).
    //Примечание
    //Не забудьте вернуть результат с помощью оператора return.

    //1. Создать статический метод с аргументами  - это для того, чтобы не создавать отдельный класс
    //(public int perimeter (int width, int length){)
    //2. Создать переменую resultPer = (width + length) * 2;
    //3. Вернуть полученный результат return resultPer;
    //4. Создать метод main в котором будет вызываться метод perimeter
    //5. Создать сканер считывающий введенные числа ширину (width) и длину (length)
    //6. Создать переменую, в которой будет ссылка на метод perimeter с аргументами
    //7. И вывод на экран System.out.println("Периметр прямоугольника: " + resultTotal);

    public static int perimeter(int width, int length){
        int resultPer = (width + length) * 2;
        return resultPer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число width");
        int width = scanner.nextInt();
        System.out.println("Введите число length");
        int length = scanner.nextInt();

        int resultTotal = perimeter(width, length);

        System.out.println("Периметр прямоугольника: " + resultTotal);
    }

}
