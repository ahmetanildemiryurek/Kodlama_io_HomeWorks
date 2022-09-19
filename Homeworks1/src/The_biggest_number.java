import java.util.Scanner;
public class The_biggest_number{
    public static void main(String[] args) {

//Kullanicinin girdigi degerler arasından en buyuk sayiyi bulan program :

        Scanner scan = new Scanner(System.in);
        int sayi1 , sayi2, sayi3;
        System.out.println("3 adet birbirinden farkli sayi giriniz :");

        sayi1 = scan.nextInt();
        sayi2 = scan.nextInt();
        sayi3 = scan.nextInt();

            if (sayi2<sayi1 && sayi3<sayi1){
                System.out.println("En buyuk sayi : "+sayi1);
            }
            else if (sayi1<sayi2 && sayi3<sayi2){
            System.out.println("En buyuk sayi : "+sayi2);
            }
            else if (sayi1<sayi3 && sayi2<sayi3){
            System.out.println("En buyuk sayi : "+sayi3);
            }
            else if (sayi2==sayi1 || sayi3==sayi1 || sayi3==sayi2){
                System.out.println("Yanlis deger girdiniz !!!");
            }

    }
}
