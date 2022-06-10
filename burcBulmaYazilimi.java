import java.util.Scanner;
public class burcBulmaYazilimi{
        public static void main(String[] args) {
    
            int day;
            int month;
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Doğduğunuz ay: ");
            month = scanner.nextInt();
    
            System.out.print("Doğduğunuz gün: ");
            day = scanner.nextInt();
    
            String burc = "";
            boolean isError = false;
    
            if(month == 1 && day >= 1 && day <= 31) {
                if(day <= 21) {
                    burc = "Oğlak Burcu";
                    System.out.println("Oğlak burcusunuz.");
                } else {
                    burc = "Kova Burcu";
                    System.out.println("Kova burcusunuz.");
                }
            } else if(month == 2 && day >= 1 && day <= 29) {
                if (day <= 19) {
                    burc = "Kova Burcu";
                    System.out.println("Kova burcusunuz.");
                } else {
                    burc = "Balık Burcu";
                    System.out.println("Balık burcusunuz.");
                }
            } else if(month == 3 && day >= 1 && day <= 31) {
                if (day <= 20) {
                    burc = "Balık Burcu";
                    System.out.println("Balık burcusunuz.");
                } else {
                    burc = "Koç Burcu";
                    System.out.println("Koç burcusunuz.");
                }
            } else if (month == 4 && day >= 1 && day <= 30) {
                if (day <= 20) {
                    burc = "Koç Burcu";
                    System.out.println("Koç burcusunuz.");
                } else {
                    burc = "Boğa Burcu";
                    System.out.println("Boğa burcusunuz.");
                }
            } else if (month == 5 && day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Boğa Burcu";
                    System.out.println("Boğa burcusunuz.");
                } else {
                    burc = "İkizler Burcu";
                    System.out.println("ikizler burcusunuz.");
                }
            } else if (month == 6 && day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "İkizler Burcu";
                    System.out.println("ikizler burcusunuz.");
                } else {
                    burc = "Yengeç Burcu";
                    System.out.println("yengeç burcusunuz.");
                }
            } else if (month == 7 && day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Yengeç Burcu";
                    System.out.println("yengeç burcusunuz.");
                } else {
                    burc = "Aslan Burcu";
                    System.out.println("Aslan burcusunuz.");
                }
            } else if (month == 8 && day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Aslan Burcu";
                    System.out.println("Aslan burcusunuz.");
                } else {
                    burc = "Başak Burcu";
                    System.out.println("Başak burcusunuz.");
                }
            } else if (month == 9 && day >= 1 && day <= 30) {
                if (day <= 22) {
                    burc = "Başak Burcu";
                    System.out.println("Başak burcusunuz.");
                } else {
                    burc = "Terazi Burcu";
                    System.out.println("Terazi burcusunuz.");
                }
            } else if (month == 10 && day >= 1 && day <= 31) {
                if (day <= 22) {
                    burc = "Terazi Burcu";
                    System.out.println("Terazi burcusunuz.");
                } else {
                    burc = "Akrep Burcu";
                    System.out.println("Akrep burcusunuz.");
                }
            } else if (month == 11 && day >= 1 && day <= 30) {
                if (day <= 21) {
                    burc = "Akrep Burcu";
                    System.out.println("Akrep burcusunuz.");
                } else {
                    burc = "Yay Burcu";
                    System.out.println("Yay burcusunuz.");
                }
            } else if (month == 12 && day >= 1 && day <= 31) {
                if (day <= 21) {
                    burc = "Yay Burcu";
                    System.out.println("Yay burcusunuz.");
                } else {
                    burc = "Oğlak Burcu";
                    System.out.println("Oğlak burcusunuz.");
                }
            } else {
                isError = true;
            } 
        }
    }
        
