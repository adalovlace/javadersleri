import java.util.Scanner;
public class DaireAlanVeCevre {
    public static void main(String[] args) {
    //ALAN VE ÇEVRE HESABI
        //Direde Alan Formülü : π * r * r;
        //Dairede Çevre Formülü : 2 * π * r;

            // Değişkenler
            int r;
            int açı;
            double alan;
            double pi = 3.14;
    
            // Kullanıcıdan verileri al
            Scanner input = new Scanner(System.in);
    
            System.out.print("Yarıçap değerini giriniz: ");
            r = input.nextInt();
    
            System.out.print("\nMerkez açısının ölçüsünü giriniz: ");
            açı = input.nextInt();
    
            // Dairenin alanını hesapla ve ekrana yazdır
            alan = (pi * (r * r) * açı) / 360;
    
            System.out.println("Girilen dairenin alanı: " + alan);
        }
        
    
    }