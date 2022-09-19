public class For_while_doWhile {
    //For - While ve Do While donguleri :
    public static void main(String[] args) {
        //1 ile  10 arasindaki sayilari siralayalim ;

        System.out.println("For Dongusu ile : ");
        for (int sayi = 1; sayi <=10 ; sayi++) {
            System.out.println("Sayilar : "+sayi);
        }

        System.out.println(" ");
        System.out.println("While Dongusu ile : ");
        int sayi = 0;
        while ( sayi<10){
            sayi++;
            System.out.println("Sayilar : "+sayi);
        }
//While de sart saglanmaz ise donguye girmez , ancak do while'de sart saglanmasa dahi donguye girer.
// Cunku satır satır calisir ve en az bir kere calismak zorundadır.
        System.out.println(" ");
        System.out.println("doWhile Dongusu ile : ");
        int i = 1;
        do {
            System.out.println("Sayilar : "+i);
            i++;
        }while (i<=10);
    }
}
