import java.util.Scanner;

public class Task5 {
    //Ввод и вывод данных производятся через стандартные потоки ввода-вывода.
    //Требуется определить, бьет ли ладья, стоящая на клетке с указанными координатами (номер строки и номер столбца),
    // фигуру, стоящую на другой указанной клетке.
    //Входные данные
    //Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа), каждое число вводится в
    // отдельной строке. Координаты - целые числа в интервале от 1 до 8.
    //
    //Выходные данные
    //Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход и NO - в противном случае.
    //
    //Примеры
    //входные данные
    //1
    //1
    //2
    //2
    //выходные данные
    //NO
    //входные данные
    //1
    //1
    //2
    //1
    //выходные данные
    //YES

    //1. Сравнить столбцы со столбцами и сравнить строки со строками.
    //2. Если строки со строками совпадают или столбцы со столбцами,  то верно
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int aColumn = scanner.nextInt();
        int bRow = scanner.nextInt();
        int cColumn = scanner.nextInt();
        int dRow = scanner.nextInt();

        if (aColumn == cColumn || bRow == dRow) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
