import java.util.Scanner; //Scanner kutuphanesi.
public class Is_Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Kullanicidan sayi alacagimiz icin yazdik.

        System.out.print("Bir sayi giriniz: ");
        int number = scan.nextInt();
        boolean prime;

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                prime = false; }

            }
        if (number % 2 == 0) {
                System.out.println( number + " Asal bir sayi degildir.");
            } else if (number<1) {
            System.out.println( number+" Gecersiz bir sayidir !");
        } else {
                prime = true;
                System.out.println( number + " asal bir sayidir");
            }
        }
    }


