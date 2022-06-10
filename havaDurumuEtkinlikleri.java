import java.util.Scanner;
    
/*Koşullar :

Sıcaklık 5'den küçük ise "Kayak" yapsın.
Sıcaklık 5 ve 15 arasında ise "Sinema" izlesin.
Sıcaklık 15 ve 25 arasında ise "Piknik" yapsın.
Sıcaklık 25'ten büyük ise "Yüzme" ye gitsin.
*/
    public class havaDurumuEtkinlikleri {
        public static void main(String[] args)
        {
            Scanner scanner=new Scanner(System.in);
            int heat;
            System.out.print("Sıcaklık değerini giriniz: ");
            heat=scanner.nextInt();
    
            if(heat<=5)
                System.out.println("Kayak yapabilirsiniz");
            else if(heat>5 && heat<=15)
                System.out.println("Sinema izleyebilirsiniz");
            else if (heat>15 && heat<=25)
                System.out.println("Piknik yapabilirsiniz");
            else if(heat>25)
                System.out.println("Yüzebilirsiniz");
            else
                System.out.println("Bu hava da çıkmanız sağlığınız için uygun değil.");
    
        }
    } 

