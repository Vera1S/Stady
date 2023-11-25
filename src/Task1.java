import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        // 1. Сканер, считать число
//2. цикл, который начинается с 2, а заканчивается нашим числом
//3. Если наше число делится на это число (i) без остатка, то
//4. вывести на экран это значение
//5. тут же остановить программу через break

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        //int secondNum = 15;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                num = i;
                break;
            }
        }
        System.out.println(num);
    }
}


