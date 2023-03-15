import java.util.Random;

public class BuyukDeger {
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
        int enbuyuk = 0;

        for(int i = 0; i < dizi.length; i++)//Dizinin Değeri Kadar Döndürür.
        {


            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];//Diizinin bir sonraki elemanla suanki elemanı karşılaştırır eğer
            }//Büyükse enbuyuk Değişkeni o olur ve sürekli değişir Dizinin Sonuna Kadar Bakar
        }
        System.out.println("Dizinin en buyuk elemanı = " + enbuyuk);
    }




    }

