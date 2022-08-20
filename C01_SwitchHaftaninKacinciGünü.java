package day09_OdevlerSwitch;

import java.util.Scanner;

public class C01_SwitchHaftaninKacinciGünü {
    public static void main(String[] args) {
        //kullanicidan haftanin kacinci günü oldugunu sorun ve gün ismini yazdirin
        Scanner scanner = new Scanner(System.in);
        System.out.println("haftanin kacinci günü:");
        int günNo = scanner.nextInt();

        switch (günNo) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                    System.out.println("pazar");
                    break;
            default:
                System.out.println("gecerli gün no girin");
        }

    }
}
