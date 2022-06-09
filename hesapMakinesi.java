import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextInt();

        System.out.println("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-toplama, 2-çıkarma, 3-çarpma, 4-bölme");
        System.out.println("seçiminiz nedir acaba ?");
        select = input.nextInt();

        switch (select) {
            case 1:
            System.out.println(n1+n2);
                
                break;
            case 2:
            System.out.println(n1-n2);
                
                break;
            case 3:
            System.out.println(n1*n2);
                
                break;
            case 4:
                System.out.println(n1/n2);
                break;
        
            default:
            System.out.println("Yapmak istediğiniz işlemi yanlış belirtiniz.");
                break;
        }
    }
}
