package app2;
 
public class App2 { 
    public static void main(String[] args) {//Threadların kullanımı - 2
         Thread t1 = new Thread(new Runner());
         Thread t2 = new Thread(new Runner());
         t1.start(); 
         t2.start();
    } 
}
class Runner implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runner "+i);
        } 
    } 
}
