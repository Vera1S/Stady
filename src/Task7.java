import java.util.Scanner;

public class Task7 {
    //Дается количество лет
    //необходимо узнать, сколько прошло за эти года дней
    //каждый високосный год через 4 года
    //1. Умножить года на 365 дней
    //2. Количество лет поделить на 4
    //3. Сложить пункт 1 с пунктом 2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        int resultDay = years * 365;
        int leapYear = years / 4;
        int resultTotal = resultDay + leapYear;

        System.out.println(resultTotal);

    }
}
