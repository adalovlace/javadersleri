import java.util.Scanner;
public class bedenKitleindeksi {
    /*
    Vücut kitle indeksi, kişinin kilosunun ağırlığına oranla ölçülmesi olarak tanımlanabilir. Farklı bir deyişle kişinin kilogram cinsinden ağırlığının, metre cinsinden uzunluğunun karesine bölünmesiyle elde edilir.
    Kilo (kg) / Boy(m) * Boy(m)
    */
    public static void main(String[] args) {

        // Değişkenler
        int weight;
        double size;

        // Kullanıcı Verileri Nelerdir?

        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuz? : ");
        weight = input.nextInt();

        System.out.print("Boyunuzu (metre cinsinde) giriniz: ");
        size = input.nextDouble();

        // Hesaplama sonucu
        
        System.out.print("Vücut kitle endeksiniz: " + (weight / size * size));
    }
}
