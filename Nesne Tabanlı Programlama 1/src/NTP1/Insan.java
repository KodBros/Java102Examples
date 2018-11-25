package NTP1;

public class Insan {

    String ad;
    int yas;
    String cinsiyet;
    private int tc;

    public Insan()// bu bir constructor (kurucu) metoddur. Program çalıştırıldığında çalışır.
    {
        this("Mehmet", 15, "Erkek");//bu şekilde kullandığımızda parametreli constructorumuza gider fakat bu kullanımda thisi constructorun ilk satırına yazmazsak hata alırız.
        System.out.println("");
        System.out.println("Programla birlikte çalıştı.");
        this.ad = "Ali";//this sözcüğü class ın en üstündeki değişkenle aynı isme sahip olan class içindeki değişkeni ayırt etmemizi sağlar.
        this.yas = 15;
    }

    public Insan(String ad, int yas, String cinsiyet) {
        this.ad = ad;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        System.out.println("Ad : " + this.ad + ", Yaş : " + this.yas + ", Cinsiyet : " + this.cinsiyet);
    }

    public Insan(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public Insan(int tc) {
        this.tc = tc;
    }

    public int getTc() {
        return tc;
    }

}
