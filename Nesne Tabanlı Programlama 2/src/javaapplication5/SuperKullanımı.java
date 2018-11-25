package javaapplication5; 
public class SuperKullanımı {
    public static void main(String[] args) {
         Kopek fino = new Kopek();
    } 
} 
class Hayvanlar
{
    public void sesCikar()
    {
        System.out.println("Ses");
    }
}
class Kopek extends Hayvanlar
{
    @Override
    public void sesCikar()
    {
        System.out.println("HavHav");
    } 
    public Kopek()
    {
        super.sesCikar();//super metodu extend edilen sınıftaki metodu kasteder. 
        this.sesCikar();
    }
}