
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen satır sayısını giriniz: ");
        int level = input.nextInt();

        for (int i = level; i >= 1; i--) {
            for (int j = 0; j < level - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}