package javaapplication4;

public class Ogrenci {
    String ad;
    int no;
    private long tc;
    public Ogrenci(String ad,int no,long tc)
    {
        this.ad = ad;
        this.no = no;
        String yeniTc = String.valueOf(tc);
        if (yeniTc.length()==11 ) {
            this.tc=tc;
        }
        else{
            System.out.println("Tc 11 haneli olmalı");
        }
        
    }
    public long getTc()
    {
        return this.tc;
    }
}
