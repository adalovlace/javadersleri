import java.util.Scanner;
public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yön;
        int km, yaş;
        double ücret;
        
        System.out.println("Kaç km yolculuk yapacaksınız?");
        km = input.nextInt();

        System.out.println("Yaşınız?");
        yaş = input.nextInt();

        System.out.println("Gidiş yönünüz nedir ?");
        yön = input.nextInt();

        ücret = km * 0.10;

        if (yaş < 12) {
            System.out.println("Bilet Fiyatınız: " + ücret * 0.5);
            
        } else if ((yaş > 12) || (yaş < 24)) {
            System.out.println("Bilet Fiyatınız: " + (ücret - ücret * 0.1));

        } else if (yaş > 65) {
            System.out.println("Bilet Fiyatınız: " + (ücret - ücret * 0.3));

        } else if (yön == 2) {
            System.out.println("Bilet Fiyatınız: " + (ücret - ücret * 0.2));

        } else if (yön == 1) {
            System.out.println("Bilet Fiyatınız: " + (ücret));

        } else {
            System.out.println("Hatalı veri girdiniz..");
        }
    }
}
