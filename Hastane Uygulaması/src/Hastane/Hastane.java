package Hastane;

public class Hastane {

    int sira = 0; // dizinin sırası
    static Hasta[] hastalar; // hastaları burada tutacağız.

    public Hastane(int kapasite)
    {
        hastalar = new Hasta[kapasite];
    }

    public void hastaEkle(Hasta hastaKisi) {
        if (sira == hastalar.length) // limit dolduysa
        {
            System.out.println("Hastane dolu");
        } else {
            hastalar[sira] = hastaKisi;
            sira++;
            System.out.println("Hasta eklendi adı : " + hastaKisi.isim);
            System.out.println("Hastalığı : " + hastaKisi.hastalık);
        }
    }
    public static void main(String[] args) {
        Hasta hastaKisi = new Hasta("Hüseyin", "grip");
        Hastane LokmanHekimHastanesi = new Hastane(10);
        LokmanHekimHastanesi.hastaEkle(hastaKisi);
        }
    }