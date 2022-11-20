import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість клієнтів");
        int N = scanner.nextInt();  //N < 13, щоб не трапилось переповнення int
        int result = 1;
        do {
            result *=N;
            N--;
        }
        while (N > 0);
        System.out.println("Кількість можливих варіантів доставлення товару - " + result);
    }
}
