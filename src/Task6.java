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
    //1. Нужно вычесть число 1й колонки из числа  2й колонки (и записать в переменную)
    //2. Нужно вычесть из 1й строки вычесть другое число строки (и записать в переменную)
    //3. Если абсолютное значение колонки равна абсолютному значению строки, то верно
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int wColumn = scanner.nextInt();
        int wRow = scanner.nextInt();
        int bColumn = scanner.nextInt();
        int bRow = scanner.nextInt();

        int resultColumn = wColumn - bColumn;  // или Math.abs(wColumn - bColumn)
        int resultRow = wRow - bRow;           // Math.abs(wRow - bRow)
        if (Math.abs(resultColumn) == Math.abs(resultRow)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
