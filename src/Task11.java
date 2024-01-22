import java.util.Scanner;

public class Task11 {
    //В каждую крайнюю клетку квадратной доски поставили по фишке. Могло ли оказаться, что выставлено ровно k
    // фишек? (Например, если доска 2×2
    //, то выставлено 4
    // фишки, а если 6×6
    // - то 20
    //).
    //
    //Входные данные
    //Вводится одно натуральное число k
    //, не превосходящее 30000
    //
    //Выходные данные
    //Программа должна вывести слово YES, если существует такой размер доски, на
    // который будет выставлено ровно (не больше, и не меньше) k
    // фишек, в противном случае - вывести слово NO.
    //
    //Примеры
    //входные данные
    //20
    //выходные данные
    //YES
    //входные данные
    //13
    //выходные данные
    //NO

    //1. Создать Scaner
    //2. Создать переменную a, которая считывает число
    //3. Сделать проверку на делимость на 4 (if int a % 4 == 0)
    //4. Сделать проверку на равенство 1 (if a == 1)
    //5. Если сработало, или 3, или 4 уловие, то вернуть true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Если надо остановить набери -1000");
        while (0 == 0) {  //true
            int a = scanner.nextInt();
            if (a == -1000){
                break;
            }

            if (a % 4 == 0 || a == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}