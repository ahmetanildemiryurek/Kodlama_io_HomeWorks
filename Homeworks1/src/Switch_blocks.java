public class Switch_blocks {
    /* Switch bloklari if bloklarina göre daha az kullanilir.
        calisma mantiklari aynidir.
        dallandirma yaparken kullaniriz.
*/
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade){
            case 'A' :
                System.out.println("Tebrikler yüksek not ile gectiniz !");
                break;

            case 'B' :
                System.out.println("Tebrikler iyi not ile gectiniz !");
                break;
            case 'C' :
                System.out.println("Tebrikler not ile gectiniz !");
                break;
            case 'D' :
                System.out.println("Kil payi not ile gectiniz !");
                break;
            case 'F' :
                System.out.println("Maalesef kaldiniz!");
                break;
        }
    }
}

