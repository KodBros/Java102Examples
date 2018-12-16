package app1;

public class App1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("İlk kullanım "+getName());
        } 
    } 
    
    public static void main(String[] args) { 
         App1 a = new App1();
         a.start();
         
         App1 b = new App1(); 
         b.start();  
    }
}  
