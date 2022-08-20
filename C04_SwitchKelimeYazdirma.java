package day09_OdevlerSwitch;

import java.util.Scanner;

public class C04_SwitchKelimeYazdirma {
    public static void main(String[] args) {
        /*kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse "In Testing" yazdirin
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("SDET harflerinden birini girin:");
        char ilkHarf = scanner.next().toUpperCase().charAt(0);

        switch (ilkHarf) {
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("gecerli harf girin");
        }

    }
}
