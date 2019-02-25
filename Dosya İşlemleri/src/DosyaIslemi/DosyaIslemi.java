package DosyaIslemi;
 
import java.io.BufferedReader;
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException;
import java.io.PrintWriter;  
import java.util.Scanner;

public class DosyaIslemi {

    public static void main(String[] args)throws IOException{ 
        File klasor = new File("Dosyalar");
        if (!klasor.exists()) {
            klasor.mkdir();
            System.out.println("Klasör Oluşturuldu");
        }  
        File dosya1 = new File("C:\\Users\\PC\\Desktop\\Deneme0\\Dosyalar\\dosya1.txt");
        if (!dosya1.exists()) {
            dosya1.createNewFile();
            System.out.println("Dosya 1 Oluşturuldu.");
        }
        PrintWriter yaz = new PrintWriter(dosya1); //Dosyaya yazma 1. yol
            yaz.println("Yeni Bir Dosya"); 
            yaz.close(); 
            
        Scanner read = new Scanner(dosya1);// Dosyadakileri okuma 1. yol
            System.out.println(read.nextLine());
            read.close(); 
        
        FileReader okuAraci = new FileReader(dosya1);// Dosyadakileri okuma 2. yol
        BufferedReader oku = new BufferedReader(okuAraci);
            System.out.println(oku.readLine());
            oku.close();
    } 
}
