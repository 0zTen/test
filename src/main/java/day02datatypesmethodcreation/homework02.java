package day02datatypesmethodcreation;

import java.util.Scanner;

public class homework02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kk, uk, cevre, alan;
        System.out.println("kenar1gir");
        kk = scan.nextInt();
        System.out.println("kenar2gir");
        uk= scan.nextInt();
        cevre = cevre(kk, uk);
        System.out.println("cevre = " + cevre);
        alan = alan(kk, uk);
        System.out.println("alan = " + alan);
    }


    public static int alan(int kk, int uk) {
        int alan;
        alan = kk*uk;
        return alan;


    }
    public static int cevre(int kk, int uk){
        int cevre;
        cevre = 2*(kk+uk);
        return cevre;

    }

}
