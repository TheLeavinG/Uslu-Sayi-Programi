import java.util.Scanner;
public class Uslusayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n,r;
        int toplam = 1;

        System.out.print("Ussu Alinacak Sayiyi Giriniz : ");
        n = input.nextInt();
        System.out.print("Us Olan Sayiyi Giriniz : ");
        r = input.nextInt();


        for (int i =1; i<=r; i++){

            toplam *=n;

        }

           System.out.print(toplam);

    }

}
