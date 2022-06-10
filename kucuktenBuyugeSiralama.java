import java.util.Scanner;
public class kucuktenBuyugeSiralama {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,c;
    
     System.out.println("a sayısnı giriniz: ");
     a = input.nextInt();
     
     System.out.println("b sayısnı giriniz: ");
     b = input.nextInt();
     
     System.out.println("c sayısnı giriniz: ");
     c = input.nextInt();
     
       if((a<b)&&(a<c)){
           System.out.println("a en küçük sayıdır");
          }else if((a>b)&&(a>c)){
              System.out.println("a en büyük sayıdır");
          }else{
              System.out.println("a ortanca sayıdır");
          }
  
          
          if((b<a)&&(b<c)){
              System.out.println("b en küçük sayıdır");
          }else if((b>a)&&(b>c)){
              System.out.println("b en büyük sayıdır");
          }else{
              System.out.println("b ortanca sayıdır");
          }

        if((c<b)&&(c<a)){
            System.out.println("c en küçük sayıdır");
           }else if((c>b)&&(c>a)){
               System.out.println("c en büyük sayıdır");
           }else{
               System.out.println("c ortanca sayıdır");
           }
    }
}