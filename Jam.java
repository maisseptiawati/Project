/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w7;

/**
 *
 * @author Ma'is
 */
public class Jam {
   int hh, mm, dd;

    public Jam() {
    }

    public Jam(int hh, int mm, int dd) {
        this.hh = hh;
        this.mm = mm;
        this.dd = dd;
    }

    public int getHh() {
        return hh;
    }

    public void setHh(int hh) {
        this.hh = hh;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }
   
    
   int convertJamToMenit(int jam){
       int menit;
       menit = jam * 60;
       return menit ;
   }
   
   int convertJamToDetikt(int jam){
       int detik;
       detik = jam * 3600;
       return detik ;
}
   int convertMenitToDetik(int menit){
       int detik;
       detik = menit * 60;
       return detik;
   }
   
   int convertDetikToMenit(int detik){
       double menit;
       menit = detik / 60;
       return detik;
   }
}