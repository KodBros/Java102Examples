package Hastane;
public class Hastane {
    // bu da bir hastane sınıfı. hastaları burda tutacağız.
    // kaydı da burada yapacağız 
    int sira = 0; // dizinin sırası
    Hasta [] hastalar; // hastaları burada tutacağız.

    public Hastane(int kapasite) {
        this.hastalar = new Hasta[kapasite];

    }
    public void hastaEkle(Hasta h){
        if(this.sira == this.hastalar.length) // limit dolduysa
        {
            System.out.println("Hastane dolu");
        }
        else
        {
            this.hastalar[this.sira] = h;
            this.sira++;
            System.out.println("Hasta eklendi adı : "+h.isim);
            System.out.println("Hastalığı : "+h.hastalık);
        }
    }
    public static void main(String[] args) {
        Hasta hastaKisi = new Hasta("Hüseyin","grip"); 
        Hastane LokmanHekimHastanesi = new Hastane(10);
        LokmanHekimHastanesi.hastaEkle(hastaKisi);
    }
}