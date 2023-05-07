package day03methodobjectcreationscanner;

import java.util.Scanner;

public class MethodCreation01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sayi1,decimalCube;
        System.out.println("sayi?");
        sayi1= scan.nextDouble();
        decimalCube= decimalCube(sayi1);
        System.out.println("decimalcube = " + decimalCube);

    }

    //i.e: verilen bir ondalık sayinin kupunu hesaplayan method olusturunuz
    public static double decimalCube(double sayi1) {
    double decimalCube;
    decimalCube = (sayi1*sayi1*sayi1);
    return decimalCube;

    }
}

