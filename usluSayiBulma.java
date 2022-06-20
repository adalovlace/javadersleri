import java.util.Scanner;

public class usluSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, k;
        int total = 1;

        System.out.print("Üssü alınacak sayı:");
        n = input.nextInt();

        System.out.println("Üs olacak sayı:");
        k = input.nextInt();

        for (int i = 1; i <= k; i++) {

            total *= n;

        }

        System.out.println(n + " üssü " + k + " = " + total +"sayısına eşittir.");
    }
}
