import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double anaPara ;
        double kdvliTutar;
        System.out.println("Ana para tutarını giriniz; ");
        anaPara = input.nextInt();
        kdvliTutar = anaPara + (anaPara/100)*18;
        System.out.println("Kdv Hesaplama sonucunuz :" + kdvliTutar );
    }
}
