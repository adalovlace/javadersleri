import java.util.Scanner;

public class artikYil {

    public static void main(String[] args) {
        // artik yil hesaplama programı

        int yil;

        Scanner input = new Scanner(System.in);

        System.out.println(" Sorgulamak istediğiniz yılı giriniz :) ");
        yil = input.nextInt();

        if (yil > 0) {
            if (yil % 4 == 0) {
                if (yil % 100 == 0) {
                    if (yil % 400 == 0) {
                        System.out.println(yil + " Artık yıldır.");
                    } else {
                        System.out.println(yil + " Artık yıl değildir.");
                    }
                } else {
                    System.out.println(yil + " Artık yıldır");
                }
            } else {
                System.out.println(yil + " Artık yıl değildir");
            }
        } else {
            System.out.println("Girilen değer tanım aralığı dışındadır.");
        }
    }

}
