import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        // variables
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // i have defined scanner class below.
        Scanner input = new Scanner(System.in);

        System.out.print("Write your math point: ");
        matematik = input.nextInt();

        System.out.print("Write your physic point: ");
        fizik = input.nextInt();

        System.out.print("Write your chemical point: ");
        kimya = input.nextInt();

        System.out.print("Write your Turkish point: ");
        turkce = input.nextInt();

        System.out.print("Write your history point: ");
        tarih = input.nextInt();

        System.out.print("Write your music point: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6;

        // Sınıf Geçip Geçmeme durumu
        if (sonuc <= 55) {
            System.out.println("Sınıfta Kaldınız, Umarım bir daha ki sefere çalışırsınız :)");

        } else {
            System.out.println("Tebrikler sınıfınızı başarıyla geçtiniz :)");
        }
        System.out.print("Avarge : " + sonuc);
    }

}
