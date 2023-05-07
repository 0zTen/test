package day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //java bu satiri okumaz, kendimize veya baskalarina aciklamadir.
        /*
        java bu satirlari da okumaz, daha uzun cumleler icin asteriksli slash kullanilabilir. psvm veya main shrtct.
         */

        //Variable nasil olusturulur?
        //Data Type + Variable name + Assignment Operator + Variable Value + ;
        int age = 13 ;
        //Variable declaration and assignment

        //java cumlesi == statement
        //syntaxde nokta, noktali virguldur
        //Eger variable declaration yapar, assignment yapmazsak default deger atanir == 0
        // javada "=" assignment operatordur ve java bu operatoru gordugu zaman once sag tarafi calistirir
        //ve sagdaki degeri alir, soldaki reserved areaya koyar
        // Data type + VariableName == Variable declaration
        //Assignment operator (=) + Variable Value == Assignment
        /*
        Data types== javada temelde iki tip data vardir;
        1)primitive data type:
            char, boolean, byte, short, int, long, float, double
        2)non-primitive data type:
            indefinitive i.e: string
         */
        //i.e 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayınız
        String ogrenciAdi = "Ali_Can" ;

        //Stringlere verilen degerler daima cift tirnak icinde olmalidir
        //stringler icin default value "null" dir
        /*
        string variable olusturuldugunda cogu zaman bir deger atanir. atama yapilmazsa null assignlanir.
        null sifir demek degildir, hiclik demektir.
        null demek icinde variable veya method bulunmayan bos bir objedir
        {} == null
         */
        //char data type:
        // Tek karakterler icin kullanillir. Sayi, sembol ya da harf.
        //i.e: A, x, 4, ?
        //i.e.2: char data typeinda bir ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        char isminIlkHarfi = 'A'  ;
        // char data typeinda degerler her zaman tek tirnaga alinir

        //boolean data type:
        //booleanlar sadece iki farkli deger alabilir; true veya false
        //isimlendirme yapilirken basina is konulur.
        // i.e: boolean data typeinda emeklimisin sorusu icin bir variable olusturun ve false degerini atayin
        boolean isRetired = false;

        //byte data type:
        //tam sayilar icindir, hafizada 1 byte kaplar
        //byte: -128 den +127 ye (dahil) tamsayi degerleri icin kullanilir.
        //i.e: byte data typeinda ogrenci yasi icin bir variable olusturun ve deger atayin
        byte studentAge = 24;

        // short data type:
        // tamsayilar icindir, hafizada 2 byte yer kaplar
        // short: -32768 den + 32767 ye tamsayi degerlerini kapsar

        short siteNufusu = 1780;

        //int data type:
        //tamsayilar icindir hafizada 4 byte yer kaplar
        //int: -2,147,483,648 ile 2,147,483,647 arasi tamsayilarda kullanilir
        //i.e
        int  ulkeNufusu = 1000000000;

        //long data type:
        //tamsayilar icindir, hafizada 8 byte yer kaplar
        //long: -9 centrillion ile + 9 centrillion
        long cellNumberInHumanBody = 3400000000000L;
        //note: bir deger long ise sonuna "L" konur.
        //note: eger longa atanan deger int araligindaysa sonuna "L" koymaya gerek yok
        //note: long dememize ragmen sonuna "L" koyulmazsa ve deger int araligindaysa java onu int kabul eder.

        //float data type:
        //(decimal numbers) icin kullanilir.(fiyatlandirmalar)
        //i.e: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturun
        float shirtPrice = 12.99F;
        float shoesPrice = 15.99F;
        //Note: Java decimal sayilari otomatik olarak double kabul eder
        //float olmasinda israr edilirse sonuna "F" veya "f" koyulur
        //float 4 byte yer kaplar

        //double data type:
        //double memoryde 8 byte yer kaplar
        //floata nazaran ondalikli kisimda daha fazla rakam kullanilabilir.
        //hucre agirligi ve amip'in agirligi icin bir variable olusturunuz
        double weigthCell = 0.00000000000113;
        double weightAmibea= 0.0000000000050;

        //i.e code running
        //ogrenci notlari icin 2 adet variable olusturunuz ve toplamlarini ekrana yazdiriniz
        byte studentGrade1 = 87;
        byte studentGrade2 = 23;
            System.out.println(studentGrade1+studentGrade2);

        /*
        Homework: 3 farkli data typeda variable oluşturup farkli satirlarda yazdirim
        ulke ve sehir isimleri icin iki variable olusturun ve bunlari yazdirin
        iki tamsayi turunde variable olusturup toplamini yazdirin
         */

    }


  }
