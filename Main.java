import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenler
        double fiyat, kdv, tutar;
        //veri gir
        Scanner inp = new Scanner(System.in);

        System.out.println("Ürün Fiyatını Girin : ");
        fiyat = inp.nextDouble();

        //kdv hesapla: fiyat 1000 ve üzeri ise %8 değilse %18
        boolean karar = fiyat >= 1000;
        kdv = karar ? (fiyat*8/100) : (fiyat*18/100);

        //Sonuç yazdırma
        System.out.println("Ürüm Fiyatı : " + fiyat);
        System.out.println("KDV Tutarı : " + kdv);
        System.out.println("KDV'li Toplam Tutar : " + (fiyat+kdv));
        }
}

