import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, sub = 0;

        boolean isNegative = false;
        Scanner giris = new Scanner(System.in);

        while(!isNegative){
            System.out.print("Lütfen bir sayı giriniz : ");
            sayi = giris.nextInt();

            if (sayi % 2 == 1){
                sub += sayi;
                System.out.println("Girilen tek sayılar : " + sayi);
            }else if(sayi < 0){
                isNegative = true;
            }
        }
        System.out.println("Girilen tek sayıların toplamı : " + sub);
    }
}