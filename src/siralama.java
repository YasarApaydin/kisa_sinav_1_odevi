
import java.util.Random;
import java.util.Scanner;

public class siralama {
    public static void main(String[] args) {

        Random rastgele = new Random();//Random sınıfını ekleme

        int[] dizi = new int[10000];//dizimizin boyutunu belirleme

        for (int x = 0; x < dizi.length; x++) {
            int rastgeleSayi = rastgele.nextInt(10000) + 1;//Dizimizin icine random olarak 10000veri atma
            dizi[x] = rastgeleSayi;
        }


        for (int k = 0; k < dizi.length; k++) {
            System.out.print(dizi[k] + " ");//Dizimizi yazdırma
        }

        System.out.println("\n\n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Aranan Değeri Giriniz: ");
     int   aranan = scan.nextInt();//İstediğimiz Değer Yazilır.
arama(dizi,aranan);

    }
public static void arama(int x[],int arananDeger){

    for (int i=0; i < x.length; i++)
    {
        if (arananDeger == x[i])  //Aranan Değere Bakar indis Numarasına Göre
        {
            System.out.println(i+" indisli aranan değer: "+x[i]);
        }else{
            System.out.println("-1");//Yoksa -1 Yazar ve fonksiyonu sonlandırır
            break;
        }
    }
}




}
