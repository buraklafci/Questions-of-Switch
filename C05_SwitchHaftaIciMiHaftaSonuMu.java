package day09_OdevlerSwitch;

import java.util.Scanner;

public class C05_SwitchHaftaIciMiHaftaSonuMu {
    public static void main(String[] args) {
        //kullanicidan bir gün isteyin h.icimi h.sonumu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün ismi giriniz:");
        String günİsmi = scanner.next().toUpperCase();

        switch (günİsmi){
            case "PAZARTESİ":
            case "SALİ":
            case "CARSAMBA":
            case "PERSEMBE":
            case "CUMA":
                System.out.println("girilen gün haftaiçidir");
                break;
            case "CUMARTESİ":
            case "PAZAR":
                System.out.println("girilen gün haftasonudur");
                break;
            default:
                System.out.println("gecerli gün giriniz");
        }



    }
}
