package advenced02;

import java.util.Scanner;

public class S01_ternary_If<sout> {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yaş giriniz");
        int yas = scan.nextInt();
        System.out.println("kilo giriniz");
        int kilo = scan.nextInt();

        if (yas > 0 && yas < 18) {
            System.out.println("kan bağışı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {
                System.out.println("yaşınız uygun ama kilonız bağış için yeterli değil");}
                        else if (kilo >= 50) {
                    System.out.println("kan bağışı yapabilir");

            }} else System.out.println("geçerli bir yaş giriniz");

        }


        }