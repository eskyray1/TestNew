import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        String operation = null;
        System.out.println("Введите число");


        a = scanner.nextInt();
        if (a < 1 || a > 10){
            System.out.println("Ошибка");
            return;

        }
        operation = scanner.next();

        b = scanner.nextInt();
        if (b < 1 || b > 10){
            System.out.println("Фатальная ошибка");
            return;
        }

        if (operation.equals("+")) {
            System.out.println(a + b);
            return;
        }
        if (operation.equals("-")) {
            System.out.println(a - b);
            return;
        }else{
            System.out.println("БигФэкс Ошибка");
        }
    }
}