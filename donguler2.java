import java.util.Scanner;


public class donguler2 {
    public static void main(String[] args) {

        int n, toplam=0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Lütfen Bir Değer Giriniz");
            n = input.nextInt();
            if (n % 2 == 1) {
                System.out.println("Lütfen Çift Bir Değer Giriniz");
            } else if (n % 2 != 1 && n % 4 == 0) {
                toplam += n;
            }


        } while (n % 2 == 0);
        System.out.println("Çift ve 4 ün katı olan sayıların toplamı : " +  toplam);


    }
}
