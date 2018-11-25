package nesnetabanlıprogramlama.pkg2;

public class NesneTabanlıProgramlama2 {

    //Super sözcüğünün iki kullanımını göreceğiz.
    public static void main(String[] args) {
        Insanlar ahmet = new Insanlar(2);
    }
}

abstract class Canlılar//abstract yazmamızın sebebi bunun soyut bir sınıf olmasından dolayıdır
{                     // soyut sınıflar içinde abstract metod dediğimiz soyut metodları bulundurur. 
    //  Bu metodlar bu sınıftan extend edilmiş metodlarda kullanılması zorunlu kılınan metodlardır

    int ayakSayisi;

    public Canlılar(int ayakSayisi, String tur) {
        System.out.println(tur + " " + ayakSayisi + " ayaklıdır.");
    }

    public Canlılar() {
        System.out.println(this.ayakSayisi);//Insanlar ın kurucu metodunda super.ayakSayisi olarak belirlediğimiz ayak sayısıdır.
    }

    abstract void sesCikar();// Bu bir soyut metoddur ve ana sınıfa yazılır içine bişey yazılmaz ; ile kapatılır.
                             // Bu sınıftan obje oluşturulurken bu metodu orda oluştururuz.
    void info() {
        System.out.println("Canlılar hakkında bilgi.");
    }

}

class Insanlar extends Canlılar {

    int ayakSayisi;

    public Insanlar(int ayakSayisi) {
        super.ayakSayisi = ayakSayisi;//eğer bu şekilde kullanırsak extend edilen sınıfın ayakSayisi değişkenine değer atarız. 
        this.ayakSayisi = ayakSayisi;//eğer bu şekilde kullanırsak bu sınıfın ayakSayisi değişkenine değer atarız.

        super.info();//canlılar sınıfındaki info metodu çalıştırılır.
        this.info();// bu sınıftaki info metodu çalıştırılır.
        
    }

    @Override
    void sesCikar() {
        System.out.println("Merhaba.");
    }

    @Override
    void info() {
        System.out.println("İnsanlar hakkında bilgi.");
    }
}

class Kurt extends Canlılar {

    public Kurt(int ayakSayisi) {
        //super(); yazarsakta hata alırız çünkü alttakinin başa yazılması gerektiğinden dolayı çelişki oluşur. O yüzden bir kurucu metodda bir tane super() metodu kullanılmalı.
        super(4, "Kurt");//Eğer bu şekilde kullanırsak extend edilen kurucu metodun parametreli olanını çalıştırır.
        //this(4); bu şekilde kulanım hata verir çünkü iki kullanımdada bu kullanımlar başa yazılmalıdır. Çelişki oluşur.
    }

    @Override
    void sesCikar() {
        System.out.println("uluma sesi :D");
    }
}
