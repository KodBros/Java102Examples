package javaapplication4;
public class Universite {
    
    Ogrenci [] dizi;
    int i = 0;
    public Universite(int k)
    {
        dizi = new Ogrenci[k];
    }
    
    public void kayit(Ogrenci ogrenci)
    {
        dizi [i] = ogrenci;
        i++;
    }
     
    public void goster()
    {
        for (int j = 0; j < i; j++)
        {
            System.out.println(dizi[j].ad+" "+dizi[j].no+" "+dizi[j].getTc());
        }
    }
    
    public static void main(String[] args) {
        Ogrenci ahmet = new Ogrenci("Ahmet",123,12345678911L);
        Universite firat = new Universite(20);
        firat.kayit(ahmet);
        firat.goster();
        
    }
}