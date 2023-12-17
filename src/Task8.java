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
    //2. Создать переменную resultPer = (width + length) * 2;
    //3. Вернуть полученный результат return resultPer;
    //4. Создать метод main в котором будет вызываться метод perimeter
    //5. Создать сканер считывающий введенные числа ширину (width) и длину (length)
    //6. Создать переменную, в которой будет ссылка на метод perimeter с аргументами
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
//Если через принципы ООП, то тогда нужно:
//1. Создать класс Perimeter с полями: private int width; private int length;
//2. Создать конструктор, геттеры, сеттеры
//3. и метод public int calculatePerimeter() {
//        return 2 * (width + length);
//    }
//4. Создать метод main, в котором будет вызываться метод calculatePerimeter()
//5. Создать сканер считывающий введенные числа ширину (width) и длину (length)
//6. Создать объект или экземпляр класса класса Perimeter per = new Perimeter(width, length);
//7. Вызывать метод calculatePerimeter() на объекте per через точку: (= per.calculatePerimeter();) - который вычисляет периметр
//   прямоугольника, и возвращает результат в переменую: (resultTotal)
//8. Создать переменную int resultTotal, которая будет хранить в себе ссылку результата, возвращаемого метода calculatePerimeter(),
//   присвоенной переменной resultTotal.
//   Теперь переменная resultTotal содержит значение периметра прямоугольника, рассчитанное методом: int resultTotal = per.calculatePerimeter();
//9. Вывод на экран System.out.println("Периметр прямоугольника: " + resultTotal);

//public class Perimeter {
//
//    private int width;
//    private int length;
//
//    public Perimeter(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int calculatePerimeter() {  //пункт 3
//        return 2 * (width + length);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите число width");
//        int width = scanner.nextInt();
//        System.out.println("Введите число length");
//        int length = scanner.nextInt();
//
//        Perimeter per = new Perimeter(width, length); //пункт 6
//        int resultTotal = per.calculatePerimeter();   //пункт 7 и 8
//
//        System.out.println("Периметр прямоугольника: " + resultTotal); //пункт 9
//    }
//}