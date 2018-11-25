package javaapplication5; 
public class SuperKullanımı {
    public static void main(String[] args) {
         Kopek fino = new Kopek(); 
         Kedi boncuk = new Kedi(); 
    } 
} 
abstract class Hayvanlar
{
    String tur;
    int ayakSayisi;
    
    public Hayvanlar(String tur,int ayakSayisi){
        this.tur = tur;
        this.ayakSayisi = ayakSayisi;
    }
    //abstarct = kendisini extend edecek sınıfları aşağıdaki metodu yazmaya zorlar.
    abstract public void sesCikar();
}
class Kopek extends Hayvanlar
{    
    public Kopek()
    {
        super("Köpek",4);
        
        System.out.println(this.tur+" "+this.ayakSayisi);
        
        sesCikar();
    }
    @Override
    public void sesCikar() {
        System.out.println("HavHav");
    }   
}
class Kedi extends Hayvanlar
{
    public Kedi() {
        super("Kedi", 4);
        
        System.out.println(this.tur+" "+this.ayakSayisi);
        
        sesCikar();
    }   
    @Override
    public void sesCikar() {
        System.out.println("Miyav");
    }
}