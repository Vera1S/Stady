import java.util.Scanner;
//Подсчитайте количество натуральных делителей числа x (включая 1 и само число);
//Входные данные
//Вводится натуральное число x.
//Выходные данные
//Выведите единственное число - количество делителей числа x.
//
//Примеры
//входные данные
//32
//выходные данные
//6
// 0. Считать число
//1. подряд смотрим все числа с 1 до x
//2. при делении входного числа на другое число - остатка быть не должно
//3. сделать в счетчике +1, если это делитель
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        count++;

        System.out.println(count);


    }
}