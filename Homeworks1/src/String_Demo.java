public class String_Demo {
    public static void main(String[] args) {
        double[] mylist = {1.2, 1.3,2.4,3.4};
        double total = 0;
        double max = mylist[0];

        for (double number : mylist){ //Dizimizin her bir elemanina number fakename'ini vererek
                                      // myList arrey'imizi gezdirdik ve max degeri kiyaslayarak bulduk.(For/Each yapisi)
            if (max < number){
                max = number ;
            }
            total = total + number; //toplama islemini yaptirdik.
            System.out.println(number);
        }
        System.out.println("Toplam : "+total);
        System.out.println("En Buyuk : "+max);
    }
}
