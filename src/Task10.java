import java.util.Scanner;

public class Task10 {
    //Последовательность чисел Фибоначчи определяется формулой Fn = Fn-1 + Fn-2. То есть, следующее число получается,
    // как сумма двух предыдущих.
    //
    //Первые два числа равны 1, затем 2(1+1), затем 3(1+2), 5(2+3) и так далее: 1, 1, 2, 3, 5, 8, 13, 21....
    //
    //Числа Фибоначчи тесно связаны с золотым сечением и множеством природных явлений вокруг нас.
    //F100 = F99-1 + Fn-2

    //F5 = F(4)+F(3)
    //1. Создать сканер для считывания числа
    //2. Считать число = sc.nextInt();
    //3. Создать массив int[], его размер равен считываемому числу
    //4. Нужно массиву задать первые два числа это 1 и 1 array[0] = 1; array[1] = 1;
    //5. Создать цикл for (int i = 2; i < array.length(); i++){
    //6. array[i] = array[i - 1] + array[i - 2]};

    //6.1 Значение - array[i] - это текущий элемент массива под именем array и под индексом [2],
    //(в цикле указан, как int i = 2; - начинаем заполнять массив со второго индекса. И твое значение будет ровнятся,
    //значению, которое указано, после равно (= array под индексом [1] + array под индексом [0];)

    //6.2 array[i - 1] - это предыдущий элемент массива (array под индексом [1]), который является результатом
    // вычитания двух i-индексов, таких как: array под индексом [2] минус 1 равняется сумме array под индексом [1].

    //6.3 array[i - 2] - это элемент, стоящий перед предыдущим элементом массива array под индексом [0].
    //который является результатом вычитания двух i-индексов, таких как:
    //array под индексом [2] минус 2 равняется сумме array под индексом [0].

    //6.4 Учитывая выше изложенный алгоритм вычитания последовательности чисел Фибоначчи по формуле Fn = Fn-1 + Fn-2,
    //будем понимать, так: array[2] это (Fn) = array[1] это (Fn-1) + array[0] это (Fn-2);
    //получается значения под индексами (0 и 1) - array[0] = 1 и array[1] = 1,
    //третий элемент массива будет равен: сумме сложения двух чисел, котрый равен двум: array[2] = 1 + 1;

    //7. Вывести на экран последний элемент значения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");

        int length = scanner.nextInt();

        int[] array = new int[length];
        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println("Элементы массива: ");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


