import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {

        // Değişkenler
        int a, b;
        double c;

        // istenilenler
        Scanner input = new Scanner(System.in);
        System.out.print("üçgenin a kenarını giriniz ");
        a = input.nextInt();

        System.out.print("üçgenin b kenarını giriniz ");
        b = input.nextInt();

        // sonuç
        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Üçkenin hipotenüs değeri : " + c + " dir.");

    }
}
