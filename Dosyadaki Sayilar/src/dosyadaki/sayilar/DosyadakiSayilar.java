package dosyadaki.sayilar;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class DosyadakiSayilar {
    public static void main(String[] args) {
        try {
            File dosya = new File("sayılar.txt");//sadece dosya adı girildiğinde proje dosyasının içinde oluşturur.

            if (!dosya.exists()) {
                dosya.createNewFile();
            }

            PrintWriter yaz = new PrintWriter(new FileOutputStream(dosya, false));// true yazıldığında önceki yazılanlar silinmez

            for (int i = 0; i < 6; i++) {
                yaz.println((int) (Math.random() * 10) + 1);
            }

            yaz.close();

            Scanner oku = new Scanner(dosya);

            int sayi = oku.nextInt();
            int toplam = 0;
            int enb = sayi;
            int enk = sayi;

            while (oku.hasNextInt()) {
                sayi = oku.nextInt();
                toplam += sayi;
                if (enb < sayi) {
                    enb = sayi;
                }
                if (enk > sayi) {
                    enk = sayi;
                }
            }

            oku.close();

            System.out.println("toplam : " + toplam + " en büyük : " + enb + " en küçük : " + enk + " ortalama : " + (toplam / 6));
        } catch (Exception e) {
            System.out.println("hata var ");
        }
    }
}