package day02datatypesmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {
     int sonuc1 =toplamaM( 3, 5);
        System.out.println("Sonuc1 =" +" " + sonuc1);
     int sonuc2 = multiplyM(13, 13);
        System.out.println("Sonuc2 =" + " " + sonuc2);
     int sonuc3 = complexM(4, 5, 6);
        System.out.println("Sonuc3 =" + " " + sonuc3);




    }
    public static int toplamaM(int a, int b) {/*bu kisimda method kapsaminda kullanilmasini ve
        islenmesini istedigimiz datalari deklare ederiz */
        return a+b;
    }
    protected static int multiplyM(int a , int b) {
        return a*b;
    }

    public static int complexM(int a , int b , int c){
        return a*b+c;
    }

    /*
    Javada method nasil olusturulur?
    1) main method disi, class icinde olur
    2) Access Modifier + return type + method name + () + {}

    olusturulan methodlar nasil kullanilir?
    1) Methodu olusturmak calistirmak icin yeterli degildir, kullanilmak istenen method,
       main methodun icinden kullanilir
    2) methodun ismi + ()
       varsa islem yapilacak datalari parantezin icine koyun
    3) methodun ismi + parametreler method signature olarak adlandirilir
     */
    //i.e1 toplama islemi yapan bir method olusturunuz ve kullaniniz



}
