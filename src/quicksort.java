import java.util.Random;

public class quicksort {


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
            int gecici;
            for (int i = 0; i <= dizi.length - 1; i++)
            {
                for (int j = 1; j <= dizi.length - 1; j++)
                {
                    if (dizi[j - 1] > dizi[j])
                    {
                        gecici = dizi[j - 1];
                        dizi[j - 1] = dizi[j]; //Dizide elemanlar yer değiştirir yan tarafındakiyle gecici değişkeniyle
                        dizi[j] = gecici;
                    }
                }
            }

            for (int k = 0; k < dizi.length; k++) {
                System.out.print(dizi[k] + " ");//Dizimizi yazdırma
            }



        }







}

