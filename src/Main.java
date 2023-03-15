import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rastgele = new Random();//Random sınıfını ekleme

        int[] dizi = new int[10000];//dizimizin boyutunu belirleme

        for (int x = 0; x < dizi.length; x++) {
            int rastgeleSayi = rastgele.nextInt(10000) + 1;//Dizimizin icine random olarak 10000veri atma
            dizi[x] = rastgeleSayi;
        }


        for(int k=0;k<dizi.length;k++){
            System.out.print(dizi[k]+" ");//Dizimizi yazdırma
        }

        System.out.println("\n\n");




//Dizimizi Kücükten Büyüğe Sıramalama
        //Selectionsort ile
for(int i=0;i<dizi.length;i++){
int index=i;
    for (int j = i + 1; j < dizi.length; j++){
        if (dizi[j] < dizi[index]){//dixedeki elemanla yanındaki elemana bakma büyüklük kücüklüğünü kontrol etme
            index = j;
        }
    }
    int kucuksayi = dizi[index];
    dizi[index] = dizi[i];//Kücük sayıyla büyük sayının yerini değiştirme
    dizi[i] = kucuksayi;
}



for(int k=0;k<dizi.length;k++){
    System.out.print(dizi[k]+" ");
}



    }



    }

