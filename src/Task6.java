import java.util.Scanner;

public class Task6 {
    //Требуется определить, бьет ли слон, стоящий на клетке с указанными координатами (номер строки и номер столбца),
    // фигуру, стоящую на другой указанной клетке.
    //Входные данные
    //Вводятся четыре числа: координаты слона и координаты другой фигуры. Координаты - целые числа в интервале от 1 до 8.
    //
    //Выходные данные
    //Требуется вывести слово YES, если слон способен побить фигуру за 1 ход, в противном случае вывести слово NO
    //
    //Примеры
    //входные данные
    //1
    //1
    //5
    //5
    //выходные данные
    //YES
    //входные данные
    //3
    //2
    //2
    //2
    //выходные данные
    //NO
    //1. Сравнить столбцы со строками.
    //2. Если строки со столбцами совпадают и совпадают , то верно
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wColumn = scanner.nextInt();
        int wRow = scanner.nextInt();
        int bColumn = scanner.nextInt();
        int bRow = scanner.nextInt();

        if (wColumn == wRow && bColumn == bRow){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }

    }
}
