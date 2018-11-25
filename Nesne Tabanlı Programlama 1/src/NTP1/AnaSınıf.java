package NTP1;

public class AnaSınıf {

    public static void main(String[] args) {
        //Constructorlar nesne oluşturulurken bir defa çalıştırılır , programdaki başlangıç değerleri böyle belirlenebilir.
        
        Insan ali = new Insan();//Yine ilk constructor çalışır çünkü parametresi yoktur.
        System.out.println("Adı : " + ali.ad);//Classtaki değişkenleri nesneler yardımıyla kullanabiliriz.  
        
        System.out.println("");
        
        Insan veli = new Insan("Veli", 5);
        System.out.println("Adı : " + veli.ad + ", Yaşı : " + veli.yas);
        
        System.out.println("");
        
        Insan mehmet = new Insan(1324324535);
        //mehmet.tc ile mehmetin tc sine ulaşamazsınız çünkü private bir değişkene ancak kendi sınıfından ulaşılabilir.
        System.out.println("Mehmet'in TC si : "+mehmet.getTc());
        
        
    }
}
