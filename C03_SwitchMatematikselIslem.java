package day09_OdevlerSwitch;

import java.util.Scanner;

public class C03_SwitchMatematikselIslem {
    public static void main(String[] args) {
        //kullanicidan bir sayi isteyin sayi
        //10 ise "iki basamakli en kücük sayi"
        //100 ise "üc basamakli en kücük sayi"
        //1000 ise "dört basamakli en kücük sayi"
        //diger durumlarda girdigin sayiyi degistir

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi giriniz:");
        int sayi=scanner.nextInt();

        switch (sayi) {
            case 10 :
                System.out.println("iki basamakli en kücük sayi");
                break;
            case 100 :
                System.out.println("üc basamakli en kücük sayi");
                break;
            case 1000 :
                System.out.println("dört basamakli en kücük sayi");
                break;
            default:
                System.out.println("girdigin sayiyi degistir");

        }



    }
}
