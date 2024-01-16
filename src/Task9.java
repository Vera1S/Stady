import java.util.Scanner;

public class Task9 {
    //Есть n ящиков
    //Есть k ежиков
    //напишите, Да, если найдется хотя бы один ящик, где 2 или более ежиков
    //
    //1. Создать сканер
    //2. Считать со сканера переменные n и  k
    //3. Написать условие: Если количество ящиков равно или больше количеству ежей, то влезает
    //   Если количество ящиков меньше чем количество ежей, то не влезает
    //4. Вывести на экран ответ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hedgehog = scanner.nextInt();
        int box = scanner.nextInt();

        if (box >= hedgehog) {
            System.out.println("Ежики в ящике");
        } else {
            System.out.println("Не все ежики влезли в ящик");
        }
    }
}
