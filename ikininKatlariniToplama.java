import java.util.Scanner;
public class ikininKatlariniToplama {
    
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int n;
 System.out.println("sınır değeri giriniz ?");
 n = input.nextInt();
 for (int i = 1; i < n ; i=i*2) {
    System.out.println(i);
 }
    
 }

}
