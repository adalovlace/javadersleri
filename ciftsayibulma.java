import java.util.Scanner;

public class ciftsayibulma {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");
        k = input.nextInt();

        for (int sayi = 1; sayi <= k; sayi++) {
            if (sayi % 2 == 0) {

                System.out.println(sayi);
            }
        }

    }
}
