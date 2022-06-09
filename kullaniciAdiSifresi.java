import java.util.Scanner;
public class kullaniciAdiSifresi {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String username,password;

        System.out.println("Kullanıcı adınızı giriniz: ");
        username = input.nextLine();

        System.out.println("Kullanıcı şifrenizi giriniz: ");
        password = input.nextLine();

        if((password=="Dersleri")&&(username=="java")){
           System.out.println("Bilgileriniz doğrulandı sisteme hoş geldiniz :)");
             }else{
               System.out.println("Yanlış kullanıcı adı veya şifresi girildi!");
        }
    }
}
