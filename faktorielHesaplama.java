import java.util.Scanner;

public class faktorielHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int total = 1;

        System.out.println("lütfen sayi giriniz ?");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // System.out.println(i);
              total = total * i;
            }
            
            System.out.println(n+". Fakttöriyel = "+total);
    }
}
