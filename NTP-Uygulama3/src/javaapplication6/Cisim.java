package javaapplication6;
public abstract class Cisim {
    
    String ad;
    int kenarSayisi;
    
    abstract public void alanBul();
    abstract public void cevreBul();
    
    public static void main(String[] args) {
        Kare kare1 = new Kare("Kare",4,5);
        kare1.alanBul();
        kare1.cevreBul();
    }
}

class Kare extends Cisim
{  
    
    int kenarUzunluk;
    
    public Kare(String ad,int kenarSayisi,int kenarUzunluk)
    {
        this.ad = ad;
        this.kenarSayisi = kenarSayisi;
        this.kenarUzunluk = kenarUzunluk;
    }

    @Override
    public void alanBul() 
    {
        int alan = kenarUzunluk*kenarUzunluk;
        System.out.println("Alan : "+alan);
    }

    @Override
    public void cevreBul() 
    {
        int cevre = kenarSayisi*kenarUzunluk;
        System.out.println("Çevre : "+cevre);
    }
}